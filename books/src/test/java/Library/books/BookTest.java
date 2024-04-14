package Library.books;

import Library.books.data.BookData;
import Library.books.repository.BookRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class BookTest {

    @Autowired
    BookRepo bookRepo;


    @Test
    public void createTest(){
        BookData bookData = new BookData();
        bookData.setId(1L);
        bookData.setName("The catcher in the rye");
        bookData.setAuthor("J.D.salinger");
        bookData.setGenre("Fiction");
        bookData.setLanguage("English");
        bookRepo.save(bookData);
        assertNotNull(bookRepo.findById(1L).get());

    }

}
