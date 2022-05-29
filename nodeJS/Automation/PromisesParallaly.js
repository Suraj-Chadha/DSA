const fs = require("fs");
let readf1File = fs.promises.readFile("f1.txt");
readf1File.then(function(res){
    console.log(res+"");
})
let readf2File = fs.promises.readFile("f2.txt");
readf2File.then(function(res){
    console.log(res+"");
})

let readf3File = fs.promises.readFile("f3.txt");
readf3File.then(function(res){
    console.log(res+"");
})