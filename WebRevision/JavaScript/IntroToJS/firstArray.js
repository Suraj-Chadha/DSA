let clargs = process.argv; // process.argv --> command line ke arguments ... alternative --> minimist
// console.log(clargs[1]);
let n = parseInt(clargs[2]);
// console.log(n);
let arr=[];
for(let i = 0; i < n; i++){
    arr.push(parseInt(clargs[i+3]));
}
console.log(arr);