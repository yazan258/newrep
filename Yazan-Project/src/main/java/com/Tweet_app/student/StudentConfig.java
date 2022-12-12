package com.Tweet_app.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;


@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository) {
        return args -> {
            Student khaled = new Student(
                    "khaled Jeetan",
                    "khaledJeetan@gmail.com",
                    LocalDate.of(1999, AUGUST, 12)
            );
           Student zaid =  new Student(
                    "zaid Jeetan",
                    "zaidJeetan@gmail.com",
                    LocalDate.of(2010, MARCH, 28)
            );
            Student john =  new Student(
                    "John Doe",
                    "JohnDoe@gmail.com",
                    LocalDate.of(2022, JANUARY, 1)
            );
            repository.saveAll(
                    List.of(khaled, zaid, john)
            );

        };
    }

}
