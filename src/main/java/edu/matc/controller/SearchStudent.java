package edu.matc.controller;

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
        urlPatterns = {"/searchStudent"}
)

public class SearchStudent extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
                throws ServletException, IOException {

        GenericDao studentDao = new GenericDao(Student.class);

        if (req.getParameter("submit").equals("search")) {
            req.setAttribute("students", studentDao.getByLastName(req.getParameter("searchTerm")));
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("/results.jsp");

        dispatcher.forward(req, resp);
    }
}
