package edu.matc.controller;

import edu.matc.entity.Accountant;
import edu.matc.entity.Student;
import edu.matc.persistence.GenericDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        urlPatterns = {"/updateStudent2"}
)
public class UpdateStudent2 extends HttpServlet{

    private final Logger log = LogManager.getLogger(this.getClass());

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String studentId = req.getParameter("id");
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String email = req.getParameter("email");
        String course = req.getParameter("course");
        String fee = req.getParameter("fee");
        String paid = req.getParameter("paid");
        String due = req.getParameter("due");
        String address = req.getParameter("address");
        String city = req.getParameter("city");
        String state = req.getParameter("state");
        String zip = req.getParameter("zipCode");
        String phone = req.getParameter("phone");

        try {

            GenericDao<Student> studentDao = new GenericDao<>(Student.class);
            Student student = studentDao.getById(Integer.valueOf(studentId));

            if (firstName != null && firstName.length() > 0) {
                student.setFirst_name(firstName);
            }
            if (lastName != null && lastName.length() > 0) {
               student.setLast_name(lastName);
            }
            if (email != null && email.length() > 0) {
                student.setEmail(email);
            }
            if (course != null && course.length() > 0) {
                student.setCourse(course);
            }
            if (fee != null && fee.length() > 0) {
                student.setFee(fee);
            }
            if (paid != null && paid.length() > 0) {
                student.setPaid(paid);
            }
            if (due != null && due.length() > 0) {
                student.setDue(due);
            }
            if (address != null && address.length() > 0) {
                student.setAddress(address);
            }
            if (city != null && city.length() > 0) {
                student.setCity(city);
            }
            if (state != null && state.length() > 0) {
                student.setState(state);
            }
            if (zip != null && zip.length() > 0) {
                student.setZipCode(zip);
            }
            if (phone != null && phone.length() > 0) {
                student.setPhone(phone);
            }

            log.info(req.getParameter("firstName"));
            log.info(req.getParameter("lastName"));
            log.info(req.getParameter("email"));
            log.info(req.getParameter("course"));
            log.info(req.getParameter("fee"));
            log.info(req.getParameter("paid"));
            log.info(req.getParameter("due"));
            log.info(req.getParameter("address"));
            log.info(req.getParameter("city"));
            log.info(req.getParameter("state"));
            log.info(req.getParameter("zip"));

            studentDao.saveOrUpdate(student);

        } catch (Exception e) {

            log.error("Error Occurred Updated Student Information" + e);
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("/updateStudentSuccess.jsp");
        dispatcher.forward(req, resp);
    }
}
