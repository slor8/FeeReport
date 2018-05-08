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
        urlPatterns = {"/updateAccountant2"}
)
public class UpdateAccountant2 extends HttpServlet {

    private final Logger log = LogManager.getLogger(this.getClass());

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String accountantId = req.getParameter("id");
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String username = req.getParameter("userName");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String address = req.getParameter("address");
        String contact = req.getParameter("contact");

        try {

            GenericDao<Accountant> accountantDao = new GenericDao<>(Accountant.class);
            Accountant accountant = accountantDao.getById(Integer.valueOf(accountantId));

            if (firstName != null && firstName.length() > 0) {
                accountant.setFirst_name(firstName);
            }
            if (lastName != null && firstName.length() > 0) {
                accountant.setLast_name(lastName);
            }
            if (username != null && username.length() > 0) {
                accountant.setUser_name(username);
            }
            if (password != null && password.length() > 0) {
                accountant.setPassword(password);
            }
            if (email != null && email.length() > 0) {
                accountant.setEmail(email);
            }
            if (address != null && address.length() > 0) {
                accountant.setAddress(address);
            }
            if (contact != null && contact.length() > 0) {
                accountant.setContact(contact);
            }

            log.info(req.getParameter("firstName"));
            log.info(req.getParameter("lastName"));
            log.info(req.getParameter("username"));
            log.info(req.getParameter("password"));
            log.info(req.getParameter("email"));
            log.info(req.getParameter("address"));
            log.info(req.getParameter("contact"));

            accountantDao.saveOrUpdate(accountant);

        } catch (Exception e) {

            log.error("Error Occurred Updated User Information" + e);
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("/updateAccountantSuccess.jsp");
        dispatcher.forward(req, resp);
    }
}
