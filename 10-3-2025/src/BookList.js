import React from "react";

const BookList = ({ books }) => {
  const safeBooks = books || [];

  return (
    <div className="container mt-3">
      <h3>Book List</h3>
      <ul className="list-group">
        {safeBooks.length > 0 ? (
          safeBooks.map((book) => (
            <li key={book.id} className="list-group-item">
              <strong>{book.title}</strong> - {book.author}
            </li>
          ))
        ) : (
          <li className="list-group-item">No books available.</li>
        )}
      </ul>
    </div>
  );
};

export default BookList;
