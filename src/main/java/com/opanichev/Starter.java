package com.opanichev;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Oleg on 01.03.14.
 */
public class Starter {
    private static final String UNIT_NAME="Student";
    private static EntityManagerFactory factory;

    public static void main(String[] args) {
        String db="jdbc:derby:D:\\Dropbox\\Java\\studentDb";
        StudentDAOdb sdao=new StudentDAOdb(db);

        //System.out.println(sdao.findStudent(1));
        //System.out.println(sdao.findStudent(2));

        factory= Persistence.createEntityManagerFactory(UNIT_NAME);
        EntityManager em=factory.createEntityManager();
        Student s = null;

        try {
            s=em.find(Student.class,1);
            System.out.println(s);

            em.getTransaction().begin();
            em.persist(new Student("Bob",(float)4.3));
            em.getTransaction().commit();

            s=em.find(Student.class,4);
            System.out.println(s);
        }
        catch (Exception e) {

        }
    }
}
