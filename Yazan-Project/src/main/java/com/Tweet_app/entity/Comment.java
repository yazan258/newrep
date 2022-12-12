package com.Tweet_app.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Comment {
    @Id
    @SequenceGenerator(
            name = "Comment_Sequence",
            sequenceName = "Comment_Sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Comment_Sequence"
    )
    private Long id;

    private String description;

    private Date date;

    @ManyToOne
    private Tweet tweet;

    @ManyToOne
    private User user;

    public Comment() {
    }

    public Comment(Long id, String description, Date date, Tweet tweet, User user) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.tweet = tweet;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
