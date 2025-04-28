package com.suhruth.apps.causeeffect.controller;

import com.suhruth.apps.causeeffect.model.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class AppController {
    
    @GetMapping
    ResponseEntity<List<Person>> getAll(){
        List<Person> persons = Arrays.asList(
            new Person("Rahul", "Sharma", 30, "rahul@example.com", "Software Engineer", "+91-9876543210", "42 MG Road", "Bangalore"),
            new Person("Priya", "Patel", 28, "priya@example.com", "UI Designer", "+91-9876543211", "15 Park Street", "Mumbai"),
            new Person("Amit", "Kumar", 35, "amit@example.com", "Project Manager", "+91-9876543212", "7 Civil Lines", "Delhi"),
            new Person("Neha", "Gupta", 32, "neha@example.com", "Architect", "+91-9876543213", "22 Jubilee Hills", "Hyderabad"),
            new Person("Rajesh", "Verma", 41, "rajesh@example.com", "CEO", "+91-9876543214", "8 Bandra West", "Mumbai"),
            new Person("Anjali", "Singh", 26, "anjali@example.com", "Content Writer", "+91-9876543215", "31 Koramangala", "Bangalore"),
            new Person("Suresh", "Reddy", 38, "suresh@example.com", "Data Scientist", "+91-9876543216", "12 Salt Lake", "Kolkata"),
            new Person("Deepa", "Nair", 33, "deepa@example.com", "Doctor", "+91-9876543217", "5 Aundh", "Pune"),
            new Person("Vikram", "Malhotra", 45, "vikram@example.com", "Lawyer", "+91-9876543218", "19 Defence Colony", "Delhi"),
            new Person("Meera", "Iyer", 29, "meera@example.com", "Teacher", "+91-9876543219", "3 Anna Nagar", "Chennai"),
            new Person("Arjun", "Rao", 36, "arjun@example.com", "Consultant", "+91-9876543220", "28 HSR Layout", "Bangalore"),
            new Person("Pooja", "Mehta", 31, "pooja@example.com", "Artist", "+91-9876543221", "11 Vashi", "Mumbai"),
            new Person("Karthik", "Krishnan", 39, "karthik@example.com", "Research Scientist", "+91-9876543222", "16 T Nagar", "Chennai"),
            new Person("Ananya", "Desai", 27, "ananya@example.com", "Journalist", "+91-9876543223", "9 Indiranagar", "Bangalore"),
            new Person("Rohit", "Kapoor", 34, "rohit@example.com", "Chef", "+91-9876543224", "25 Model Town", "Delhi")
        );
        return ResponseEntity.ok(persons);
    }
}