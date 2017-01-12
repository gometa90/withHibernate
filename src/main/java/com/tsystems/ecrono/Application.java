package com.tsystems.ecrono;

import org.hibernate.Session;

import com.tsystems.ecrono.configuration.HibernateUtil;

public class Application {

    public static void main(final String args[]) {

	Session session = HibernateUtil.getSession();

	session.disconnect();
    }
}
