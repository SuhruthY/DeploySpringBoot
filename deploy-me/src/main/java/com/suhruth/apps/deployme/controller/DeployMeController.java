package com.suhruth.apps.deployme.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@RestController
public class DeployMeController {   

    @GetMapping
    String getHome(){
        return "<h1>Welcome! Deploy this app</h1><br><a href='/books'>Books Data</a><br><br><a href='/employees'>Employee Data</a>";
    }

    @GetMapping("/books")
    List<Book> getBooks() {
        return Arrays.asList(
            new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book(2, "To Kill a Mockingbird", "Harper Lee"),
            new Book(3, "1984", "George Orwell"),
            new Book(4, "Pride and Prejudice", "Jane Austen"),
            new Book(5, "The Catcher in the Rye", "J.D. Salinger")
        );
    }

    @GetMapping("/employees")
    List<Employee> getEmployees() {
        return Arrays.asList(
            new Employee(1, "John Smith", "Software Development"),
            new Employee(2, "Sarah Johnson", "Human Resources"),
            new Employee(3, "Michael Chen", "Marketing"),
            new Employee(4, "Emily Brown", "Finance"),
            new Employee(5, "David Wilson", "Operations")
        );
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class Book {
        private int id;
        private String title;
        private String author;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class Employee {
        private int id;
        private String name;
        private String department;
    }
}