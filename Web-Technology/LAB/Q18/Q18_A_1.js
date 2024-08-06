const http = require('http')

const port = 3000

const server =  http.createServer((req,res) => {
    res.write("Hello");
    res.write("\n");
    res.write("World");
    res.end();
})

server.listen(port,()=>{
    console.log(`server starting - ${port}`);
})