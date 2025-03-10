import { Pipe, PipeTransform } from '@angular/core';
import { Book } from '../model/book.model';

@Pipe({
  name: 'genre'
})
export class GenrePipe implements PipeTransform {

  transform(books: Book[], genre: string): Book[] {
    if (!genre || !books) {
      return books; 
    }
    return books.filter(book => book.genre.toLowerCase().includes(genre.toLowerCase()));
  }
}
