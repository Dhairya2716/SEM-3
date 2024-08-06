const express = require('express')

const app = express()

const arr = [
    {
        id: 1,
        name: "Arjun Sir",
        age: 72
    },
    {
        id: 2,
        name: "Karan",
        age: 18
    },
    {
        id: 3,
        name: "Kalp",
        age: 18
    },
    {
        id: 4,
        name: "varun",
        age: 30
    },
]

app.get('/home',(req,res) => {
    res.json(arr);
})

app.get('/home/:id',(req,res) => {
    res.send(arr.find((e) => {
        if(e.id == req.params.id){
            return e;
        }
    }));
});

app.listen(3000,()=>{
    console.log("server started");
})