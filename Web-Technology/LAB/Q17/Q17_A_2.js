const path = require('path');

const ans = path.normalize('/foo/abc');
console.log(ans);

const ans1 = path.join('/fpp','bar');
console.log(ans1)

const ans2 = path.resolve('/fpp','bar');
console.log(ans2)

const ans3 = path.relative('/bar/sdasd','/bar/sdgs');
console.log(ans3)

const ans4 = path.dirname('bar/abc.txt');
console.log(ans4)

const ans5 = path.basename('bar/abc.txt');
console.log(ans5)

const ans6 = path.extname('/bar/abc.txt');
console.log(ans6)