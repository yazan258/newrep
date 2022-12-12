package com.Tweet_app.controller;

import com.Tweet_app.entity.Tweet;
import com.Tweet_app.entity.User;
import com.Tweet_app.repository.TweetRepository;
import com.Tweet_app.repository.UserRepository;
import com.Tweet_app.student.Student;
import com.Tweet_app.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    private UserRepository userRepository;
    private TweetRepository tweetRepository;

    @Autowired
    public UserController(UserRepository userRepository, TweetRepository tweetRepository) {
        this.userRepository = userRepository;
        this.tweetRepository =tweetRepository;
    }

    @GetMapping("/getUsers")
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @PostMapping("/addUser")
    public void registerNewUser(@RequestBody User user){
        userRepository.save(user);
    }

    @PutMapping("/editUser/{userId}")
    @Transactional
    public void EditUser(
            @PathVariable("userId") Long userId,
            @RequestBody User user){
        User oldUser = userRepository.findById(userId).orElseThrow(()-> new IllegalStateException(
                "User with id "+ userId + " does not exists"));
        oldUser.setUserName(user.getUserName());
        oldUser.setFullName(user.getFullName());
        oldUser.setBirthday(user.getBirthday());
        oldUser.setPassword(user.getPassword());
        oldUser.setAddress(user.getAddress());
    }

    @GetMapping("/login")
    public User login(
            @RequestParam Long userId,
            @RequestParam String password
            ){
        User user = userRepository.findById(userId).orElseThrow(()-> new IllegalStateException(
                "User with id "+ userId + " does not exists"));
        if(user.getPassword().matches(password))
            return user;
        else
            throw new IllegalStateException("Wrong Password..!!");

    }

    @PutMapping("/changePassword/{userId}")
    @Transactional
    public void EditUser(
            @PathVariable("userId") Long userId,
            @RequestBody String Password){
        User oldUser = userRepository.findById(userId).orElseThrow(()-> new IllegalStateException(
                "User with id "+ userId + " does not exists"));
        oldUser.setPassword(Password);
    }

    @GetMapping("/getUserTweets/{userId}")
    public List<Tweet> getUserTweets(
            @PathVariable("userId") Long userId
    ){
        User user = userRepository.findById(userId).orElseThrow(()-> new IllegalStateException(
                "User with id "+ userId + " does not exists"));
            return user.getTweets();
    }



}
