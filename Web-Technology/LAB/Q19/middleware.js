const express = require('express')

const app = express()

const demo = (req,res,next) => {
    console.log('msg')
    next()
}

app.use('/xyz',demo)

app.get('/',(req,res) => {
    res.send('Hello World!')
})

app.get('/home',(req,res) => {
    res.send('Welcome Home')
})

app.get('/xyz',(req,res) => {
    res.send('Hello')
})

app.get('/xyz/abc',(req,res) => {
    res.send('Welcome to path')
})

app.listen(3000,() => {
    console.log('Server is running on port 3000')
})