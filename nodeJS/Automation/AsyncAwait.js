// function f(){
//     return Promise.resolve("hi");
// }
// // console.log(f());
// // function f(){
// //     return new Promise(function(resolve,reject){
// //         resolve("hi");
// //     })
// // }
// // console.log(f());
// f().then(function(data){
//     console.log(data);
// })

// Async Await
async function f(){
    let promise = new Promise(function(resolve,reject){
        setTimeout(function(){
            reject("done");
        },5000)
    })
    let result = await promise;
    console.log("hello");
    console.log(result);
}
f();

