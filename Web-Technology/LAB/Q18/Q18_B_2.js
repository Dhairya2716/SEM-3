const http = require('http')

const port = 3000

const server =  http.createServer((req,res) => {
    if(req.url == "/home"){
        res.statusCode = 200;
        res.end("Welcome to Home Page");
    }
    else if(req.url == "/contact"){
        res.statusCode = 200;
        res.end("phone number is 123456789");
    }
    else if(req.url == "/about"){
        res.statusCode = 200;
        res.end("Welcome to my about");
    }
    else{
        res.statusCode = 404;
        res.end("404 Not Found");
    }
})

server.listen(port,()=>{
    console.log(`server starting - ${port}`);
})