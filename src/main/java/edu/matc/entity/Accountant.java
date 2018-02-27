package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * The type Accountant.
 */
@Entity(name = "Accountant")
@Table(name = "accountant")
public class Accountant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "address")
    private String address;


    @Column(name = "contact")
    private String contact;

    @OneToMany(mappedBy = "accountant", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Student> students = new HashSet<>();

    /**
     * Instantiates a new Accountant.
     */
    public Accountant() {
    }

    /**
     * Instantiates a new Accountant.
     *
     * @param firstName the first name
     * @param lastName  the last name
     * @param email     the email
     * @param password  the password
     * @param address   the address
     * @param contact   the contact
     */
    public Accountant(String firstName, String lastName, String email, String password, String address, String contact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.address = address;
        this.contact = contact;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets contact.
     *
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * Sets contact.
     *
     * @param contact the contact
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * Gets students.
     *
     * @return the students
     */
    public Set<Student> getStudents() {
        return students;
    }

    /**
     * Sets students.
     *
     * @param students the students
     */
    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
        student.setAccountant(this);
    }

    public void removeStudent(Student student) {
        students.remove(student);
        student.setAccountant(null);
    }

    @Override
    public String toString() {
        return "Accountant{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Accountant accountant = (Accountant) o;
        return id == accountant.id &&
                Objects.equals(firstName, accountant.firstName) &&
                Objects.equals(lastName, accountant.lastName) &&
                Objects.equals(email, accountant.email) &&
                Objects.equals(password, accountant.password) &&
                Objects.equals(address, accountant.address) &&
                Objects.equals(contact, accountant.contact);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName, email, password, address, contact);
    }
}
