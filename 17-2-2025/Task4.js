var calculate=()=>{
    var operation = prompt("Enter the operation: ".toLowerCase())
    var num1=10
    var num2=2
    function sum(){
        return num1+num2
    }
    function diff(){
        return num1-num2
    }
    function multiply(){
        return num1*num2
    }
    function divide(){
        if(num2!=0){
            console.log("Quotient is: "+num1/num2)
            console.log("Remainder is: "+num1%num2)}
            else{
                console.log("Division by zero is not allowed")
            }
    }
    
    switch(operation){
        case "add":
            console.log("Sum is: "+sum())
            break
        case "sub":
            console.log("Difference is: "+diff())
            break;
        case "mul":
            console.log("Multiplication is: "+multiply())
            break
        case "div":
            divide()
            break
        default:
        console.log("Enter proper value")
    }
}
calculate()
