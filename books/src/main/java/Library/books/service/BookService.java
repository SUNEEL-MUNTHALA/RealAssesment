package Library.books.service;

import Library.books.data.BookData;
import Library.books.model.BookInput;

public interface BookService {

    BookData saveBook(BookInput bookInput);
}
