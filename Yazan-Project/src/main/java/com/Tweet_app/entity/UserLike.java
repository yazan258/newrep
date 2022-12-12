package com.Tweet_app.entity;

import javax.persistence.*;

@Entity
@Table
public class UserLike {
    @Id
    @SequenceGenerator(
            name = "Like_Sequence",
            sequenceName = "Like_Sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Like_Sequence"
    )
    private Long id;
    @ManyToOne
    private User user;
    @ManyToOne
    private Tweet tweet;

    public UserLike() {
    }

    public UserLike(Long id, User user, Tweet tweet) {
        this.id = id;
        this.user = user;
        this.tweet = tweet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Tweet getTweet() {
        return tweet;
    }

    public void setTweet(Tweet tweet) {
        this.tweet = tweet;
    }


}
