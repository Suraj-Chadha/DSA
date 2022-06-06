// task in hand: 
//     1) read a file
//     2) get prime number
//     3) write a file
//     4) 


// node firstLackOfCallBack.js --source=f1.txt --dest=f2.txt --n=50000

function checkPrime(x){
    for(let i = 2; i*i <= x; i++){
        if(x % i == 0){
            return false;
        }
    }
    return true;
}

const minimist = require("minimist");
const fs = require("fs");
const args = minimist(process.argv);

//task 1 area begins
let t1 = Date.now();
console.log(`starting task1 at ${t1 % 100000}`);
let stext = fs.readFileSync(args.source);
let t2 = Date.now();
console.log(`ending task 1 at ${t2 % 100000}`);
console.log(t2-t1);
// task 1 area ends

// task 2 area begins
let t3 = Date.now();
console.log(`starting task1 at ${t3 % 100000}`);

let primeArr = [];
for(let i = 2; i < args.n; i++){
    let isPrime = checkPrime(i);
    if(isPrime){
        primeArr.push(i);
    }
}
console.log(primeArr);

let t4 = Date.now();
console.log(`ending task 1 at ${t4 % 100000}`);
console.log(t4-t3);
console.log(t4-t1);
// task 2 area ends