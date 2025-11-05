package _32_LayeredArchitecture2.repository;

import _32_LayeredArchitecture2.entity.User;

import java.util.Arrays;

public class UserRepositoryImpl2 implements UserRepository {
    private static UserRepositoryImpl2 instance;
    private User[] users;
    private int autoIncrementId;

    private UserRepositoryImpl2() {
        users = new User[0];
        autoIncrementId = 1;
    }

    public static UserRepositoryImpl2 getInstance() {
        if (instance == null) {
            instance = new UserRepositoryImpl2();
        }
        return instance;
    }

    @Override
    public void insert(User user) {
        User[] temp = Arrays.copyOf(users, users.length+1);
        user.setUserId(autoIncrementId++);
        temp[temp.length-1] = user;
        users = temp;
    }

    @Override
    public User findByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}
