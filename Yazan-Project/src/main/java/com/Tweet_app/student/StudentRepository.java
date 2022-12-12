package com.Tweet_app.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository
        extends JpaRepository<Student,Long> {

    // this will be transformed to a select * from Student where email = ?;
    @Query("Select s from Student s where s.email = ?1") // i can delete it but to be more specific
    Optional<Student> findStudentByEmail(String email);

}
