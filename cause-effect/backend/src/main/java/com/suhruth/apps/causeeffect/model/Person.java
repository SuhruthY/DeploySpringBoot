package com.suhruth.apps.causeeffect.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String occupation;
    private String phoneNumber;
    private String address;
    private String city;
}
