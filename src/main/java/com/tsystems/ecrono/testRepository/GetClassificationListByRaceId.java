package com.tsystems.ecrono.testRepository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.tsystems.ecrono.domain.DorsalEntity;
import com.tsystems.ecrono.domain.TimeStampEntity;

public class GetClassificationListByRaceId extends SessionManager {

    @Override
    protected void execute(Session session) {
	List<DorsalEntity> classification = session.createCriteria(DorsalEntity.class)//
		.add(Restrictions.eq("raceId", 1L))//
		.setFetchMode("dorsals", FetchMode.JOIN)//
		.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)//
		.list();

	for (DorsalEntity dorsalEntity : classification) {
	    System.out.println(dorsalEntity);
	    System.out.println("Tiempos: ");
	    for (TimeStampEntity timeStampEntity : dorsalEntity.getTimeStamp()) {
		System.out.println(timeStampEntity);
	    }
	}
    }

}
