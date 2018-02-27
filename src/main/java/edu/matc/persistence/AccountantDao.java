package edu.matc.persistence;

import edu.matc.entity.Accountant;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class AccountantDao {

    private final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    public List<Accountant> getAllAccountants() {

        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Accountant> query = builder.createQuery(Accountant.class);
        Root<Accountant> root = query.from(Accountant.class);
        List<Accountant> accountants = session.createQuery(query).getResultList();
        session.close();
        return accountants;
    }

    public List<Accountant> getUsersByLastName(String lastName) {

        logger.debug("Searching for: {}", lastName);

        Session session = sessionFactory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Accountant> query = builder.createQuery(Accountant.class);
        Root<Accountant> root = query.from(Accountant.class);
        Expression<String> propertyPath = root.get("lastName");
        query.where(builder.like(propertyPath, "%" + lastName + "%"));
        List<Accountant> accountants = session.createQuery(query).getResultList();
        session.close();
        return accountants;
    }

    public Accountant getById(int id) {
        Session session = sessionFactory.openSession();
        Accountant accountant = session.get(Accountant.class, id);
        session.close();
        return accountant;
    }

    public void saveOrUpdate(Accountant accountant) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(accountant);
        transaction.commit();
        session.close();
    }

    public int insert(Accountant accountant) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(accountant);
        transaction.commit();
        session.close();
        return id;
    }

    public void delete(Accountant accountant) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(accountant);
        transaction.commit();
        session.close();
    }

    public List<Accountant> getByPropertyEqual(String propertyName, String value) {
        Session session = sessionFactory.openSession();

        logger.debug("Searching for Accountant with " + propertyName + " = " + value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Accountant> query = builder.createQuery( Accountant.class );
        Root<Accountant> root = query.from( Accountant.class );
        query.select(root).where(builder.equal(root.get(propertyName), value));
        List<Accountant> accountants = session.createQuery( query ).getResultList();

        session.close();
        return accountants;
    }

    public List<Accountant> getByPropertyLike(String propertyName, String value) {
        Session session = sessionFactory.openSession();

        logger.debug("Searching for Accountant with {} = {}",  propertyName, value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Accountant> query = builder.createQuery( Accountant.class );
        Root<Accountant> root = query.from( Accountant.class );
        Expression<String> propertyPath = root.get(propertyName);

        query.where(builder.like(propertyPath, "%" + value + "%"));

        List<Accountant> accountants = session.createQuery( query ).getResultList();
        session.close();
        return accountants;
    }


}
