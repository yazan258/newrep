package com.Tweet_app.repository;

import com.Tweet_app.entity.UserLike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends JpaRepository<UserLike,Long> {
}
