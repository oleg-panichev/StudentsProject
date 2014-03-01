package com.opanichev;

import javax.persistence.*;

/**
 * Created by Oleg on 01.03.14.
 */
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bid;
    private String title;
    @ManyToOne
    @JoinColumn(name="id")
    private Student owner;

    public Book() {
    }

    public Book(String title, Student owner) {
        this.title = title;
        this.owner = owner;
    }

    public String getTitle() {
        return title;
    }

    public Student getOwner() {
        return owner;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int id) {
        this.bid = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOwner(Student owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", title='" + title + '\'' +
                ", owner=" + owner +
                '}';
    }
}
