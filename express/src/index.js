const express = require('express')
const app = express()

app.get('/v1/benchmark',  (req, res) => {
    setTimeout(()=>{
        res.send("")
    },req.query.delay)
})

app.listen(3000)