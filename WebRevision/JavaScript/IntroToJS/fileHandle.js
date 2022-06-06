const fs = require("fs");
const minimist = require("minimist");

const args = minimist(process.argv);

// node fileHandle.js --source="f1.txt" --dest="f2.txt"
let contentF1 = fs.readFileSync(args.source,"utf-8");
let modifiedContent = contentF1.toUpperCase();
// console.log(modifiedContent);
fs.writeFileSync(args.dest,modifiedContent);