package io.virinchi.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class AddressClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String address;

    @OneToMany(mappedBy = "addressClass")
    private List<UserClass> userClass;

    public List<UserClass> getUserClass() {
        return userClass;
    }

    public void setUserClass(List<UserClass> userClass) {
        this.userClass = userClass;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
