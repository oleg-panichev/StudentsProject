package com.opanichev;

/**
 * Created by Oleg on 01.03.14.
 */
public class Starter {
    public static void main(String[] args) {
        String db="jdbc:derby:D:\\Dropbox\\Java\\studentDb";
        StudentDAOdb sdao=new StudentDAOdb(db);

        System.out.println(sdao.findStudent(1));
        System.out.println(sdao.findStudent(2));
    }
}
