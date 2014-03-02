package com.opanichev;

/**
 * Created by Oleg on 02.03.14.
 */
public abstract class DAOFactory {
    public static final int DERBY = 1;
    public static final int MYSQL = 2;

    public abstract StudentDAO getStudentDAO();
    public abstract BookDAO getBookDAO();

    public static DAOFactory getDAOFactory(int factoryType) {
        switch (factoryType) {
            case DERBY:
                return new DerbyDAOFactory();
            case MYSQL:
                return null;
            default:
                return null;
        }
    }
}
