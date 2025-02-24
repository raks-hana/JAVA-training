let student = {
    name: "Ali",
    age: 20,
    course: "Computer Science",
    displayInfo: function() {
        console.log(`Name: ${this.name}, Age: ${this.age}, Course: ${this.course}`);
    }
};
student.address = {
    city: "Chennai",
    pin: "123"
};
student.payment = {
    amt: 20000,
    bal: 1000
};
student.getAddress = function() {
    console.log(`City: ${this.address.city}, PIN: ${this.address.pin}`);
};
student.getPayDetails = function(){
    console.log(`Amount: ${this.payment.amt}, Balance: ${this.payment.bal}`);
};

student.displayInfo();
student.getAddress();
student.getPayDetails();

delete student.age;
delete student.getAddress;
console.log(student);
