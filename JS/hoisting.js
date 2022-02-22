// // x = 10;
// console.log(y);
// greet();
// console.log(hello);
// var y = 10;
// function greet(){
//     console.log("hello pep");
// }

// var hello = function(){
//     console.log("hello");
// }

function outer(){
    // b = 5;
    inner();
    var b = 5;
    function inner(){
        console.log(b);
    }
}
var b = 10;
outer();
console.log(b);