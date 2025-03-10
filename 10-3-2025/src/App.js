import React from "react";
import { BrowserRouter as Router, Route, Routes, Link } from "react-router-dom";
import Bookstore from "./Bookstore";
import EnquiryForm from "./EnquiryForm";
import "bootstrap/dist/css/bootstrap.min.css";

const App = () => {
  return (
    <Router>
      <div className="container mt-4">
        {/* Navigation Bar */}
        <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
          <div className="container-fluid">
            <Link className="navbar-brand" to="/">Bookstore</Link>
            <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
              <span className="navbar-toggler-icon"></span>
            </button>
            <div className="collapse navbar-collapse" id="navbarNav">
              <ul className="navbar-nav ms-auto">
                <li className="nav-item">
                  <Link className="nav-link active" to="/">Home</Link>
                </li>
                <li className="nav-item">
                  <Link className="nav-link" to="/enquiry">Enquiry Form</Link>
                </li>
              </ul>
            </div>
          </div>
        </nav>

        {/* Routing */}
        <Routes>
          <Route path="/" element={<Bookstore />} />
          <Route path="/enquiry" element={<EnquiryForm />} />
        </Routes>
      </div>
    </Router>
  );
};

export default App;
