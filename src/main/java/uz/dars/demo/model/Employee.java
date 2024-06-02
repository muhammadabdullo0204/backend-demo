package uz.dars.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "First_name")
    private String FirstName;

    @Column(name = "Last_name")
    private String LastName;

    @Column(name = "Email_Id")
    private String EmailId;


    public Employee() {
    }

    public Employee(long id, String firstName, String lastName, String emailId) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        EmailId = emailId;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String emailId) {
        EmailId = emailId;
    }

}
