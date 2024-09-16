const express=require('express');
const app=express(); 

const bodyParser = require('body-parser');

app.use(express.json());

app.use(bodyParser.urlencoded({ extended: false }));

app.get("/home",(req,res,next)=>{
    console.log("hello")
    next();
},(req,res)=>{
    res.send("Hello from")
}
)

app.listen(3000,(req,res)=>{
    console.log('server started');
});