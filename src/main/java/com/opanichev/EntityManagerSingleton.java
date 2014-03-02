package com.opanichev;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Oleg on 02.03.14.
 */
public class EntityManagerSingleton {
    private static final String UNIT_NAME="PUnit2";
    private static EntityManagerFactory factory;
    private static EntityManager em=null;
    private static EntityManagerSingleton ourInstance = new EntityManagerSingleton();

    public static EntityManager getEMs() {
        if(em==null) {
            factory=Persistence.createEntityManagerFactory(UNIT_NAME);
            em=factory.createEntityManager();
        }
        return em;
    }

    private EntityManagerSingleton() {
    }
}
