// function creation || function call || lexical Scope || Memory Diagram
// function outer(b,c){
//     var a = 10;
//     function inner(){
//         // console.log(a);
//     }
//     inner();
    
// }

// outer(10,20);

//Function Expression
// var a = 1;
// var b = 2;
// var add = (function(){
//     // console.log(a+b);
// })();
// // console.log(add);
// // var ans = add(undefined,15);
// // console.log(ans);

function outer(){
    var a = 10;
    function inner(){
        let b = 100;
        console.log(a + " " + b);
    }
    inner();
}

var z = outer();
console.log(z+"");
// z();