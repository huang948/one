package com.itlize.assignments.Service;

import com.itlize.assignments.Entity.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    User findByUsername(String username);

    List<User> findAllUsers();

    public boolean create(User user);
    public boolean delete(User user);
    public User get(Integer userId);
    public boolean update(Integer userId, User user);
    public void clear();
}
