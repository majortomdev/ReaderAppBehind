package com.jkdev.glassthunk.readerApp;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReaderAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReaderAppApplication.class, args);
	}
	
//    @Bean
//    ApplicationRunner init(UserRepository repository) {
//        return args -> {
//            Stream.of("Joker", "Dazzler", "Lemmy", "Roisin", "Cruz",
//                      "Maverick", "Jules","Ciraz","Caoi", "Cillter", "Ali").forEach(name -> {
//                User user = new User();
//                User.setName(name);
//                repository.save(user);
//            });
//            repository.findAll().forEach(System.out::println);
//        };
    }

