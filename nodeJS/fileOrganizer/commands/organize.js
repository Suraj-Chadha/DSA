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
        srcPath = process.cwd();
        // console.log(srcPath);
    }
    let OrganizedFiles = path.join(srcPath, "organized_files");
    if(!fs.existsSync(OrganizedFiles)){
        fs.mkdirSync(OrganizedFiles);
    }
    let allFiles = fs.readdirSync(srcPath);
    // console.log(allFiles);
    for(let i = 0; i < allFiles.length; i++){
        let fullPathOfFile = path.join(srcPath, allFiles[i]);
        let isFile = fs.lstatSync(fullPathOfFile).isFile();
       // console.log(allFiles[i] + "------>" + isFile);
       if(isFile){
           let ext = path.extname(allFiles[i]).split(".")[1];
           console.log(ext);
            let folderName = getFolderName(ext);
            copySrcToDest(srcPath, fullPathOfFile, folderName);
            // console.log(folderName);
       }

    }
   
}
function getFolderName(ext){
    for(key in types){
        for(let i = 0; i < types[key].length; i++){
            // console.log("----->"+types[key][i]);
            if(types[key][i] == ext){
                return key;
            }
        }
    }
    
}
function copySrcToDest(srcPath, fullPathOfFile, folderName){
    let destinationFolder = path.join(srcPath, "organized_files", folderName);
    // console.log(destinationFolder);
    if(!fs.existsSync(destinationFolder)){
        fs.mkdirSync(destinationFolder);
    }
    let basenamesrcpath = path.basename(fullPathOfFile);
    let destinationFullPath = path.join(destinationFolder, basenamesrcpath);
    fs.copyFileSync(fullPathOfFile, destinationFullPath);
}


let srcPath = "/home/beast007/PepCoding/DSA-and-Dev/nodeJS/fileOrganizer/downloads";
organize(srcPath);