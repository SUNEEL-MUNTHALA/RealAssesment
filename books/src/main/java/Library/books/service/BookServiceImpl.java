package Library.books.service;

import Library.books.data.BookData;
import Library.books.model.BookInput;
import Library.books.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepo bookRepo;


    @Override
    public BookData saveBook(BookInput bookInput) {
        BookData bookData = new BookData();
        bookData.setName(bookInput.getName());
        bookData.setLanguage(bookInput.getLanguage());
        bookData.setGenre(bookInput.getGenre());
        bookData.setAuthor(bookInput.getAuthor());
        bookData = bookRepo.save(bookData);

        return bookData;

    }
}





