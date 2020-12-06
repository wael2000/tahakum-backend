package com.example.demo3;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.stream.Stream;

@SpringBootApplication
public class Demo3Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
	}

	@Bean
    CommandLineRunner init(FruitRepository repository) {
        return args -> {
            Stream.of("Cherry", "Apple", "Bannana").forEach(name -> {
                Fruit fruit = new Fruit(name);
                repository.save(fruit);
            });
            repository.findAll().forEach(System.out::println);
        };
    }
}
