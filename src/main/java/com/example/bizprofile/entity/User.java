package com.example.bizprofile.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String name;


    public User() {

    }
}
