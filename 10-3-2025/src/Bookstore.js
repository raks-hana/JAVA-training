import React, { useState, useEffect } from "react";
import axios from "axios";
import "bootstrap/dist/css/bootstrap.min.css";
import BookList from "./BookList";
import EnquiryForm from "./EnquiryForm";

const Bookstore = () => {
  const [books, setBooks] = useState([]);
  const [showEnquiryForm, setShowEnquiryForm] = useState(false);

  useEffect(() => {
    axios
      .get("/api.json")
      .then((response) => {
        console.log("Books fetched:", response.data);
        setBooks(response.data.books || []); 
      })
      .catch((error) => {
        console.error("Error fetching books:", error);
      });
  }, []);

  return (
    <div className="container mt-5">
      <h2>Bookstore:</h2>
      <BookList books={books} />
    </div>
  );
};

export default Bookstore;
