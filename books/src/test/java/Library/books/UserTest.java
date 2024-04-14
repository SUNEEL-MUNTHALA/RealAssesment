package Library.books;


import Library.books.data.UserData;
import Library.books.repository.UserRepo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
 class UserTest {

    @Autowired
    UserRepo userRepo;

    @Test
     void saveUser(){
        UserData userData = new UserData();
        userData.setId(1L);
        userData.setUserName("John_doe");
        userData.setEmail("john.smith@example.com");
        userData.setPassword("John@123");
        userData.setFullName("John Smith");
        userData.setCreatedAt(LocalDateTime.now());
        userData.setUpdatedAt(LocalDateTime.now());
        userRepo.save(userData);
        assertNotNull(userRepo.findById(1L).get());
    }

}
