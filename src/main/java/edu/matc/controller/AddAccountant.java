package edu.matc.controller;

import edu.matc.entity.Accountant;
import edu.matc.entity.Role;
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

        String accountantId = req.getParameter("id");

        String name = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String username = req.getParameter("userName");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String address = req.getParameter("address");
        String contact = req.getParameter("contact");
        String role = req.getParameter("role");

        accountant.setFirst_name(name);
        accountant.setLast_name(lastName);
        accountant.setUser_name(username);
        accountant.setEmail(email);
        accountant.setPassword(password);
        accountant.setAddress(address);
        accountant.setContact(contact);

        accountantDao.insert(accountant);

        Role accountantRole = new Role(accountant, username, role);

        GenericDao roleDao = new GenericDao(Role.class);

        roleDao.insert(accountantRole);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/addAccountantSuccess.jsp");
        dispatcher.forward(req, resp);



    }
}
