package edu.matc.controller;

import edu.matc.entity.Student;
import edu.matc.persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(

        urlPatterns = {"/dueFee"}
)
public class DueFee extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        GenericDao studentDao = new GenericDao(Student.class);
       // String dueFee = req.getParameter("due");

        Student student = new Student();
        String dueFee = student.getDue();
        String value = "0";

        //req.setAttribute("students", studentDao.getByPropertyEqualThan(dueFee, zero));
        req.setAttribute("students", studentDao.getByPropertyEqual(dueFee, value));


        RequestDispatcher dispatcher = req.getRequestDispatcher("/dueFee.jsp");
        dispatcher.forward(req, resp);

    }
}
