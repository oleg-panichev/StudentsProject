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
//        String db="jdbc:derby:D:\\Dropbox\\Java\\StudentsProject\\studentDb";
//        StudentDAOdb sdao=new StudentDAOdb(db);

        factory= Persistence.createEntityManagerFactory("Student");
        EntityManager em=factory.createEntityManager();
        StudentDAOorm sdaoo=new StudentDAOorm(em);
        //sdaoo.addStudent(new Student("Oleg",5));
        //sdaoo.addStudent(new Student("Alena",5));
        BookDAOorm bdaoo=new BookDAOorm(em);
        Book b=new Book("Bible",sdaoo.findStudent(1));
        bdaoo.addBook(b);
        b=new Book("423432",sdaoo.findStudent(2));
        bdaoo.addBook(b);
        b=new Book("Bisdgdfgsble",sdaoo.findStudent(1));
        bdaoo.addBook(b);
        Book book=bdaoo.findBook(1);
        System.out.println(book.toString());
    }
}
