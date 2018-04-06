package edu.matc.controller;

import edu.matc.entity.Accountant;
import edu.matc.persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ViewAccountant  extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao accountantDao = new GenericDao(Accountant.class);

        req.setAttribute("accountants", accountantDao.getAll());

        RequestDispatcher dispatcher = req.getRequestDispatcher("/viewAccountant.jsp");
        dispatcher.forward(req, resp);

    }
}
