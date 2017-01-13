package com.tsystems.ecrono.testRepository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.tsystems.ecrono.domain.DorsalEntity;
import com.tsystems.ecrono.domain.RaceEntity;

public class GetRunnersInRaceService extends SessionManager {

    public void execute(Session session) {

	List<DorsalEntity> list = session.createCriteria(RaceEntity.class)//
		.add(Restrictions.eq("raceId", 1L))//
		.setFetchMode("dorsals", FetchMode.JOIN).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)//
		.list();

	for (DorsalEntity dorsalEntity : list) {
	    System.out.println(list);
	}

    }
}
