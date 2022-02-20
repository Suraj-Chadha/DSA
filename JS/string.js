// var str = "hi I am Suraj"
// // console.log(str);
// str[5] = "g";
// // console.log(str);

// // var str2 = 'hi I am \\';
// // console.log(str2);

// // const myList = [["Cadbury Silk", 5],["Doritos",20],["Samosa",15],["coldDrink",15],["Momos",10]];
// // console.table(myList);

// // let fun = (function(p1,p2){
// //     console.log(p1,p2);
// //   })("hello","world");

// // // fun("hello","world");

// function functionWithArgs(p1,p2){
//     return p1+p2;
//   }
//   console.log(functionWithArgs("Hello ","World"));


function myLocalScope() {
    // Only change code below this line
    let myVar = 10;
    console.log('inside myLocalScope', myVar);
  }
  myLocalScope();
  
  // Run and check the console
  // myVar is not defined outside of myLocalScope
  console.log('outside myLocalScope', myVar);