package com.driver.model;

import com.driver.model.Enum.Gender;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.sql.Date;

public class Driver {

    int id;

    String Name;

    @Column(unique = true, nullable = false)
    String email;

    String password;

    int age;

    @Enumerated(EnumType.STRING)
    Gender gender;

    @CreationTimestamp
    Date date;
}