let inputArr = process.argv.slice(2);
let command = inputArr[0];
let path = inputArr[1];
const helpFunc = require("./commands/help");

switch(command){
    case "help":
        // console.log("help function called and executed succesfully on path " + path);
        helpFunc.help();
        break;
    case "organizer":
        console.log("organizer function called and executed succesfully on path " + path);
        break;
    case "tree":
        console.log("tree function called and executed succesfully on path " + path);
        break;
    default:
        console.log("command not recogonized");
        break;
}