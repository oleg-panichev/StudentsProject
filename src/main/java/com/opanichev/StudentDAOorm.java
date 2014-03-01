package com.opanichev;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Oleg on 01.03.14.
 */
public class StudentDAOorm implements StudentDAO {
    private static final String UNIT_NAME="Student";
    private static EntityManagerFactory factory;
    private EntityManager em;

    public StudentDAOorm() {
        factory= Persistence.createEntityManagerFactory(UNIT_NAME);
        em=factory.createEntityManager();
    }

    @Override
    public void addStudent(Student s) {
        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();
    }

    @Override
    public Student findStudent(int id) {
        return em.find(Student.class,id);
    }
}
