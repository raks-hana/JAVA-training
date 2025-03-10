import { Component, OnInit } from '@angular/core';
import { BookService } from '../../services/book.service';
import { Book } from '../../model/book.model';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {
  books: Book[] = [];
  selectedBook: Book | null = null;
  selectedGenre: string = '';

  constructor(private bookService: BookService) {}

  ngOnInit(): void {
    this.bookService.getBooks().subscribe((data) => {
      this.books = data;
    });
  }

  onSelectBook(book: Book): void {
    // Set the selected book to show its details
    this.selectedBook = book;
  }

  closeDetail(): void {
    // Reset selected book when closing the detail
    this.selectedBook = null;
  }

  onGenreChange(event: Event): void {
    const target = event.target as HTMLSelectElement;
    this.selectedGenre = target.value;

    if (this.selectedGenre) {
      this.books = this.books.filter(book => book.genre === this.selectedGenre);
    } else {
      this.bookService.getBooks().subscribe((data) => {
        this.books = data;
      });
    }
  }
}
