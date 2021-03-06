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

        urlPatterns = {"/viewStudent"}
)
public class ViewStudent extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
                throws ServletException, IOException {

        GenericDao studentDao = new GenericDao(Student.class);

        req.setAttribute("students", studentDao.getAll());

        RequestDispatcher dispatcher = req.getRequestDispatcher("/viewStudent.jsp");
        dispatcher.forward(req, resp);

    }
}
