const minimist = require("minimist");
let args = minimist(process.argv);
if(args.age > 30){
    console.log(args.name+" waah bhai");
}else{
    console.log(args.name+" kya bhai");
}