package com.driver.model;

import com.driver.model.Enum.Gender;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.util.Date;

public class Customer {

    int id;

    String name;

    @Column(unique = true, nullable = false)
    String email;

    String password;

    @Enumerated(EnumType.STRING)
    Gender gender;

    @CreationTimestamp
    Date creationDate;


}