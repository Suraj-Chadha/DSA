const fs = require("fs");

let file1WillBeRead = fs.promises.readFile("f1.txt");
file1WillBeRead
    .then(readFile2)
    .then(readFile3)
    .then(allDone)
    .catch(function(err){
        console.log(err);
    })
function readFile2(res){
    console.log(res+"");
    let file2WillBeRead = fs.promises.readFile("f2.txt");
    return file2WillBeRead;
}
function readFile3(res){
    console.log(res+"");
    let file3WillBeRead = fs.promises.readFile("f3.txt");
    return file3WillBeRead;
}
function allDone(res){
    console.log(res+"");
    console.log("all done boss");
}