try{
    // throw new Error("gadbad");
    console.log("hi");
}catch(err){
    console.log(err);
}finally{
    console.log("Always ON");
}

try{
    throw new Error("gadbad");
    console.log("hi");
}catch(err){
    console.log(err);
}finally{
    console.log("Always ON");
}