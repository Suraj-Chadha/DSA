let clargs = process.argv;
let n = parseInt(clargs[2]);

for(let i = 2; i <= n; i++){
    if(isPrime(i)){
        console.log(i);
    }
}
function isPrime(x){
    for(let div = 2; div*div <= x; div++){
        if(x % div == 0){
            return false;
        }
    }
    return true;
}