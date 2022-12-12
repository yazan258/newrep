package com.Tweet_app.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Tweet {

    @Id
    @SequenceGenerator(
            name = "Tweet_Sequence",
            sequenceName = "Tweet_Sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Tweet_Sequence"
    )
    private Long id;
    @ManyToOne
    private User user;
    private String description;
    private String hashtag;
    private LocalDate date;

    @OneToMany
    private List<Saved_Tweet> savedTweet;

    @OneToMany
    private List<Comment> comments;

    public Tweet() {
    }

    public Tweet(String description, String hashtag, LocalDate date) {
        this.description = description;
        this.hashtag = hashtag;
        this.date = date;
    }

    public Tweet(User user, String description, String hashtag, LocalDate date) {
        this.user = user;
        this.description = description;
        this.hashtag = hashtag;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user.getUserName();
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHashtag() {
        return hashtag;
    }

    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Saved_Tweet> getSavedTweet() {
        return savedTweet;
    }

    public void setSavedTweet(List<Saved_Tweet> savedTweet) {
        this.savedTweet = savedTweet;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
