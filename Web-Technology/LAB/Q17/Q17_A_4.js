const child_process = require("child_process");


child_process.exec("hello.java", (err, stdout, stdin) => {
  console.log('err');
});
