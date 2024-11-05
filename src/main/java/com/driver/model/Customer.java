package com.driver.model;

import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.util.Date;

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    @Column(unique = true, nullable = false)
    String email;

    @Enumerated(EnumType.STRING)
    Gender gender;

    @CreationTimestamp
    Date creationDate;


}