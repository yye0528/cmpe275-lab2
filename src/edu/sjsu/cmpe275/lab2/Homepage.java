package edu.sjsu.cmpe275.lab2;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@DynamicUpdate
@Table(appliesTo="homepage")
public class Homepage {
    @Id
    @GeneratedValue
    private String id;

    @Column(name="firstname")
    private String firstname;

    @Column(name="lastname")
    private String lastname;

    @Column(name="email")
    private String email;

    @Column(name="address")
    private String address;

    @Column(name="organization")
    private String organization;

    @Column(name="about")

    private String aboutMyself;
    public Homepage() {
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getAboutMyself() {
        return aboutMyself;
    }

    public void setAboutMyself(String aboutMyself) {
        this.aboutMyself = aboutMyself;
    }
}
