package Library.books.controller;

import Library.books.data.UserData;
import Library.books.model.UserInput;
import Library.books.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping("/addUser")
    public String saveUser(@RequestBody UserInput userInput)throws Exception{
        UserData userData = new UserData();
       userData.setUserName(userInput.getUserName());
       userData.setEmail(userInput.getEmail());
       userData.setPassword(userInput.getPassword());
       userData.setFullName(userInput.getFullName());
       userData.setCreatedAt(userInput.getCreatedAt());
       userData.setUpdatedAt(userInput.getUpdatedAt());
       userRepo.saveUser(userData);
       return "user data saved successfully";

    }

    @GetMapping("/getUser/{id}")
    public Optional<UserData> getUser(@PathVariable Long id ){
     return userRepo.findById(id);

    }

    @GetMapping("/getAllUsers")
    public List<UserData> getAll(){
        return userRepo.findAll();
    }


    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        Optional<UserData> userData = userRepo.findById(id);
        userRepo.deleteById(id);
    }
}
