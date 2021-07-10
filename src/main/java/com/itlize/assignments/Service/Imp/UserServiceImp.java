package com.itlize.assignments.Service.Imp;

import com.itlize.assignments.Entity.User;
import com.itlize.assignments.Repository.UserRepository;
import com.itlize.assignments.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }


    @Override
    public boolean create(User user) {
        try{
            userRepository.save(user);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    @Override
    @Transactional
    public boolean delete(User user) {
        if (user == null) {
            return false;
        }
        System.out.println("deleting user: " + user.getUsername());

        userRepository.delete(user);
        return true;
    }

    @Override
    public User get(Integer userId) {

        Optional<User> a= userRepository.findById(userId);
        if(a.isPresent()){
            return a.get();
        }
        return null;
    }

    @Override
    public User update(Integer userId, User user) {
        User output = null;
        Optional<User> toUpdate = userRepository.findById(userId);

        if (toUpdate.isPresent()) {
            User updatedUser = toUpdate.get();
            updatedUser.setUsername(user.getUsername());
            updatedUser.setPassword(user.getPassword());
            updatedUser.setRole(user.getRole());
            updatedUser.setProjects(user.getProjects());
            updatedUser.setTitle(user.getTitle());
            updatedUser.setLastUpdated(user.getLastUpdated());
            updatedUser.setTimeCreated(user.getTimeCreated());

            try{
                output = userRepository.save(updatedUser);
                return output;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return null;
            }
        }

        return null;
    }

    @Override
    public void clear() {
        userRepository.deleteAll();
    }



}
