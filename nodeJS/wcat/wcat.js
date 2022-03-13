const fs = require("fs");
let inputArr = process.argv.slice(2);
// let fileArr = [...inputArr];
// for(let i = 0; i < inputArr.length; i++){
//     fileArr.push(inputArr[i]);
// }
let optionsArr = [];
let fileArr = [];
for(let i = 0; i < inputArr.length; i++){
    if(inputArr[i].charAt(0) == "-"){
        optionsArr.push(inputArr[i]);
    }
    else{
        fileArr.push(inputArr[i]);
    }
}

for(let i = 0; i < fileArr.length;i++){
    let fileExist = fs.existsSync(fileArr[i]);
    if(!fileExist){
        console.log("One or more file(s) does not exist");
        // return;
        process.exit();
    }
}

//print the contemt of file and append it

let content = "";
for(let i = 0; i < fileArr.length; i++){
    let fileContent = fs.readFileSync(fileArr[i]);
    content+=fileContent+"\n";
}
console.log(content);


// let isCPresent = optionsArr.includes("-c"){
//     fs.appendFileSync(fileArr[0],"");
// }




let ContentArr = content.split("\n");


let isSPresent = optionsArr.includes("-s");
// console.table(ContentArr);
if(isSPresent){
    for(let i = 1; i < ContentArr.length; i++){
        if(ContentArr[i] == "" && (ContentArr[i-1] == "" || ContentArr[i-1]==null)){
            ContentArr[i] = null;
        }
    }
}
// console.table(ContentArr);

//remove null

let tempArr = [];
for(let i = 0; i < ContentArr.length; i++){
    if(ContentArr[i] != null){
        tempArr.push(ContentArr[i]);
    }
}
// console.table(tempArr);
ContentArr = tempArr;

let finalOption = "";
let indexOfN = optionsArr.indexOf("-n");
let indexOfB = optionsArr.indexOf("-b");
if(indexOfB != -1 && indexOfN != -1){
    if(indexOfB > indexOfN){
        finalOption = "-n";
    }else{
        finalOption = "-b";
    }
}else{
    if(indexOfB!=-1){
        finalOption = "-b";
    }else if(indexOfN != -1){
        finalOption = "-n";
    }
}
if(finalOption == '-n'){
    ModifyContentByN();
}else if(finalOption == '-b'){
    ModifyContentByB();
}

function ModifyContentByB(){
    let num = 1;
    for(let i = 0; i < ContentArr.length;i++){
        if(ContentArr[i] != ''){
            ContentArr[i] = num+") "+ContentArr[i];
            num++;
        }
    }
}
function ModifyContentByN(){
    let num = 1;
    for(let i = 0; i < ContentArr.length; i++){
        ContentArr[i] = num+") "+ContentArr[i];
        num++;
    }
}
console.log(ContentArr);