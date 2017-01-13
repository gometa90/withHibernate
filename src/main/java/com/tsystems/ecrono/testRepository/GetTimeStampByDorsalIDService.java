package com.tsystems.ecrono.testRepository;

import java.util.List;

import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.tsystems.ecrono.domain.DorsalEntity;
import com.tsystems.ecrono.domain.TimeStampEntity;

public class GetTimeStampByDorsalIDService extends SessionManager {

    @Override
    protected void execute(Session session) {

	DorsalEntity dorsal = (DorsalEntity) session.createCriteria(DorsalEntity.class)//
		.add(Restrictions.eq("id", 3L))//
		.setFetchMode("timeStamp", FetchMode.JOIN)//
		// para que me agrupe por la clase primaria.setResultTransformer
		.uniqueResult();

	System.out.println(dorsal);
	System.out.println(dorsal.getTimeStamp());

	// El contrario, los dorsales de cada marca
	List list = session.createCriteria(TimeStampEntity.class)//
		.add(Restrictions.eq("dorsal.id", 3L)).list();
	System.out.println(list);

    }

}
