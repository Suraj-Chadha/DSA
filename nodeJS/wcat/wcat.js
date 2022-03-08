const fs = require("fs");
let inputArr = process.argv.slice(2);
let fileArr = [...inputArr];
// for(let i = 0; i < inputArr.length; i++){
//     fileArr.push(inputArr[i]);
// }

for(let i = 0; i < fileArr.length;i++){
    let fileExist = fs.existsSync(fileArr[i]);
    if(!fileExist){
        console.log("file does not exist");
        return;
    }
}

//print the contemt of file and append it

let content = "";
for(let i = 0; i < fileArr.length; i++){
    let fileContent = fs.readFileSync(fileArr[i]);
    content+=fileContent+"\n";
}
console.log(content);