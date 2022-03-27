// let url = "https://www.espncricinfo.com/series/ipl-2020-21-1210595";

const request = require("request");
const cheerio = require("cheerio");
const {gifs} = require("./scorecard");
function getAllMatch(url){
    request(url,cb);
}

function cb(err,res,body){
    if(err){
        console.error("error: ",err);
    }else{
        handleHtml(body);
    }
}

function handleHtml(html){
    let selectTool = cheerio.load(html);
    let scoreCardElementArr = selectTool('a[data-hover="Scorecard"]');
    // console.log(scoreCardElementArr[1].attribs["href"]);
    for(let i = 0; i < scoreCardElementArr.length; i++){
        let relativeLink = selectTool(scoreCardElementArr[i]).attr("href");
        let fullLink = "https://www.espncricinfo.com" + relativeLink;
        // console.log(i+""+ gifs(fullLink));
        gifs(fullLink);
        break;

    }
    // let relativeLink = anchorEle.attr("href");
    // console.log(relativeLink);

    // let nextPage = "https://www.espncricinfo.com" + relativeLink;
    // console.log(nextPage);
}

module.exports = {
    getAllMatch: getAllMatch,
}