package pl.myapp.java.reservationsystem.domain.guest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstname;
    private String lastname;
    private int age;

    public Guest() {
    }

    public Guest(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public String getFirstname() { return firstname; }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public void setId(long id) {
        this.id = id;
    }
}
