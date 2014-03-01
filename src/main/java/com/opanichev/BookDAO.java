package com.opanichev;

/**
 * Created by Oleg on 01.03.14.
 */
public interface BookDAO {
    public void addBook(Book b);
    public Book findBook(int id);
    public void removeBook(Book b);
}
