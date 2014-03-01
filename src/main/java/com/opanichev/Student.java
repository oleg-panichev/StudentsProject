package com.opanichev;

/**
 * Created by Oleg on 01.03.14.
 */
@javax.persistence.Entity
public class Student {
    @id
    private int id;
    private String name;
    private float grade;

    public Student(int id, String name, float grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getGrade() {
        return grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return (id+", "+name+", "+grade);
    }
}
