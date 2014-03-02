package com.opanichev;

import javax.persistence.EntityManager;

/**
 * Created by Oleg on 02.03.14.
 */
public class DerbyDAOFactory extends DAOFactory {
    EntityManager em;

    public DerbyDAOFactory() {
        em=EntityManagerSingleton.getEMs();
    }

    @Override
    public StudentDAO getStudentDAO() {
        return new StudentDAOorm(em);
    }

    @Override
    public BookDAO getBookDAO() {
        return new BookDAOorm(em);
    }
}
