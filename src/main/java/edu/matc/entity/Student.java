package edu.matc.entity;

import java.time.LocalDateTime;

/**
 * The type Student.
 */
public class Student {

    private int rollNumber;
    private String firstName;
    private String lastName;
    private String email;
    private String course;
    private String fee;
    private String paid;
    private String due;
    private String address;
    private String city;
    private String state;
    private String country;
    private int phone;
    private LocalDateTime registeredDate;


    /**
     * Instantiates a new Student.
     */
    public Student() {
    }

    /**
     * Instantiates a new Student.
     *
     * @param rollNumber     the roll number
     * @param firstName      the first name
     * @param lastName       the last name
     * @param email          the email
     * @param course         the course
     * @param fee            the fee
     * @param paid           the paid
     * @param due            the due
     * @param address        the address
     * @param city           the city
     * @param state          the state
     * @param country        the country
     * @param phone          the phone
     * @param registeredDate the registered date
     */
    public Student(int rollNumber, String firstName, String lastName, String email,
                   String course, String fee, String paid, String due, String address,
                   String city, String state, String country, int phone, LocalDateTime registeredDate) {

        this.rollNumber = rollNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.course = course;
        this.fee = fee;
        this.paid = paid;
        this.due = due;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.phone = phone;
        this.registeredDate = registeredDate;
    }

    /**
     * Gets roll number.
     *
     * @return the roll number
     */
    public int getRollNumber() {
        return rollNumber;
    }

    /**
     * Sets roll number.
     *
     * @param rollNumber the roll number
     */
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
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
     * Gets course.
     *
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * Sets course.
     *
     * @param course the course
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * Gets fee.
     *
     * @return the fee
     */
    public String getFee() {
        return fee;
    }

    /**
     * Sets fee.
     *
     * @param fee the fee
     */
    public void setFee(String fee) {
        this.fee = fee;
    }

    /**
     * Gets paid.
     *
     * @return the paid
     */
    public String getPaid() {
        return paid;
    }

    /**
     * Sets paid.
     *
     * @param paid the paid
     */
    public void setPaid(String paid) {
        this.paid = paid;
    }

    /**
     * Gets due.
     *
     * @return the due
     */
    public String getDue() {
        return due;
    }

    /**
     * Sets due.
     *
     * @param due the due
     */
    public void setDue(String due) {
        this.due = due;
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
     * Gets city.
     *
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets city.
     *
     * @param city the city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets state.
     *
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * Sets state.
     *
     * @param state the state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets country.
     *
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets country.
     *
     * @param country the country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Gets phone.
     *
     * @return the phone
     */
    public int getPhone() {
        return phone;
    }

    /**
     * Sets phone.
     *
     * @param phone the phone
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

    /**
     * Gets registered date.
     *
     * @return the registered date
     */
    public LocalDateTime getRegisteredDate() {
        return registeredDate;
    }

    /**
     * Sets registered date.
     *
     * @param registeredDate the registered date
     */
    public void setRegisteredDate(LocalDateTime registeredDate) {
        this.registeredDate = registeredDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", course='" + course + '\'' +
                ", fee='" + fee + '\'' +
                ", paid='" + paid + '\'' +
                ", due='" + due + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", phone=" + phone +
                ", registeredDate=" + registeredDate +
                '}';
    }
}
