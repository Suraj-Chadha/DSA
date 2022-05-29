let fs = require("fs");
let zoomLinks = fs.readFileSync("zoom.txt","utf-8");
console.log(zoomLinks);
let zoomArr = zoomLinks.split('\n');
// console.log(zoomArr);
module.export={
    zoomArr:zoomArr
}