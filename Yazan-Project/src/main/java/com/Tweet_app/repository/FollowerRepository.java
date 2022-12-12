package com.Tweet_app.repository;

import com.Tweet_app.entity.Follower;
import com.Tweet_app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FollowerRepository extends JpaRepository<Follower,Long> {
}
