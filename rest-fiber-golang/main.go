package main

import (
	"github.com/gofiber/fiber/v2"
	"time"
)

func main() {
	app := fiber.New(fiber.Config{
		Prefork:      false, // doesn't run on docker even after following steps from https://docs.gofiber.io/api/fiber
		ServerHeader: "Fiber",
		AppName:      "Benchmark App",
	})
	app.Get("/v1/benchmark", func(c *fiber.Ctx) error {
		var delay, _ = time.ParseDuration(c.Query("delay") + "ms")
		time.Sleep(delay)

		return c.SendString(c.Query("delay"))
	})

	app.Listen(":3000")
}
