const express = require('express')
const app = express()

const bodyParser = require('body-parser');

app.use(express.json());

app.use(bodyParser.urlencoded({ extended: false }));

app.use(function(req,res,next){
    res.send("hello");
})

app.get('/',function(req,res){
    res.send("welcome")
})

app.listen(3000,()=>{
    console.log("server started")
})