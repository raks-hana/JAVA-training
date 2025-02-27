import React, { useState } from "react";

function StudentDetails (){
    const [name, setName] = useState("");
    const [age, setAge] = useState("");
    const [dept, setDept] = useState("");
    
    const handleNameChange = (event) => {
        setName(event.target.value);
    };
    const handleAgeChange = (event) => {
        const value = event.target.value;
        if (!isNaN(value)) {
          setAge(value);
        }
    };
    const handleDeptChange = (event) => {
        setDept(event.target.value);
    }
    return (
        <div>
            <h2>Enter Name:</h2>
            <input type="text" value={name} onChange={handleNameChange}/>
            <h2>Enter Age:</h2>
            <input type="number" value={age} onChange={handleAgeChange}/>
            <h2>Enter Department:</h2>
            <input type="text" value={dept} onChange={handleDeptChange}/>
            <StudentDisplay name={name} age={age} dept={dept} />
        </div>
    )
};
function StudentDisplay({name,age,dept}){
    return (
        <div>
            <h2>Student Details:</h2>
            <p>Name: {name}</p>
            <p>Age: {age}</p>
            <p>Department: {dept}</p>
        </div>
    );
};
export default StudentDetails