const fs = require('fs');

fs.exists('Lab17_2.js', e => console.log(e));

fs.stat('Lab17_2.js', (err,data) => console.log(data));

fs.unlink('demo.txt',(err)=> {
    if(err){
        throw err;
    }
    console.log('File deleted');
})

fs.rename('Hello.js','Hello_W.js',(err)=>{
    if(err) throw err;
    console.log("File renamed")
})

fs.readFile('Lab17_2.js',(err,data)=> console.log(data.toString()))


let data = "Hello world from node";
fs.writeFile('Hell.txt',data,(err)=>{
    if(err) throw err;
    console.log("Complete")
})


fs.appendFile('Hell.txt','Arjun Bala',(err,data)=>{
    if(err) throw err;
    console.log("Append done");
});