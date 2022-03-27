// let url = "https://www.espncricinfo.com/series/ipl-2020-21-1210595";

const request = require("request");
const cheerio = require("cheerio");

function getInfoForScorecard(url){
    // console.log(url);
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
        let desc = selectTool('.match-header-info.match-info-MATCH');
        console.log(desc.text());
        let descArr = desc.text().split(",");
        // console.log(descArr);
        let venueOfMatch = descArr[1];
        let dateOfMatch = descArr[2];
        console.log(venueOfMatch);
        console.log(dateOfMatch);
        let matchResEle = selectTool('.match-info.match-info-MATCH.match-info-MATCH-half-width > .status-text');
        console.log(matchResEle.text());
        let teamNames = selectTool('.name-detail >.name-link');
        let team1 = selectTool(teamNames[0]).text();
        let team2 = selectTool(teamNames[1]).text();
        console.log(team1);
        console.log(team2);
        // let allBatsMenRows = selectTool('.table.batsman tbody>tr');
        let allBatsMenTable = selectTool('.table.batsman tbody');
        console.log(allBatsMenTable.length);
        let htmlString = "";
        for(let i = 0; i <allBatsMenTable.length;i++){
            
        }
    }

module.exports = {
  gifs: getInfoForScorecard,
}