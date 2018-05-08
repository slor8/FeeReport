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
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet (
        urlPatterns = {"/updateStudent"}
)
public class UpdateStudent extends HttpServlet {

    private final Logger log = LogManager.getLogger(this.getClass());

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        GenericDao studentDao = new GenericDao(Student.class);

        String studentId = req.getParameter("id");
        int id = Integer.parseInt(studentId);

        HttpSession session = req.getSession();
        session.setAttribute("student", studentDao.getById(id));

        RequestDispatcher dispatcher = req.getRequestDispatcher("/updateStudent.jsp");
        dispatcher.forward(req, resp);

    }
}
