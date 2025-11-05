package _32_LayeredArchitecture2.repository;

import _32_LayeredArchitecture2.entity.User;

public interface UserRepository {
    void insert(User user);
    User findByUsername(String username);
}
