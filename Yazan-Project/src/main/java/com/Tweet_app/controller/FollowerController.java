package com.Tweet_app.controller;


import com.Tweet_app.entity.Follower;
import com.Tweet_app.entity.User;
import com.Tweet_app.repository.FollowerRepository;
import com.Tweet_app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FollowerController {

    private FollowerRepository followerRepository;
    private UserRepository  userRepository;

    @Autowired
    public FollowerController(FollowerRepository followerRepository,UserRepository userRepository) {
        this.followerRepository = followerRepository;
        this.userRepository = userRepository;
    }


    @PostMapping("/followUser")
    @Transactional
    public void followUser(
            @RequestParam Long followerId,
            @RequestParam Long followedId
    ){
        User follower = userRepository.findById(followerId).orElseThrow(()-> new IllegalStateException(
                "User with id "+ followerId + " does not exists"));
        User followed = userRepository.findById(followedId).orElseThrow(()-> new IllegalStateException(
                "User with id "+ followedId + " does not exists"));
        followed.followersList().add(follower);
        follower.followedList().add(followed);
//        userRepository.save(user);
        Follower follower1 = new Follower(follower,followed);
        followerRepository.save(follower1);
    }

    @PostMapping("/unFollowUser")
    @Transactional
    public void unFollowUser(
            @RequestParam Long followerId,
            @RequestParam Long followedId
    ){
        User follower = userRepository.findById(followerId).orElseThrow(()-> new IllegalStateException(
                "User with id "+ followerId + " does not exists"));
        User followed = userRepository.findById(followedId).orElseThrow(()-> new IllegalStateException(
                "User with id "+ followedId + " does not exists"));
        followed.followersList().remove(follower);
        follower.followedList().remove(followed);
//        userRepository.save(user);
//        followerRepository.;
    }

}
