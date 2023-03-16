package com.mycompany.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        return userService.addUser( user);
    }

    @GetMapping("/getAllUsers")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/get_user")
    public User getuser(@RequestParam int id){
        return userService.getUser(id);
    }

    //delete by rollno

    @DeleteMapping("/delete_user")
    public String deleteUser(@RequestParam int id){
        return userService.deleteUser(id);
    }

    //delete all
    @DeleteMapping("delete_users")
    public String deleteAllStudent(){
        return userService.deleteAllStudent();
    }

    //update a user by id
//    public String updateStudent(User user){
//        return userService.updateStudent(user);
//    }
}
