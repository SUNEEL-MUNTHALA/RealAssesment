package Library.books.controller;

import Library.books.data.BookData;
import Library.books.model.BookInput;
import Library.books.repository.BookRepo;
import com.sun.source.tree.LambdaExpressionTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class BookController {

    @Autowired
    private BookRepo bookRepo;

    @PostMapping("/saveBookData")
    public String bookData(@RequestBody BookInput bookInput) throws Exception{

        BookData bookData = new BookData();
        bookData.setName(bookInput.getName());
        bookData.setLanguage(bookInput.getLanguage());
        bookData.setGenre(bookInput.getGenre());
        bookData.setAuthor(bookInput.getAuthor());
        bookRepo.saveData(bookData);
        return "book data saved successfully";
    }

    @GetMapping("/getBook/{id}")
    public Optional<BookData> getBook(@PathVariable Long id){
        return bookRepo.findById(id);
    }

    @GetMapping("/getAllBooks")
    public List<BookData> getAll(){
        return bookRepo.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id){
        Optional<BookData> bookData = bookRepo.findById(id);
        bookRepo.deleteById(id);
    }
}
