package com.itlize.assignments.Service;

import com.itlize.assignments.Entity.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    User findByUsername(String username);

    List<User> findAllUsers();

    boolean create(User user);
    boolean delete(User user);
    User get(Integer userId);
    User update(Integer userId, User user);
    void clear();
}
