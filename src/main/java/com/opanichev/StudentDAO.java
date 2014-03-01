package com.opanichev;

/**
 * Created by Oleg on 01.03.14.
 */
public interface StudentDAO {
    public void addStudent(Student s);
    public Student findStudent(int id);
    public void removeStudent(Student s);
}
