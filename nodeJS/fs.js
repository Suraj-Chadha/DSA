const fs = require("fs");

fs.appendFileSync("f3.txt","I am testing fs module\n");
console.log(fs.readFileSync("f3.txt","utf-8"));

let data = fs.existsSync("f2.txt");
console.log(data);
// console.log(fs);
// const test = require("./test");
// console.log(test);
