package com.JPoP2;

import com.JPoP2.model.Book;
import com.JPoP2.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

import java.math.BigDecimal;

@SpringBootApplication
@EnableDiscoveryClient
public class BookServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner initDatabase(BookRepository bookRepository) {
        return args -> {
            bookRepository.save(new Book("The Forest of Enchantments", "Chitra Banerjee Divakaruni", new BigDecimal("353.50")));
            bookRepository.save(new Book("The Carve the Mark", "Veronica Roth", new BigDecimal("742.50")));
            bookRepository.save(new Book("The Alchemist", "Paulo Coelho", new BigDecimal("209.50")));
        };
    }

}