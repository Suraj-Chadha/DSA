const fs = require("fs");
let ret = fs.appendFileSync("random","hi random ");
// console.log(ret);

// let str = fs.readFileSync("random");
// console.log(fs);

const reqtest = require("../JS/testRequire");
// console.log(reqtest.add(2,3));
console.log(reqtest);