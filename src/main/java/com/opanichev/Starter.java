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
        String db="jdbc:derby:D:\\Dropbox\\Java\\StudentsProject\\studentDb";
        StudentDAOdb sdao=new StudentDAOdb(db);

        StudentDAOorm sdaoo=new StudentDAOorm();

    }
}
