let num = 44
function sumOf(num){
    let sum = 0
    while(num>0){
        let n = num%10
        sum = sum+n
        num = Math.floor(num/10) //4
    }
    if(sum%2==0){
        console.log("Even")
    }else{
        console.log("Odd")
    }
}
sumOf(num)
