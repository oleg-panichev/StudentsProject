package com.opanichev;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Oleg on 01.03.14.
 */
public class BookDAOorm implements BookDAO {
    private static final String UNIT_NAME="Book";
    private static EntityManagerFactory factory;
    private EntityManager em;

    public BookDAOorm() {
        //factory= Persistence.createEntityManagerFactory(UNIT_NAME);
        //em=factory.createEntityManager();
        this.em=EntityManagerSingleton.getEMs();
    }

    public BookDAOorm(EntityManager em) {
        this.em = em;
    }

    @Override
    public void addBook(Book b) {
        em.getTransaction().begin();
        em.persist(b);
        em.getTransaction().commit();
    }

    @Override
    public Book findBook(int id) {
        return em.find(Book.class,id);
    }

    @Override
    public void removeBook(Book b) {
        em.getTransaction().begin();
        em.remove(b);
        em.getTransaction().commit();
    }
}
