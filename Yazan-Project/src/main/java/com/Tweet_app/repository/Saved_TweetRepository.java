package com.Tweet_app.repository;

import com.Tweet_app.entity.Saved_Tweet;
import com.Tweet_app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface Saved_TweetRepository extends JpaRepository<Saved_Tweet,Long> {
}
