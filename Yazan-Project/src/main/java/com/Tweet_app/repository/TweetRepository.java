package com.Tweet_app.repository;

import com.Tweet_app.entity.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TweetRepository extends JpaRepository<Tweet,Long> {
}
