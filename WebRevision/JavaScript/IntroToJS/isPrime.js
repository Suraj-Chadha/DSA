let clargs = process.argv;
let n = clargs[2];
// for a number to be a prime we have to check divisibility till n^1/2 only as rest of them will give us repeated answers
let isPrime = true;
for(let i = 2; i*i <= n; i++){
    if(n % i == 0){
        isPrime = false;
        console.log(i + " divides "+ n);
        break;
    }
}
if(isPrime){
    console.log(n + " is a prime number");
}else{
    console.log(n + " is not prime");
}