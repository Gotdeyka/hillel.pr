package lesson_8;

public class InvalidUsernameExeption extends ExeptionTest {
    String username;

    public InvalidUsernameExeption(String username){
        super(String.format("User is invalid", username));
        this.username = username;
    }
}
