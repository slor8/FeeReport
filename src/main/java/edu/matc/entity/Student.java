package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

@Entity (name = "Student")
@Table (name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    private String first_name;
    private String last_name;
    private String email;
    private String course;
    private String fee;
    private String paid;
    private String due;
    private String address;
    private String city;
    private String state;
    private String phone;

    @ManyToOne
    private Accountant accountant;


    public Student() {
    }


    public Student(String first_name, String last_name, String email, String course, String fee, String paid, String due, String address, String city, String state, String phone, Accountant accountant) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.course = course;
        this.fee = fee;
        this.paid = paid;
        this.due = due;
        this.address = address;
        this.city = city;
        this.state = state;
        this.phone = phone;
        this.accountant = accountant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        this.due = due;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Accountant getAccountant() {
        return accountant;
    }

    public void setAccountant(Accountant accountant) {
        this.accountant = accountant;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", course='" + course + '\'' +
                ", fee='" + fee + '\'' +
                ", paid='" + paid + '\'' +
                ", due='" + due + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", phone='" + phone + '\'' +
                ", accountant=" + accountant +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(first_name, student.first_name) &&
                Objects.equals(last_name, student.last_name) &&
                Objects.equals(email, student.email) &&
                Objects.equals(course, student.course) &&
                Objects.equals(fee, student.fee) &&
                Objects.equals(paid, student.paid) &&
                Objects.equals(due, student.due) &&
                Objects.equals(address, student.address) &&
                Objects.equals(city, student.city) &&
                Objects.equals(state, student.state) &&
                Objects.equals(phone, student.phone) &&
                Objects.equals(accountant, student.accountant);

    }

    public int hashCode() {

        return Objects.hash(id , first_name, last_name, email, course, fee, paid, due, address, city, state, phone);
    }
}
