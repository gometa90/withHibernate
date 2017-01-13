package com.tsystems.ecrono.testRepository;

import org.hibernate.Session;

import com.tsystems.ecrono.configuration.HibernateUtil;

public abstract class SessionManager {

    public void doSomething() {
	Session session = HibernateUtil.getSession();
	try {
	    execute(session);
	} finally {
	    session.close();
	}
    }

    protected abstract void execute(Session session);
}
