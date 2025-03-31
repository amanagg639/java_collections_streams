package junit.src.test.java.advance;
import advance.UserRegistration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    @Test
    void testValidUserRegistration() {
        assertEquals("User registered successfully!",
                UserRegistration.registerUser("JohnDoe", "john.doe@example.com", "Password1"));
    }

    @Test
    void testEmptyUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                UserRegistration.registerUser("", "john.doe@example.com", "Password1")
        );
        assertEquals("Username cannot be empty.", exception.getMessage());
    }

    @Test
    void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                UserRegistration.registerUser("JohnDoe", "invalid-email", "Password1")
        );
        assertEquals("Invalid email format.", exception.getMessage());
    }

    @Test
    void testWeakPasswordMissingDigit() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                UserRegistration.registerUser("JohnDoe", "john.doe@example.com", "Password")
        );
        assertEquals("Password must be at least 8 characters long, contain one uppercase letter, and one digit.",
                exception.getMessage());
    }

    @Test
    void testWeakPasswordTooShort() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                UserRegistration.registerUser("JohnDoe", "john.doe@example.com", "Pass1")
        );
        assertEquals("Password must be at least 8 characters long, contain one uppercase letter, and one digit.",
                exception.getMessage());
    }

    @Test
    void testWeakPasswordMissingUppercase() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                UserRegistration.registerUser("JohnDoe", "john.doe@example.com", "password1")
        );
        assertEquals("Password must be at least 8 characters long, contain one uppercase letter, and one digit.",
                exception.getMessage());
    }


    @Test
    void testNullUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                UserRegistration.registerUser(null, "john.doe@example.com", "Password1")
        );
        assertEquals("Username cannot be empty.", exception.getMessage());
    }

    @Test
    void testNullPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                UserRegistration.registerUser("JohnDoe", "john.doe@example.com", null)
        );
        assertEquals("Password must be at least 8 characters long, contain one uppercase letter, and one digit.",
                exception.getMessage());
    }
}