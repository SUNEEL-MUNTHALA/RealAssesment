package Library.books.controller;

import Library.books.data.BookData;
import Library.books.model.BookInput;
import Library.books.repository.BookRepo;
import com.sun.source.tree.LambdaExpressionTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@RestController
@RequestMapping
public class BookController {

    @Autowired
    private BookRepo bookRepo;

    @PostMapping("/BookData")
    public ResponseEntity<String> bookData(@RequestBody BookInput bookInput){
try{
    BookData bookData = new BookData();
    bookData.setName(bookInput.getName());
    bookData.setLanguage(bookInput.getLanguage());
    bookData.setGenre(bookInput.getGenre());
    bookData.setAuthor(bookInput.getAuthor());
    bookRepo.save(bookData);
    return new ResponseEntity<>("Book details save successfully", CREATED);

}catch (Exception e){
    return new ResponseEntity<>(INTERNAL_SERVER_ERROR);
}

    }


    @GetMapping("/getBook/{id}")
    public Optional<BookData> getBook(@PathVariable Long id){
        return bookRepo.findById(id);
    }

    @GetMapping("/getAllBooks")
    public List<BookData> getAll(){
        return bookRepo.findAll();
    }

    @DeleteMapping("/delete/book")
    public String deleteBook(@RequestParam Long id){
        bookRepo.deleteById(id);
        return "book deleted successfully";
    }

    @PutMapping("/bookDetails/{id}")
    public ResponseEntity<String> updateBook(@RequestBody BookInput bookInput, @PathVariable Long id){
        BookData bookData = bookRepo.findById(id).get();
        bookData.setName(bookInput.getName());
        bookData.setLanguage(bookInput.getLanguage());
        bookData.setGenre(bookInput.getGenre());
        bookData.setAuthor(bookInput.getAuthor());
        bookRepo.save(bookData);
        return new ResponseEntity<>("Book details updated",CREATED);
    }
}
