package com.Tweet_app.entity;

import com.Tweet_app.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;


@Configuration
public class UserConfig {




    @Bean
    CommandLineRunner commandLineRunnerUser (UserRepository repository) {
        return args -> {
            User khaled = new User(
                    "Khaled",
                    "KhaledJeetan",
                    LocalDate.of(1999,AUGUST,12),
                    "1234",
                    "Palestine"
            );
            User zaid =  new User(
                    "zaid",
                    "zaidJeetan",
                    LocalDate.of(2010, MARCH, 28),
                    "1234567",
                    "Palestine"
            );
            User yazan =  new User(
                    "yazan",
                    "yazan lubbadeh",
                    LocalDate.of(1998, MARCH, 28),
                    "0000",
                    "Palestine"
            );
            User ahmad =  new User(
                    "ahmad",
                    "ahmad lubbadeh",
                    LocalDate.of(2002, MARCH, 28),
                    "000011",
                    "Palestine"
            );
            User zaidJe =  new User(
                    "Zaid",
                    "zaid jeet",
                    LocalDate.of(2002, MARCH, 28),
                    "000011",
                    "Palestine"
            );
            User abdullah =  new User(
                    "abdullah",
                    "abdullah shanti",
                    LocalDate.of(2002, MARCH, 28),
                    "000011",
                    "Palestine"
            );
            User hamed =  new User(
                    "Hamed",
                    "Tester Hamed",
                    LocalDate.of(2002, MARCH, 28),
                    "000011",
                    "Palestine"
            );
            repository.saveAll(
                    List.of(khaled,zaid,hamed,abdullah, zaidJe, yazan, ahmad)
            );

        };
    }

}
