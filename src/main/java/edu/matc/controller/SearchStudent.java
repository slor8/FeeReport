package edu.matc.controller;

import edu.matc.entity.Accountant;
import edu.matc.persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * A simple servlet to welcome the user.
 * @author pwaite
 */

@WebServlet(
        urlPatterns = {"/searchAccountant"}
)

public class SearchStudent extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        GenericDao accountantDao = new GenericDao(Accountant.class);

        if (req.getParameter("submit").equals("search")) {
            req.setAttribute("accountants", accountantDao.getAccountsByLastName(req.getParameter("searchTerm")));
        } else {
            req.setAttribute("accountants", accountantDao.getAll());
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/results.jsp");
        dispatcher.forward(req, resp);
    }
}