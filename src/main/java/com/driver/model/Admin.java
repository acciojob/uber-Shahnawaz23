package com.driver.model;

import com.driver.model.Enum.Gender;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    @Column(unique = true, nullable = false)
    String email;

    Gender gender;

    @CreationTimestamp
    Date dateCreated;
}