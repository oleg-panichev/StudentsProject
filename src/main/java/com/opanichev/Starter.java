package com.opanichev;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by Oleg on 01.03.14.
 */
public class Starter {
//    private static final String UNIT_NAME="Student";
//    private static EntityManagerFactory factory;

    public static void main(String[] args) {
//        String db="jdbc:derby:D:\\Dropbox\\Java\\StudentsProject\\studentDb";
//        StudentDAOdb sdao=new StudentDAOdb(db);

//        factory= Persistence.createEntityManagerFactory("Student");
//        EntityManager em=factory.createEntityManager();
//        StudentDAOorm sdaoo=new StudentDAOorm(em);
//        sdaoo.addStudent(new Student("Oleg",5));
//        sdaoo.addStudent(new Student("Alena",5));
//        sdaoo.addStudent(new Student("Bob",3));
//        BookDAOorm bdaoo=new BookDAOorm(em);
//        Book b=new Book("Bible",sdaoo.findStudent(1));
//        bdaoo.addBook(b);
//        b=new Book("423432",sdaoo.findStudent(2));
//        bdaoo.addBook(b);
//        b=new Book("Bisdgdfgsble",sdaoo.findStudent(1));
//        bdaoo.addBook(b);
//        Book book=bdaoo.findBook(1);
//        System.out.println(book.toString());

//        TypedQuery<Student> query=em.createQuery("SELECT s FROM Student s WHERE s.grade=5",Student.class);
//        List<Student> listS=null;
//        listS=query.getResultList();
//        em.close();
//        if(listS!=null) {
//            for(Student s:listS)
//                System.out.println(s.toString());
//        }

//        TypedQuery<Book> query=em.createQuery("SELECT b FROM Book b, Student s WHERE b.owner.id=s.id AND s.sname LIKE '%Oleg%'",Book.class);
//        List<Book> listB=null;
//        listB=query.getResultList();
//        em.close();
//        if(listB!=null) {
//            for(Book b:listB)
//                System.out.println(b.toString());
//        } else {
//            System.out.println("listB==null");
//        }

        //Join
        //TypedQuery<String> q=em.createQuery("SELECT c.name FROM Payment p, Customer c WHERE
        // c.id=p.customerId AND p.total >500.0",String.class);
//        TypedQuery<String> q=em.createQuery("SELECT COUNT(b) FROM Student s, Boob b WHERE b.owner.id=sid AND name LIKI \"%vasya%\"");

//        TypedQuery<Student> query=em.createQuery("SELECT s FROM Student s ORDER BY s.sname",Student.class);
//        List<Student> listB=null;
//        listB=query.getResultList();
//        em.close();
//        if(listB!=null) {
//            for(Student b:listB)
//                System.out.println(b.toString());
//        } else {
//            System.out.println("listB==null");
//        }
        DAOFactory daof=DAOFactory.getDAOFactory(1);
        StudentDAO sdao=daof.getStudentDAO();
        Student s=sdao.findStudent(1);
        if(s!=null)
            System.out.println(s.toString());
        else
            System.out.println("No students found!");

        s=sdao.findStudent(2);
        if(s!=null)
            System.out.println(s.toString());
        else
            System.out.println("No students found!");

        sdao.addStudent(new Student("Grisha",4));
    }
}
