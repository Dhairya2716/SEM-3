const express = require('express')

const app = express()

const arr = [
    {
        id: 1,
        name: "Arjun Sir",
        age: 150
    },
    {
        id: 2,
        name: "Karan",
        age: 100
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

app.post('/about/:id', (req, res) => {
    const newObject = {
      id: req.params.id,
      name: req.body.name,
      age: req.body.age
    };
    arr.push(newObject);
    res.json(newObject);
  });
  

app.patch('/home/:id',(req,res)=>{
    const idtoupdate = arr.find((ar)=>{
        if(ar.id==req.params.id){
            return true;
        }
    })
})

app.listen(3000,()=>{
    console.log("server started");
})