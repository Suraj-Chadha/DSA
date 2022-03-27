const request = require("request");
const cheerio = require("cheerio");
const {gifs} = require("./ScoreCard");
function getAllMatch(url){
    // console.log(url);
    request(url,cb);
}
function cb(err,res,body){
    if(err){
        console.error("error: ", err);
    }else{
        getAllScoreCardLink(body); 
    }
}
function getAllScoreCardLink(html){
    let selecTools = cheerio.load(html);
    let ScoreCardLinkArr = selecTools('a[data-hover="Scorecard"]');
    for(let i = 0; i < ScoreCardLinkArr.length; i++){
        let relativeLink = selecTools(ScoreCardLinkArr[i]).attr("href");
        let fullPath = "https://www.espncricinfo.com" + relativeLink;
        // console.log(fullPath);
        gifs(fullPath);
        // break;
    }
}

module.exports = {
    getAllMatch:getAllMatch
}