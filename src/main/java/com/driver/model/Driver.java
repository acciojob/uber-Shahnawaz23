package com.driver.model;

import com.driver.model.Enum.Gender;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import java.sql.Date;

public class Driver {

    int id;

    String Name;

    @Column(unique = true, nullable = false)
    String email;

    String password;

    int age;

    Gender gender;

    @CreationTimestamp
    Date date;
}