var mon = 50
var tue = 55
var wed = 50
var thu = 50
var fri = 50
var sat = 50
var sun = 55
function sum(){
    return mon+tue+wed+thu+fri+sat+sun;
}
function avg(){
    return sum()/7;
}
console.log(avg());
if(avg()>50){
    console.log("Tomato has given good profit");
}else{
    console.log("No profit from tomato")
}
