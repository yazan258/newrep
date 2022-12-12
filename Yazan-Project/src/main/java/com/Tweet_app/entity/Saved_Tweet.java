package com.Tweet_app.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Saved_Tweet {
    @Id
    @SequenceGenerator(
            name = "Saved_Tweet_Sequence",
            sequenceName = "Saved_Tweet_Sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Saved_Tweet_Sequence"
    )
    private Long id;

    @ManyToOne
    private Tweet tweet;

    @ManyToOne
    private User user;


    public Saved_Tweet() {
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Tweet getTweet() {
        return tweet;
    }

    public void setTweet(Tweet tweet) {
        this.tweet = tweet;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
