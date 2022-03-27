const request = require("request");
const cheerio = require("cheerio");
const path = require("path");
const fs = require("fs");
const xlsx = require("xlsx");

function getInfoFromScoreCard(url){
    // console.log(url);
    request(url,cb);
}
function cb(err,res,body){
    if(err){
        console.error(err);
    }else{
        getScoreInfo(body);
    }
}
function getScoreInfo(html){
    let selecTools = cheerio.load(html);
    let desc = selecTools('.match-header-info.match-info-MATCH');
    // console.log(desc);
    let descArr = desc.text().split(",");
    let venueName = descArr[1];
    let dateOfMatch = descArr[2];
    console.log(venueName);
    console.log(dateOfMatch);
    let selMatchResult = selecTools('.match-info.match-info-MATCH.match-info-MATCH-half-width>.status-text');
    // console.log(matchResult.text());
    //console.log(desc.text());
    let matchResult = selMatchResult.text();
    let teamsName = selecTools('.name-link>.name');
    let team1 = selecTools(teamsName[0]).text();
    let team2 = selecTools(teamsName[1]).text();
    console.log(team1 + " vs " + team2);
    let AllBatsmenRow = selecTools('.table.batsman>tbody');
    // console.log(AllBatsmenRow.text());
    // let test = selecTools(AllBatsmenRow[1]).find("tr");
    // let htmlString = "";
    for(let i = 0; i < AllBatsmenRow.length; i++){
        // htmlString+=selecTools(AllBatsmenRow[i]).html(); 
        let allRows = selecTools(AllBatsmenRow[i]).find("tr");
        for(let i = 0; i < allRows.length; i++){
            let firstColInRow = selecTools(allRows[i]).find("td")[0];
            // console.log(firstColInRow.length);
            // console.log(selecTools(allRows[i]).text());
            if(selecTools(firstColInRow).hasClass("batsman-cell")){
            let playerName = selecTools(firstColInRow).text();
            // console.log(playerName);
            let runs = selecTools(selecTools(allRows[i]).find("td")[2]).text();
            let balls = selecTools(selecTools(allRows[i]).find("td")[3]).text();
            let numberOF4 = selecTools(selecTools(allRows[i]).find("td")[5]).text();
            let numberOf6 = selecTools(selecTools(allRows[i]).find("td")[6]).text();
            let sr = selecTools(selecTools(allRows[i]).find("td")[7]).text();
            // console.log();
            // console.log(playerName + "-->" + runs);
            processInformation(dateOfMatch, venueName, matchResult,team1,team2,playerName,runs,balls,numberOF4,numberOf6,sr)

            }
            // break;
            // break;
            // if(selecTools(firstColInRow).hasClass("batsman-cell")){
            //     console.log(selecTools(rows).text());
            // }

        }

    }
    function processInformation(dateOfMatch, venueName, matchResult,team1,team2,playerName,runs,balls,numberOF4,numberOf6,sr){
        let teamNamePath = path.join(__dirname,"IPL",team1);
        if(!fs.existsSync(teamNamePath)){
            fs.mkdirSync(teamNamePath);
        }
        let playerPath = path.join(teamNamePath,playerName+".xlsx");
        let content = excelReader(playerPath,playerName);
        let playerObj = {
                dateOfMatch,
                venueName,
                matchResult,
                team1,
                team2,
                playerName,
                runs,
                balls,
               numberOF4,
                numberOf6,
                sr
        };
        content.push(playerObj);
        excelWriter(playerPath,content,playerName);

    }
    function excelReader(playerPath,playerName){
        if(!fs.existsSync(playerPath)){
            return [];
        }
        let workBook = xlsx.readFile(playerPath);
        let excelData = workBook.Sheets[playerName];
        let playerObjArr = xlsx.utils.sheet_to_json(excelData);
        // console.log(playerObjArr);
        return playerObjArr;
        
    }
    function excelWriter(playerPath,jsObject,sheetName){
        let newWorkBook = xlsx.utils.book_new();
        let newWorkSheet = xlsx.utils.json_to_sheet(jsObject);
        xlsx.utils.book_append_sheet(newWorkBook,newWorkSheet,sheetName);
        xlsx.writeFile(newWorkBook,playerPath);
    }
    // console.log(htmlString);
}

module.exports = {
    gifs:getInfoFromScoreCard,
}