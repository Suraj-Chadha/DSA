let puppeteer = require("puppeteer");
let cTab;
let url = "https://zoom.us/rec/share/9EB7g7MEL4fcJDxVLFUJNDASoC0n8THqSTgfilFCSTXRLXmw7k0a2x4mu2kMOt2n.zX4iIydoIUknR9UG";
let browserOpen = puppeteer.launch({
    product:"firefox",
    headless:false,
    defaultViewport:null,
})
browserOpen.then(function(browser){
    // console.log("Opened up");
    let pagesArr = browser.pages();
    return pagesArr;
})
.then(function(pagesArr){
    cTab =  pagesArr[0];
    let openZoom = cTab.goto(url);
    return openZoom;
})
.then(function(){
    // console.log("able to follow");
    // let videoClick = cTab.click('video-js vjs-controls-enabled vjs-workinghover vjs-v7 vjs_video_3-dimensions vjs-has-started vjs-paused vjs-user-inactive');
    let videoClick = cTab.click("vjs_video_3_html5_api");
    return videoClick;
})
.then(function(){
    console.log("is it done ?");
})