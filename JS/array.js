// let cars = [20,35,true,"true","power","subs","add",false,function(){console.log("hi bitch")}];
// console.log(""+cars[cars.length - 1]);

// cars[cars.length - 1] = "hi bitch";
// console.log(""+cars);
// cars[cars.length] = 5000;



// console.log(cars);
// console.log(cars.length);
// console.log(cars.pop());
// console.log(cars.pop());
// console.log(cars.length);

// cars.push("hihihihihihihi");
// cars.push("gdyjgcuy");
// console.log(cars);
// // console.log(cars.push("hi"));
// // console.log(cars);
// // console.log(cars.push("hi"));
// // console.log(cars);

// cars.unshift(2000);
// console.log(cars);

// cars.shift();
// console.log(cars);
// cars.unshift("fuck array");
// console.log("", cars);

let array2d = [
    [1,2,3],
    [4,5,6],
    [7,8,9,null]
];
console.log(array2d);
console.table(array2d);
console.log("array elemet at (1,1) is = ", array2d[1][1]);
console.log(array2d[2].length);


let str = "hi I am Suraj";
var strSlice = str.slice(5,200000);
console.log(strSlice);