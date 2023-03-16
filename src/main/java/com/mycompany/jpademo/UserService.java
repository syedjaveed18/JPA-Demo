package com.mycompany.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    public String addUser(User user){
        userRepository.save(user);
        return "User added";
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User getUser(int id){
        return userRepository.findById(id).get();
        //.get() findById returns optional if id exists or not,
        // .get() converts this option
    }

    public String deleteUser(int id){
        userRepository.deleteById(id);
        return "Student deleted";
    }

    public String deleteAllStudent(){
        userRepository.deleteAll();
        return "All studnets Deleted";
    }

//    public String updateStudent(User user){
//        userRepository.
//    }
}
