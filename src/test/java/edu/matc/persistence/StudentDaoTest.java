package edu.matc.persistence;

import edu.matc.entity.Accountant;
import edu.matc.entity.Student;
import edu.matc.test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StudentDaoTest {

    GenericDao genericDao;

    @BeforeEach
    void setUp() {
        genericDao = new GenericDao(Student.class);

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    @Test
    void getAllStudentSuccess() {
        List<Student> students = genericDao.getAll();
        assertEquals(6, students.size());
    }

    @Test
    void getAccountsByLastNameSuccess() {
        List<Student> students = genericDao.getAccountsByLastName("n");
        assertEquals(5, students.size());
    }

    @Test
    void getByIdSuccess() {
        Student retrievedAccount = (Student)genericDao.getById(3);
        assertNotNull(retrievedAccount);
        assertEquals("Barney", retrievedAccount.getFirst_name());
    }

    @Test
    void insertSuccess() {

       GenericDao accountantDao = new GenericDao(Accountant.class);

       Accountant accountant = (Accountant)accountantDao.getById(1);
       Student newStudent = new Student("Alex", "Flintstone",
               "flintstonealex@rocketmail.com", "Writting Communcation", "1099", "1000", "99", "4320 North Gammon Road",
               "Madison", "Wisconsin","608-353-4499", accountant);
       accountant.addStudent(newStudent);

       int id = genericDao.insert(newStudent);

       assertNotEquals(0,id);

       Student insertedStudent = (Student)genericDao.getById(id);
       assertEquals("Alex", insertedStudent.getFirst_name());
       assertNotNull(insertedStudent.getAccountant());
       assertEquals("Joe", insertedStudent.getAccountant().getFirstName());

    }

    @Test
    void deleteSuccess() {
        genericDao.delete(genericDao.getById(3));
        assertNull(genericDao.getById(3));
    }

    @Test
    void updateSuccess() {
        String newFirstName = "Brian";
        Student studentToUpdate = (Student)genericDao.getById(3);
        studentToUpdate.setLast_name(newFirstName);
        genericDao.saveOrUpdate(studentToUpdate);
        Student retrievedStudent = (Student)genericDao.getById(3);
        assertEquals(studentToUpdate, retrievedStudent);
    }

    @Test
    void getByPropertyEqualSuccess() {
        List<Student> students = genericDao.getByPropertyEqual("firstName", "Barney");
        assertEquals(1, students.size());
        assertEquals(3, students.get(0).getId());
    }

    @Test
    void getByPropertyLikeSuccess() {
        List<Student> students = genericDao.getByPropertyLike("firstName", "b");
        assertEquals(3, students.size());
    }
}
