let clargs = process.argv;
let n = parseInt(clargs[2]);
let arr = [];
for(let i = 0; i < n; i++){
    // arr[i] = parseInt(clargs[3+i]);
    arr.push(parseInt(clargs[3+i]));
}
arr.length = 10;
console.log(arr.length);
console.log(arr);
for(let x in arr){
    console.log(arr[x]);
}