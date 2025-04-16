package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserManagerTest {
    @Test
    public void testAddUser() {
        UserManager userManager = new UserManager();
        User user = new User("1", "Alice");
        userManager.addUser(user);
        assertEquals(user, userManager.getUser("1"));
    }

    @Test
    public void testDeleteUser() {
        UserManager userManager = new UserManager();
        User user = new User("1", "Alice");
        userManager.addUser(user);
        userManager.deleteUser("1");
        assertNull(userManager.getUser("1"));
    }
}