let clargs = process.argv;
let n = parseInt(clargs[2]);

for(let i = 1; i <= n; i++){
    let str = "";
    for(let j = 0; j < i; j++){
        str+="*\t";
    }
    console.log(str);
}