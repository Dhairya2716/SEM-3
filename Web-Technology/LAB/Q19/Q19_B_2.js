const express = require('express')

const app = express()

app.get('/',(req,res) => {
    res.send("Hello world printing");
})

app.get('/home',(req,res) => {
    res.send("Welcom to home");
})

app.get('/about',(req,res) => {
    res.send("About me ");
})

app.get('/contact',(req,res) => {
    res.send("+91 123456789");
})

app.get('/web',(req,res) => {
    res.send("Who the hell are you stop accessing my site GO AWAY!!!");
})

app.listen(1216, () => {
    console.log("Server started at 1216")
})