import React, { useState } from "react";

function EvenNumber({value}){
    return <h1>{value} is a Even Number</h1>
}
function OddNumber({value}){
    return <h1>{value} is a Odd Number</h1>
}

function UserInput (){
    const [number, setNumber] = useState("");
    const handleChange = (event) => {
        const value = event.target.value;
        if (!isNaN(value) && value !== " ") {
          setNumber(value);
        }
    };
    return(
        <div>
        <h2>Enter a Number to check - Even/Odd</h2>
        <input
          type="number"
          value={number}
          onChange = {handleChange}
          placeholder="Enter Number"
        />
        <CheckNumber number={number} />
        </div>
    )
}
function CheckNumber({number}){
    const isNum=parseInt(number,10);
    return isNum%2==0  ? <EvenNumber value={isNum} /> : <OddNumber value={isNum} />
}
export default UserInput;