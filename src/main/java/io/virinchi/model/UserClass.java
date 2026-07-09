package io.virinchi.model;

import jakarta.persistence.*;

//@ - Annotations -> Helps to retrieve respective API's from dependencies.
@Entity //Entity - This needs to be a table in db
public class UserClass {

    @Id //Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)    //Auto-Increment
    private int id;
    private String name;

    @ManyToOne
    @JoinColumn(name="addressId")
    private AddressClass addressClass;

    public AddressClass getAddressClass() {
        return addressClass;
    }

    public void setAddressClass(AddressClass addressClass) {
        this.addressClass = addressClass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//Exam ma hibernate ko auta ques auxa which is
//
