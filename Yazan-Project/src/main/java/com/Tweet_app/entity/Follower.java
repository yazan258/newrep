package com.Tweet_app.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Follower {
    @Id
    @SequenceGenerator(
            name = "Follower_Sequence",
            sequenceName = "Follower_Sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Follower_Sequence"
    )
    private Long id;
    @ManyToOne(cascade = CascadeType.REFRESH )
    private User follower;
    @ManyToOne(cascade = CascadeType.REFRESH)
    private User followed;


    public Follower(){

    }

    public Follower(User follower, User followed) {
        this.follower = follower;
        this.followed = followed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getFollower() {
        return follower;
    }

    public void setFollower(User follower) {
        this.follower = follower;
    }

    public User getFollowed() {
        return followed;
    }

    public void setFollowed(User followed) {
        this.followed = followed;
    }


}
