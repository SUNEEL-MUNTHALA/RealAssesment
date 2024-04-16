package Library.books.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserInput {
    private String userName;
    private String password;
    private String email;
    private String fullName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
