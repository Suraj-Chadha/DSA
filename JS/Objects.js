// var CaptainAmerica = {
//     firstName: "steve",
//     lastName: "Rogers",
//     age: 102,
//     friends:["Suraj","Divyanshu"],
//     isAvenger:true,
//     address: {
//         state: "Rajasthan",
//         city: "SGNR",
//         pin: 999999
//     },
//     sayHi: function(){
//         console.log(`Hi I am ${this["address"].state}`);
//     }
// };

// // CaptainAmerica.sayHi();
// // console.log(CaptainAmerica.address);

// // function add(){
// //     // return "hi";
// //     // return void;

// // }
// // // console.log(add());
// // for(let haathi in CaptainAmerica){
// //     console.log(haathi);
// //     console.log(""+CaptainAmerica);
// // }
// // console.log(""+CaptainAmerica);
// var person = {
//     name: "Suraj Chadha",
//     age: 20,
//     interest: "MMA",
//     Hobby: "Coding",
//     ToDoList:{
//         tasks : ["finish FJP5 lecture","finish the code of FJP5", "finish the backlog"],
//         time_alloted: 24,
//         date:"17022022"
//     },
//     hello: function(){
//         return "Hello World";
//     }
// }
// // console.log(person);
// console.log(JSON.stringify(person));

// Setup
const testObj = {
    12: "Namath",
    16: "Montana",
    19: "Unitas"
  };
  
  // Only change code below this line
  const playerNumber = 16;  // Change this line
  const player = testObj[playerNumber];   // Change this line
  console.log(player);