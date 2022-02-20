// let cars = [10,40,'hi',"hello",true];
// console.log(cars);
// console.log(typeof cars);

// function Calculator(str, a ,b){
//     if(str == '*'){
//         return a*b;
//     }else if(str == "+"){
//         return a+b;
//     }else if(str == "-"){
//         return a-b;
//     }else if(str == "^"){
//         let p = 1;
//         for(let i = 1; i <= b; i++){
//             p = p*a;
//         }
//         return p;
//     }
// }
// var a = Calculator('*', 2,10);
// console.log(a);

// first Program Calculator:

// let CalC = (function abc(str,a,b){
//     if(str == "+"){
//         return a+b;
//     }else if(str == "-"){
//         return a - b;
//     }else if(str == "*"){
//         return a*b;
//     }
// })("*",5,6);
// console.log(CalC);
// console.log(typeof abc);
// console.log(CalC("-",5,5));

// Calculator 2

function Calculator(str, a, b){
    if(str == "+"){
        return function(){
            return a+b;
        }
    }else if(str == "-"){
        return function(){
            return a-b;
        }
    }else if(str == "^"){
        return function pow(){
            let ans = 1;
            for(let i = 1; i <= b; i++){
                ans = ans*a;
            }
            return ans;
        }
    }
}
var sum_val = Calculator("^", 56,1);
console.log(sum_val());

// let f = function(){
//     console.log("best");
// }
// console.log(""+f);