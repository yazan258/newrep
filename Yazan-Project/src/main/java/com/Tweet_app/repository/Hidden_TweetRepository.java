package com.Tweet_app.repository;

import com.Tweet_app.entity.Hidden_Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Hidden_TweetRepository extends JpaRepository<Hidden_Tweet,Long> {
}
