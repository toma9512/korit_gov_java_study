package _32_LayeredArchitecture2.repository;

import _32_LayeredArchitecture2.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository{
    private static UserRepositoryImpl instance;
    private List<User> users;
    private int autoIncrementId;

    private UserRepositoryImpl() {
        users = new ArrayList<>();
        autoIncrementId = 1;
    }

    public static UserRepositoryImpl getInstance() {
        if (instance == null) {
            instance = new UserRepositoryImpl();
        }
        return instance;
    }

    @Override
    public void insert(User user) {
        user.setUserId(autoIncrementId++);
        users.add(user);
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("User 목록 [\n");
        for (User user : users) {
            sb.append(user+"\n");
        }
        sb.append("]");
        return sb.toString();
    }
}
