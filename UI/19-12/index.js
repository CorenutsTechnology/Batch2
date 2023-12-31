f1();
function f1(){
    document.write("from f1");//prints on browser
    console.log("f1");//prints on console
}
//non function hoisting
// f2();
var f2 = function(){
    document.write("from f2");
}
f2();

//method inside method
f3();
function f3()
{
    f4(); 
    function f4(){
        document.write("from f4");
    }
    document.write("from f3");
}
