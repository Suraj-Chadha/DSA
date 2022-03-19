let inputArr = process.argv.slice(2);
let command = inputArr[0];
let path = inputArr[1];
const organizedFunc = require("./commands/organize");
const helpFunc = require("./commands/help");
const printTree = require("./commands/tree");

switch(command){
    case "help":
        // console.log("help function called and executed succesfully on path " + path);
        helpFunc.help();
        break;
    case "organize":
        // console.log("organizer function called and executed succesfully on path " + path);
        organizedFunc.organize(path);
        break;
    case "tree":
        // console.log("tree function called and executed succesfully on path " + path);
        printTree.tree(path);
        break;
    default:
        console.log("command not recogonized");
        break;
}