// npm install minimist
let parser = require('minimist');
let args = parser(process.argv);
// console.log(args);
// console.log(args.x+args.y);

// node firstModule.js --name="PepCoding" --age=45

if(args.age > 30){
    console.log("hello " + args.name+" . Go Home")
}else{
    console.log("heya " + args.name+" . Where's the party tonight");
}
