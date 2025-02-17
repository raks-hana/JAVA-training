let student = {
    id: 1,
    name: "Sherlock",
    dept: "Chemistry",
    college: "DLC",
    email: "sherlock@email.com",
    
    displayOne: function() {
        console.log('ID: '+student.id);
        console.log('Name: '+student.name);
        console.log('Department: '+student.dept);
        console.log('College: '+student.college);
        console.log('Email: '+student.email);
    },

    displayTwo: function() {
        console.log('ID: '+student.id);
        console.log('Name: '+student.name);
        console.log('Email: '+student.email);
    }
};

console.log("Displaying All Details:");
student.displayOne();

console.log("\nDisplaying Basic Details:");
student.displayTwo();

student.address = {
    doorNo: "221g",
    street: "Baker Street",
    area: "London",
    pincode: "123456"
};

student.displayWithAddress = function() {
    console.log('ID: '+student.id);
    console.log('Name: '+student.name);
    console.log('Department: '+student.dept);
    console.log('College: '+student.college);
    console.log('Email: '+student.email);
    console.log('Address: '+student.address.doorNo+", "+student.address.street+", "+student.address.area+", "+student.address.pincode);
};

// Invoking the function to display student details with address
console.log("\nDisplaying Details with Address:");
student.displayWithAddress();

// Deleting the email property
delete student.email;

// Deleting the function to display ID, Name, and Email
delete student.displayBasicDetails;

// Displaying the student object after deletion
console.log("\nDisplaying Details After Deleting Email and Function:");
student.displayWithAddress();
