package Library.books.repository;

import Library.books.data.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface UserRepo extends JpaRepository<UserData,Long> {


}
