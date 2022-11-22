import {Controller, Get, Query} from '@nestjs/common';

@Controller()
export class AppController {
  @Get('/v1/benchmark')
  async getHello(@Query('delay')delay: number) {
    await new Promise((resolve) => setTimeout(resolve, delay));
    return '';
  }
}
