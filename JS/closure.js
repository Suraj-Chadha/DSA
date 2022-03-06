function outer(){
    var a = 7;
    function inner(){
        console.log(a);
    }
    a = 10;
    return inner;
}
var c = inner