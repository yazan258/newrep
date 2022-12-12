package com.Tweet_app.entity;

import javax.persistence.*;

@Entity
@Table
public class Hidden_Tweet {
    @Id
    @SequenceGenerator(
            name = "Hidden_Tweet_Sequence",
            sequenceName = "Hidden_Tweet_Sequence",
            allocationSize = 1,
            initialValue = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Hidden_Tweet_Sequence"
    )
    private Long id;
//    private Tweet tweet;
//
//    private User user;


    public Hidden_Tweet() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
