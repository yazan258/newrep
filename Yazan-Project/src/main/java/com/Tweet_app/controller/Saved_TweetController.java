package com.Tweet_app.controller;

import com.Tweet_app.repository.Saved_TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saved_TweetController {

    private Saved_TweetRepository savedTweetRepository;

    @Autowired
    public Saved_TweetController(Saved_TweetRepository savedTweetRepository) {
        this.savedTweetRepository = savedTweetRepository;
    }
}
