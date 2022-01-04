package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminUserTest {

    @Test
    void testUserNameAndPassword() {
        User user = new AdminUser("XY", "Z");
        assertEquals("XY",user.getUserEmail());
        assertEquals("*",user.getPassword());
    }
}