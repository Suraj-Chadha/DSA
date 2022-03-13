const fs = require("fs"); // fs module
const path = require("path"); // path module

let types = {
    media: ["mp4", "mkv", "mp3"],
    archives: ['zip', '7z', 'rar', 'tar', 'gz', 'ar', 'iso', "xz"],
    documents: ['docx', 'doc', 'pdf', 'xlsx', 'xls', 'odt', 'ods', 'odp', 'odg', 'odf', 'txt', 'ps', 'tex'],
    app: ['exe', 'dmg', 'pkg', "deb"],
    images: ['png','jpg','jpeg']
}

function organize(srcPath){
    if(srcPath == undefined){
        srcPath = process.cwd(); // gives us current working directory
        console.log(srcPath);
    }
    let organizedFiles = path.join(srcPath, "organized_files");
    if(!fs.existsSync(organizedFiles)){
        fs.mkdirSync(organizedFiles);
    }
    else{
        console.log("file already exists");
    }
}
organize();