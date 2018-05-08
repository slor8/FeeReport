package edu.matc.controller;

import edu.matc.entity.Accountant;
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
        urlPatterns = {"/deleteAccountant"}
)

public class DeleteAccountant extends HttpServlet {

    private final Logger log = LogManager.getLogger(this.getClass());

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao accountantDao = new GenericDao(Accountant.class);

        String accountantId = req.getParameter("id");

        int id = Integer.parseInt(accountantId);
        accountantDao.delete(accountantDao.getById(id));

        //RequestDispatcher dispatcher = req.getRequestDispatcher("viewUser");
        //dispatcher.forward(req, resp);
        resp.sendRedirect("viewAccountant");
    }
}
