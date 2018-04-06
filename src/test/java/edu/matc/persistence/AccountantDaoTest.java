package edu.matc.persistence;

import edu.matc.entity.Accountant;
import edu.matc.entity.Student;
import edu.matc.test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class AccountantDaoTest {

    GenericDao genericDao;

    @BeforeEach
    void setUp() {
        genericDao = new GenericDao(Accountant.class);

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    @Test
    void getAllAccountantSuccess() {
        List<Accountant> accountants = genericDao.getAll();
        assertEquals(6, accountants.size());
    }

    @Test
    void getAccountantsByLastNameSuccess() {
        List<Accountant> accountants = genericDao.getByLastName("c");
        assertEquals(3, accountants.size());
    }

    @Test
    void getByIdSuccess() {
        Accountant retrievedAccount = (Accountant)genericDao.getById(3);
        assertNotNull(retrievedAccount);
        assertEquals("Barney", retrievedAccount.getFirst_name());
    }

    @Test
    void insertSuccess() {

        Accountant newAccountant = new Accountant("Alex", "Flintstone", "aflintstone",
                "flintstonealex@rocketmail.com", "alex", "4320 North Gammon Road",
                "608-353-4499");

        int id = genericDao.insert(newAccountant);

        assertNotEquals(0,id);

        Accountant insertedAccountant = (Accountant)genericDao.getById(id);

        assertEquals("Alex", insertedAccountant.getFirst_name());
    }

    @Test
    void insertWithStudentSuccess() {

        Accountant newAccountant = new Accountant("Alex", "Flintstone", "aflintstone",
                    "flintstonealex@rocketmail.com", "alex", "4320 North Gammon Road",
                    "608-353-4499");

        String studentFirstName = "Jessica";
        String studentLastName = "Biden";
        String studentEmail = "bidenjessica@yahoo.com";
        String studentCourse = "Introduction To PHP";
        String studentFee = "1034";
        String studentPaid = "934";
        String studentDue = "100";
        String studentAddress = "203 Monroe Street";
        String studentCity = "Madison";
        String studentState = "Wisconsin";
        String studentPhone = "608-344-4430";

        Student student = new Student(studentFirstName, studentLastName,
                    studentEmail, studentCourse, studentFee, studentPaid, studentDue, studentAddress,
                    studentCity, studentState, studentPhone, newAccountant);

        newAccountant.addStudent(student);

        int id = genericDao.insert(newAccountant);
        assertNotEquals(0, id);
        Accountant insertedAccountant = (Accountant)genericDao.getById(id);
        assertEquals("Alex", insertedAccountant.getFirst_name());
        assertEquals(1, insertedAccountant.getStudents().size());

    }

    @Test
    void deleteSuccess() {
        genericDao.delete(genericDao.getById(3));
        assertNull(genericDao.getById(3));
    }

    @Test
    void updateSuccess() {
        String newLastName = "Davis";
        Accountant accountantToUpdate = (Accountant)genericDao.getById(3);
        accountantToUpdate.setLast_name(newLastName);
        genericDao.saveOrUpdate(accountantToUpdate);
        Accountant retrievedAccountant = (Accountant)genericDao.getById(3);
        assertEquals(accountantToUpdate, retrievedAccountant);
    }

    @Test
    void getByPropertyEqualSuccess() {
        List<Accountant> accountants = genericDao.getByPropertyEqual("last_name", "Curry");
        assertEquals(1, accountants.size());
        assertEquals(3, accountants.get(0).getId());
    }

    @Test
    void getByPropertyLikeSuccess() {
        List<Accountant> accountants = genericDao.getByPropertyLike("last_name", "c");
        assertEquals(3, accountants.size());
    }
}
