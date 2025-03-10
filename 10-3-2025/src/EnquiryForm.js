import React, { useState } from "react";

const EnquiryForm = () => {
  const [name, setName] = useState("");
  const [email, setEmail] = useState("");
  const [message, setMessage] = useState("");
  const [success, setSuccess] = useState(false);

  const handleSubmit = (e) => {
    e.preventDefault();
    const newEnquiry = { name, email, message };

    // Get existing enquiries from localStorage, or initialize as an empty array
    const storedEnquiries = JSON.parse(localStorage.getItem("enquiries")) || [];
    
    // Add the new enquiry to the existing array
    storedEnquiries.push(newEnquiry);

    // Save the updated list back to localStorage
    localStorage.setItem("enquiries", JSON.stringify(storedEnquiries));

    // Set success message to true
    setSuccess(true);

    // Reset the form fields
    setName("");
    setEmail("");
    setMessage("");

    // Hide success message after 3 seconds
    setTimeout(() => setSuccess(false), 3000);
  };

  return (
    <div className="container mt-5">
      <h2>Enquiry Form</h2>
      {success && <div className="alert alert-success">Enquiry submitted successfully!</div>} {/* Success message */}

      <form onSubmit={handleSubmit}>
        <div className="mb-3">
          <label className="form-label">Name</label>
          <input
            type="text"
            className="form-control"
            value={name}
            onChange={(e) => setName(e.target.value)}
            required
          />
        </div>
        <div className="mb-3">
          <label className="form-label">Email</label>
          <input
            type="email"
            className="form-control"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
            required
          />
        </div>
        <div className="mb-3">
          <label className="form-label">Message</label>
          <textarea
            className="form-control"
            value={message}
            onChange={(e) => setMessage(e.target.value)}
            required
          />
        </div>
        <button type="submit" className="btn btn-primary">Submit</button>
      </form>
    </div>
  );
};

export default EnquiryForm;
