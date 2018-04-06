package edu.matc.controller;

import edu.matc.entity.Accountant;
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


@WebServlet (
        urlPatterns = {"/addAccountant"}
)

public class AddAccountant extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        Accountant accountant = new Accountant();
        GenericDao  accountantDao = new GenericDao(Accountant.class);

        accountant.setFirst_name(req.getParameter("firstName"));
        accountant.setLast_name(req.getParameter("lastName"));
        accountant.setUser_name(req.getParameter("userName"));
        accountant.setEmail(req.getParameter("email"));
        accountant.setPassword(req.getParameter("password"));
        accountant.setAddress(req.getParameter("address"));
        accountant.setContact(req.getParameter("contact"));

        accountantDao.insert(accountant);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/addAccountantSuccess.jsp");
        dispatcher.forward(req, resp);



    }
}
