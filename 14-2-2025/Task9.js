var year = 2021
var mon = 'mar'
function checkLeap(){
    if(year%4==0)
    return true
    else
    return false
}
if(checkLeap() && mon=='feb'){
    console.log("The year is leap year and the month is February with 29 days.")
}else if(checkLeap()){
    console.log("The year is leap year and the month is not February ")
}else{
    console.log("The given year is not a leap year")
}
