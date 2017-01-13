package com.tsystems.ecrono;

import com.tsystems.ecrono.configuration.HibernateUtil;
import com.tsystems.ecrono.testRepository.GetClassificationListByRaceId;

public class Application {

    public static void main(final String args[]) {

	try {
	    // System.out.println("<------------Buscando corredores de
	    // carrera---------------->");
	    // new GetRunnersInRaceService().doSomething();
	    // System.out.println("<------------Creando carreras
	    // aleatorias---------------->");
	    // new CreateRaceService().doSomething();
	    // System.out.println("<------------Buscando mejores marcas de
	    // dorsal---------------->");
	    // new GetTimeStampByDorsalIDService().doSomething();
	    System.out.println("<------------Realizando calsificacion---------------->");
	    new GetClassificationListByRaceId().doSomething();
	} finally {
	    HibernateUtil.close();
	}

    }
}
