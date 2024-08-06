const express = require('express')
const fs = require('fs')
const app = express()

const port = 3000

app.get("/",(req,res) => {
    fs.readFile('about.txt',(err,data) => {
        if(err) throw(err)
        res.write(data);
        return res.send();
    })
})

app.get("/contact",(req,res) => {
    fs.readFile('contact.txt',(err,data) => {
        if(err) throw(err)
        res.write(data);
        return res.send();
    }) 
})

app.listen(port, () => {
    console.log("Server started at 3000")
})