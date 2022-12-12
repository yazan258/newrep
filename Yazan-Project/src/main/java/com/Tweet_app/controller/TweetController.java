package com.Tweet_app.controller;


import com.Tweet_app.entity.Tweet;
import com.Tweet_app.entity.User;
import com.Tweet_app.repository.TweetRepository;
import com.Tweet_app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.awt.desktop.OpenFilesEvent;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class TweetController {
    private TweetRepository tweetRepository;
    private UserRepository userRepository;


    @Autowired
    public TweetController(TweetRepository tweetRepository, UserRepository userRepository) {
        this.tweetRepository = tweetRepository;
        this.userRepository = userRepository;
    }
    @GetMapping("/gettweets")
    public List<Tweet> getTweets(){
        return tweetRepository.findAll();
    }

    @PostMapping("/addtweet/{userId}")
    @Transactional
    public void registerNewUser(
            @PathVariable("userId") Long userId,
            @RequestBody Tweet tweet
    ){
        User user = userRepository.findById(userId).orElseThrow(()-> new IllegalStateException(
                "User with id "+ userId + " does not exists"));
        Tweet newTweet = new Tweet(user,tweet.getDescription(),tweet.getHashtag(),tweet.getDate());

        tweetRepository.save(newTweet);
        user.getTweets().add(newTweet);

    }

    @PutMapping("/editTweet/{tweetId}")
    @Transactional
    public void editTweet(
            @PathVariable("tweetId") Long tweetId,
            @RequestBody Tweet tweet){
        Tweet oldTweet = tweetRepository.findById(tweetId).orElseThrow(()-> new IllegalStateException(
                "Tweet with id "+ tweet + " does not exists"));
        oldTweet.setDescription(tweet.getDescription());
        oldTweet.setHashtag(tweet.getHashtag());
        oldTweet.setDate(tweet.getDate());
    }

    @DeleteMapping("/deleteTweet/{tweetId}")
    public void deleteTweet(
            @PathVariable("tweetId") Long tweetId
    ){
        Optional<Tweet> isTweenExist = tweetRepository.findById(tweetId);
        if(isTweenExist.isPresent())
            tweetRepository.deleteById(tweetId);
        else
            throw  new IllegalStateException("Tweet is not Exist");

    }

}
