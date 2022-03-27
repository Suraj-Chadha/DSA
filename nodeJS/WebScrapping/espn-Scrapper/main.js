let url = "https://www.espncricinfo.com/series/ipl-2020-21-1210595";

const request = require("request");
const cheerio = require("cheerio");
const allMatchObj = require("./allMatch");

request(url,cb);

function cb(err,res,body){
    if(err){
        console.error("error: ",err);
    }else{
        handleHtml(body);
    }
}
function handleHtml(html){
    let selectTool = cheerio.load(html);
    let anchorEle = selectTool('a[data-hover="View All Results"]');
    // console.log(anchorEle.html());// research
    let relativeLink = anchorEle.attr("href");
    // console.log(relativeLink);
   

    let fullLink = "https://www.espncricinfo.com" + relativeLink;
    // console.log(fullLink);
    allMatchObj.getAllMatch(fullLink);
}