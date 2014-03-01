package com.opanichev;

import javax.persistence.*;
import javax.persistence.metamodel.CollectionAttribute;
import java.util.Collection;

/**
 * Created by Oleg on 01.03.14.
 */
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String sname;
    private float grade;
    @OneToMany(mappedBy = "owner")
    private Collection<Book> books;

    public Student() {}

    public Student(String name, float grade) {
        this.sname = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return sname;
    }

    public float getGrade() {
        return grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String sname) {
        this.sname = sname;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return (id+", "+sname+", "+grade);
    }
}
