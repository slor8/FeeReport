package edu.matc.controller;

import edu.matc.entity.Accountant;
import edu.matc.entity.Student;
import edu.matc.persistence.GenericDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        urlPatterns = {"/deleteStudent"}
)
public class DeleteStudent extends HttpServlet {

    private final Logger log = LogManager.getLogger(this.getClass());

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao studentDao = new GenericDao(Student.class);

        String studentId = req.getParameter("id");

        int id = Integer.parseInt(studentId);
        studentDao.delete(studentDao.getById(id));

        //RequestDispatcher dispatcher = req.getRequestDispatcher("viewUser");
        //dispatcher.forward(req, resp);
        resp.sendRedirect("viewStudent");
    }
}
