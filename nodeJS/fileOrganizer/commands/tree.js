const fs = require("fs");
const path = require("path");

function tree(srcPath){
    if(srcPath == undefined){
        srcPath = process.cwd();
    }
    // console.log(srcPath);
    let dirData = fs.readdirSync(srcPath);
    // console.log(dirData);
    printTree(srcPath,dirData, 0);
}
function printTree(srcPath, dirData, idx){  
    //base condition
    if(idx == dirData.length){
        return;
    }
    let fullPathOfFile = path.join(srcPath, dirData[idx]);
    // console.log(fullPathOfFile);
    let isDir = fs.lstatSync(fullPathOfFile).isDirectory();
    console.log(dirData[idx]); // mywork

    // faith --- > if it is a directory then print all the files in it
    if(isDir){
        let dir = fs.readdirSync(fullPathOfFile);
        printTree(fullPathOfFile, dir, 0);
    }
    // recursive call for next element in the array
    printTree(srcPath, dirData, idx+1);
}
module.exports = {
    tree:tree,
}

// let srcPath = "/home/beast007/PepCoding/DSA-and-Dev/nodeJS/fileOrganizer/downloads";
// tree(srcPath);