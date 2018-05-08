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
        assertEquals(2, students.size());
    }

    @Test
    void getStudentByLastNameSuccess() {
        List<Student> students = genericDao.getByLastName("o");
        assertEquals(2, students.size());
    }

    @Test
    void getByIdSuccess() {
        Student retrievedAccount = (Student)genericDao.getById(1);
        assertNotNull(retrievedAccount);
        assertEquals("Rachel", retrievedAccount.getFirst_name());
    }

    @Test
    void insertSuccess() {

       GenericDao accountantDao = new GenericDao(Accountant.class);

       Accountant accountant = (Accountant)accountantDao.getById(1);
       Student newStudent = new Student("Alex", "Flintstone",
               "flintstonealex@rocketmail.com", "Writting Communcation", "1099", "1000", "99", "4320 North Gammon Road",
               "Madison", "Wisconsin","53701","608-353-4499", accountant);
       accountant.addStudent(newStudent);

       int id = genericDao.insert(newStudent);

       assertNotEquals(0,id);

       Student insertedStudent = (Student)genericDao.getById(id);
       assertEquals("Alex", insertedStudent.getFirst_name());
       assertNotNull(insertedStudent.getAccountant());
       assertEquals("Joe", insertedStudent.getAccountant().getFirst_name());

    }

    @Test
    void deleteSuccess() {
        genericDao.delete(genericDao.getById(2));
        assertNull(genericDao.getById(2));
    }

    @Test
    void updateSuccess() {
        String newFirstName = "Brian";
        Student studentToUpdate = (Student)genericDao.getById(1);
        studentToUpdate.setLast_name(newFirstName);
        genericDao.saveOrUpdate(studentToUpdate);
        Student retrievedStudent = (Student)genericDao.getById(1);
        assertEquals(studentToUpdate, retrievedStudent);
    }

    @Test
    void getByPropertyEqualSuccess() {
        List<Student> students = genericDao.getByPropertyEqual("due", "0");
        assertEquals(1, students.size());
    }

    @Test
    void getByPropertyEqualThanSuccess() {
        List<Student> students = genericDao.getByPropertyGreaterThan("due", 0);
        assertEquals(1, students.size());
    }

    @Test
    void getByPropertyLikeSuccess() {
        List<Student> students = genericDao.getByPropertyLike("first_name", "r");
        assertEquals(2, students.size());
    }


}
