let args = process.argv;
// process.argv is predefined in node and it is used to get all the arguments from command line to the program

// console.log(args[2]);
let i = args[2]; // when we get input using process.argv we get input as a string
    // "10"+30
i = i + 30;// when we try to add a string to a number, number converts to the string and concatenates with the string
     
console.log(i); // op will be "1030"
// console.log(typeof i);

let j = parseInt(args[3],3);
console.log(j);
