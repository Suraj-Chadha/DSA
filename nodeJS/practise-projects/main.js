const request = require("request");
const cheerio = require("cheerio");
const fs = require("fs");
const path = require("path");
const {getAllMatch} = require("./getAllMatch");
let url = "https://www.espncricinfo.com/series/ipl-2020-21-1210595/";

request(url,cb);

function cb(err,res,body){
    if(err){
        console.error("error: ", err);
    }else{
        handleHtml(body);
        // console.log(body);0
    }
}
let iplPath = path.join(__dirname,"IPL");
if(!fs.existsSync(iplPath)){
    fs.mkdirSync(iplPath);
}
function handleHtml(html){
    let selecTools = cheerio.load(html);
    // console.log(selecTools.html());
    let anchorEle = selecTools('a[data-hover="View All Results"]');
    // console.log(anchorEle);
    let relativeLink = anchorEle.attr("href");
    // console.log(relativeLink);
    let fullLink = "https://www.espncricinfo.com" + relativeLink;
    // console.log(fullLink);
    getAllMatch(fullLink);
}