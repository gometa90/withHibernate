package com.tsystems.ecrono;

import org.hibernate.Session;

import com.tsystems.ecrono.configuration.HibernateUtil;
import com.tsystems.ecrono.domain.RaceEntity;

public class Application {

    public static void main(final String args[]) {

	RaceEntity raceEntityPrueba = new RaceEntity();
	raceEntityPrueba.get
	Session session = HibernateUtil.getSession();

	session.disconnect();
    }
}
