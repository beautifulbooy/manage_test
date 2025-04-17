package com.example;

import java.util.HashMap;
import java.util.Map;

public class UserManager {
    private Map<String, User> users = new HashMap<>();

    public void addUser(User user) {
        users.put(user.getId(), user);
    }

    public User getUser(String id) {
        return users.get(id);
    }

    public void deleteUser(String id) {
        users.remove(id);
    }
//
    public static void main(String[] args) {
        // 这里可以添加一些测试代码
        UserManager userManager = new UserManager();
        User user = new User("1", "Alice");
        userManager.addUser(user);
        System.out.println("Added user: " + userManager.getUser("1").getName());
    }
}