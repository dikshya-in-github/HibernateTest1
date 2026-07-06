package io.virinchi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

//@ - Annotations -> Helps to retrieve respective API's from dependencies.
@Entity //Entity - This needs to be a table in db
public class UserClass {

    @Id //Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)    //Auto-Increment
    private int id;
    private String name;


}
