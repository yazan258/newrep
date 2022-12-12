//package com.Tweet_app.entity;
//
//import com.Tweet_app.repository.TweetRepository;
//import com.Tweet_app.repository.UserRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.util.List;
//
//import static java.time.Month.*;
//
//
//@Configuration
//public class TweetConfig {
//
//
//
//
//    @Bean
//    CommandLineRunner commandLineRunnerTweet (TweetRepository repository) {
//        return args -> {
//            Tweet t1 = new Tweet(
//                    "Tweet 1 form user 1",
//                    "Testing",
//                    LocalDate.of(2022,DECEMBER,11)
//
//            );
//            Tweet t2 = new Tweet(
//                    "Tweet 2 form user 1",
//                    "Testing",
//                    LocalDate.of(2022,DECEMBER,11)
//
//            );
//            Tweet t3 = new Tweet(
//                    "Tweet 1 form user 2",
//                    "Testing",
//                    LocalDate.of(2022,DECEMBER,11)
//
//            );
//            Tweet t4 = new Tweet(
//                    "Tweet 2 form user 2",
//                    "Testing",
//                    LocalDate.of(2022,DECEMBER,11)
//
//            );
//            Tweet t5 = new Tweet(
//                    "Tweet 1 form user 3",
//                    "Testing",
//                    LocalDate.of(2022,DECEMBER,11)
//
//            );
//            Tweet t6 = new Tweet(
//                    "Tweet 1 form user 4",
//                    "Testing",
//                    LocalDate.of(2022,DECEMBER,11)
//
//            );
//            Tweet t7 = new Tweet(
//                    "Tweet 1 form user 5",
//                    "Testing",
//                    LocalDate.of(2022,DECEMBER,11)
//
//            );
//            repository.saveAll(
//                    List.of(t1,t2,t3,t4,t5,t6,t7)
//            );
//
//        };
//    }
//
//}
