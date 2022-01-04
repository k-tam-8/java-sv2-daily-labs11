package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void testUserNameAndPassword() {
        User user = new NormalUser("XY", "Z");
        assertEquals("XY",user.getUserEmail());
        assertEquals("Z",user.getPassword());
    }
}