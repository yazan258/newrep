package com.Tweet_app.controller;

import com.Tweet_app.repository.Hidden_TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hidden_TweetController {

    private Hidden_TweetRepository  hiddenTweetRepository;

    @Autowired
    public Hidden_TweetController(Hidden_TweetRepository hiddenTweetRepository) {
        this.hiddenTweetRepository = hiddenTweetRepository;
    }
}
