package Library.books.controller;

import Library.books.data.UserData;
import Library.books.model.UserInput;
import Library.books.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@RestController
@RequestMapping("/public")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping("/addUser")
    public ResponseEntity<String> saveUser(@RequestBody UserInput userInput) {
        try {
            UserData userData = new UserData();
            userData.setUserName(userInput.getUserName());
            userData.setEmail(userInput.getEmail());
            userData.setPassword(userInput.getPassword());
            userData.setFullName(userInput.getFullName());
            userData.setCreatedAt(LocalDateTime.now());
            userData.setUpdatedAt(LocalDateTime.now());
            userRepo.save(userData);
            return new ResponseEntity<>("User Details Created Successfully", CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getUser/{id}")
    public Optional<UserData> getUser(@PathVariable Long id) {
        return userRepo.findById(id);

    }

    @GetMapping("/getAllUsers")
    public List<UserData> getAll() {
        return userRepo.findAll();
    }


    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userRepo.deleteById(id);
        return "user deleted successfully";
    }

    @PutMapping("/updateUser/{id}")
    public ResponseEntity<String> updateDetails(@RequestBody UserInput userInput, @PathVariable Long id){
        UserData userData = userRepo.findById(id).get();
        userData.setUserName(userInput.getUserName());
        userData.setPassword(userInput.getPassword());
        userData.setEmail(userInput.getEmail());
        userData.setFullName(userInput.getFullName());
        userData.setCreatedAt(LocalDateTime.now());
        userData.setUpdatedAt(LocalDateTime.now());
        userRepo.save(userData);
        return new ResponseEntity<>("user details updated successfullu", CREATED);
    }
}
