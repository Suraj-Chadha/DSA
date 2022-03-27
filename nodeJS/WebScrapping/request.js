const request = require("request");

request("https://www.worldometers.info/coronavirus/", cb);
console.log("before"); // asynchronous
function cb(err,res,body){
    console.error("error: ", err);
    // console.log(res);
    // console.log(body);
}
console.log("after"); // asynchronous doesn't wait for request to complete, will print after first and then print request response result


