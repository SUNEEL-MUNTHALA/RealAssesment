package Library.books.repository;

import Library.books.data.BookData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Repository
public interface BookRepo extends JpaRepository<BookData, Long> {

    String saveData(BookData bookData);

}
