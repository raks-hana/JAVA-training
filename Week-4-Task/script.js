let courses = [];
document.addEventListener("DOMContentLoaded", function () {
    loadNavbar();

    if (document.getElementById("course-carousel") || document.getElementById("course-list")) {
        loadCourses();
    }

    if (document.getElementById("instructor-list")) {
        loadInstructors();
    }
    document.getElementById("search").addEventListener("keyup", filterCourses);
});

document.addEventListener("DOMContentLoaded", function () {
    fetch("courses.json")
        .then(response => response.json())
        .then(courses => {
            let container = document.getElementById("courses-container");
            container.innerHTML = "";

            courses.forEach(course => {
                let courseCard = `
                    <div class="card">
                        <img src="${course.image}" class="card-img-top" alt="${course.title}">
                        <div class="card-body">
                            <h5 class="card-title">${course.title}</h5>
                            <p class="card-text">Instructor: ${course.instructor}</p>
                            <p class="card-text">Category: ${course.category}</p>
                        </div>
                    </div>
                `;
                container.innerHTML += courseCard;
            });
        })
        .catch(error => console.error("Error loading courses:", error));
});


function loadNavbar() {
    fetch("navbar.html")  
        .then(response => response.text())
        .then(data => {
            document.getElementById("navbar").innerHTML = data;
            highlightActivePage();
        })
        .catch(error => console.error("Error loading navbar:", error));
}

function highlightActivePage() {
    let currentPage = window.location.pathname.split("/").pop();
    let links = document.querySelectorAll(".navbar-nav .nav-link");

    links.forEach(link => {
        if (link.getAttribute("href") === currentPage) {
            link.classList.add("active");
        } else {
            link.classList.remove("active");
        }
    });
}

function loadCourses() {
    fetch("courses.json")
        .then(response => {
            if (!response.ok) {
                throw new Error("Failed to load courses.json");
            }
            return response.json();
        })
        .then(data => {
            courses = data;
            console.log("Courses Loaded:", courses); 

            let container = document.getElementById("course-carousel") || document.getElementById("course-list");
            if (!container) {
                console.warn("No container found to display courses");
                return;
            }

            container.innerHTML = ""; 

            courses.forEach(course => {
                let card = document.createElement("div");
                card.className = "course-card";
                card.innerHTML = `<h3>${course.title}</h3>
                                  <p>Instructor: ${course.instructor}</p>
                                  <p>Category: ${course.category}</p>`;
                container.appendChild(card);
            });
        })
        .catch(error => console.error("Error loading courses:", error));
}

function loadInstructors() {
    fetch("instructors.json")
        .then(response => response.json())
        .then(instructors => {
            let container = document.getElementById("instructor-list");
            container.innerHTML = "";

            instructors.forEach((instructor, index) => {
                let colorClass = index % 3 === 0 ? "card-color-1" : 
                                     index % 3 === 1 ? "card-color-2" : 
                                                       "card-color-3";
                let card = `
                    <div class="col-md-4">
                    <div class="instructor-card ${colorClass}">
                        <h3>${instructor.name}</h3>
                        <p><strong>Expertise:</strong> ${instructor.expertise}</p>
                        <p>${instructor.bio}</p>
                    </div>
                    </div>
                `;
                container.innerHTML += card;
            });
        })
        .catch(error => console.error("Error loading instructors:", error));    
}

document.addEventListener("DOMContentLoaded", loadInstructors);

function displayCourses(coursesToDisplay) {
    const container = document.getElementById("courses-container");
    container.innerHTML = '';

    if (coursesToDisplay.length === 0) {
        container.innerHTML = "<p>No courses found.</p>";
        return;
    }

    coursesToDisplay.forEach(course => {
        const courseCard = `
            <div class="col-md-4">
                <div class="card mb-4">
                    <img src="${course.image}" class="card-img-top" alt="${course.title}">
                    <div class="card-body">
                        <h5 class="card-title">${course.title}</h5>
                        <p class="card-text">Instructor: ${course.instructor}</p>
                        <p class="card-text">Category: ${course.category}</p>
                    </div>
                </div>
            </div>
        `;
        container.innerHTML += courseCard;
    });
}

function filterCourses() {
    const searchInput = document.getElementById("search").value.toLowerCase();
    const filteredCourses = courses.filter(course => {
        return course.title.toLowerCase().includes(searchInput) || 
               course.instructor.toLowerCase().includes(searchInput) || 
               course.category.toLowerCase().includes(searchInput);
    });

    if (filteredCourses.length === 0) {
        displayCourses([]); 
    } else {
        displayCourses(filteredCourses); 
    }
}

function validateForm() {
    document.getElementById('name-error').textContent = '';
    document.getElementById('email-error').textContent = '';
    document.getElementById('course-error').textContent = '';
    document.getElementById('phone-error').textContent = '';

    const fullName = document.getElementById('fullName').value;
    const email = document.getElementById('email').value;
    const course = document.getElementById('course').value;
    const phone = document.getElementById('phone').value;

    let isValid = true;
    if (fullName.trim() === '') {
        document.getElementById('name-error').textContent = 'Full name is required';
        isValid = false;
    }
    const emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
    if (!emailPattern.test(email)) {
        document.getElementById('email-error').textContent = 'Please enter a valid email address';
        isValid = false;
    }
    if (course === '') {
        document.getElementById('course-error').textContent = 'Please select a course';
        isValid = false;
    }
    const phonePattern = /^\d{10}$/; 
    if (!phonePattern.test(phone)) {
        document.getElementById('phone-error').textContent = 'Please enter a valid 10-digit phone number';
        isValid = false;
    }
    if (isValid) {
        alert('Enrollment Successful!');
    }
    return isValid;
}

