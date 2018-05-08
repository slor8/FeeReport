package edu.matc.controller;

import edu.matc.entity.Accountant;
import edu.matc.entity.Student;
import edu.matc.persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        urlPatterns = {"/addStudent"}
)

public class AddStudent extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        GenericDao accountantDao = new GenericDao(Accountant.class);
        GenericDao studentDao = new GenericDao(Student.class);
        Student student = new Student();

        List<Accountant> accountantList = accountantDao.getAccountantId(req.getRemoteUser());
        int accountId = accountantList.get(0).getId();
        Accountant accountantStudent;
        accountantStudent = (Accountant)accountantDao.getById(accountId);

        String name = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String email = req.getParameter("email");
        String course = req.getParameter("course");
        String fee = req.getParameter("fee");
        String paid = req.getParameter("paid");
        String due = req.getParameter("due");
        String address = req.getParameter("address");
        String city = req.getParameter("city");
        String state = req.getParameter("state");
        String zipCode = req.getParameter("zipCode");
        String phone = req.getParameter("phone");

        student.setFirst_name(name);
        student.setLast_name(lastName);
        student.setEmail(email);
        student.setCourse(course);
        student.setFee(fee);
        student.setPaid(paid);
        student.setDue(due);
        student.setAddress(address);
        student.setCity(city);
        student.setState(state);
        student.setZipCode(zipCode);
        student.setPhone(phone);
        student.setAccountant(accountantStudent);

        studentDao.insert(student);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/addStudentSuccess.jsp");
        dispatcher.forward(req, resp);
    }
}
