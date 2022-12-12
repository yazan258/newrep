package com.Tweet_app.repository;

import com.Tweet_app.entity.Comment;
import com.Tweet_app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {
}
