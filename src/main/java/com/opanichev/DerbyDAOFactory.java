package com.opanichev;

import javax.persistence.EntityManager;

/**
 * Created by Oleg on 02.03.14.
 */
public class DerbyDAOFactory extends DAOFactory {
    private EntityManager em;

    public DerbyDAOFactory() {
        this.em=EntityManagerSingleton.getEMs();
    }

    @Override
    public StudentDAO getStudentDAO() {
        return new StudentDAOorm();
    }

    @Override
    public BookDAO getBookDAO() {
        return new BookDAOorm();
    }
}
