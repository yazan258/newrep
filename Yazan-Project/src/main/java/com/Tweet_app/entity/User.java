package com.Tweet_app.entity;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table
public class User {

    @Id
    @SequenceGenerator(
            name = "User_Sequence",
            sequenceName = "User_Sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "User_Sequence"
    )
    private Long id;
    private String userName;
    private String fullName;
    private LocalDate birthday;
    private String password;
    private String address;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Tweet> tweets;

    @OneToMany(cascade = CascadeType.REFRESH )
    private List<User> followers;

    @OneToMany(cascade = CascadeType.REFRESH)
    private List<User> usersIFollowed;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Saved_Tweet> savedTweets;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Comment> comments;

    @OneToMany(cascade = CascadeType.ALL)
    private List<UserLike> userLikeList;

    public User() {
        this.tweets = new ArrayList<>();
        this.followers = new ArrayList<>();
        this.usersIFollowed = new ArrayList<>();
        this.savedTweets = new ArrayList<>();
        this.comments = new ArrayList<>();
        this.userLikeList = new ArrayList<>();
    }

    public User( String userName, String fullName, LocalDate birthday, String password, String address) {
        this.userName = userName;
        this.fullName = fullName;
        this.birthday = birthday;
        this.password = password;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public List<String> getUsersIFollowed() {

        List<String> ul =  new ArrayList<>();
        for (User userif:   usersIFollowed) {
            ul.add(userif.getUserName());
        }
        return ul;
    }
    public List<User> followedList() {
        return usersIFollowed;
    }

    public void setUsersIFollowed(List<User> usersIFollowed) {
        this.usersIFollowed = usersIFollowed;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(List<Tweet> tweets) {
        this.tweets = tweets;
    }

    public List<UserLike> getUserLikeList() {
        return userLikeList;
    }

    public void setUserLikeList(List<UserLike> userLikeList) {
        this.userLikeList = userLikeList;
    }

    public List<String> getFollowers() {
        List<String> ul =  new ArrayList<>();
        for (User userif:   followers) {
            ul.add(userif.getUserName());
        }
        return ul;
    }
    public List<User> followersList(){
        return followers;
    }

    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }

    public List<Saved_Tweet> getSavedTweets() {
        return savedTweets;
    }

    public void setSavedTweets(List<Saved_Tweet> savedTweets) {
        this.savedTweets = savedTweets;
    }
    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }


}
