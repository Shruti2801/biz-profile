package com.example.bizprofile.service;

import com.example.bizprofile.entity.User;
import com.example.bizprofile.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user){
        return userRepository.save(user);
    }
    public List<User> createUsers(List<User> users){
        return userRepository.saveAll(users);
    }
    public User getUserById(int id){
        return userRepository.findById(id).orElse(null);
    }
    public List<User> getUsers(){
        return userRepository.findAll();
    }
    public User updateUser(User user){
        User olduser=null;
        Optional<User> optionaluser = userRepository.findById(user.getId());
        if (optionaluser.isPresent()){
            olduser = optionaluser.get();
            olduser.setName(user.getName());
            userRepository.save(olduser);
        }
        else {
            return new User();
        }
        return olduser;
    }
    public String deleteUserById(int id){
        userRepository.deleteById(id);
        return "User got deleted";
    }

}
