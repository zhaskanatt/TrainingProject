package com.example.training.security;

import com.example.training.models.User;

public class SecurityContext {
    private static final ThreadLocal<User> currentUser = new ThreadLocal<>();

    public static User getCurrentUser() {
        return currentUser.get();
    }

    public static void setCurrentUser(User user) {
        currentUser.set(user);
    }

    public static void clear() {
        currentUser.remove();
    }
}
