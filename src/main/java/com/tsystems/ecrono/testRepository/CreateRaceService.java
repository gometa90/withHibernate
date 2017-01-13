package com.tsystems.ecrono.testRepository;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

import org.hibernate.Session;

import com.tsystems.ecrono.domain.RaceEntity;
import com.tsystems.ecrono.domain.component.RaceType;

public class CreateRaceService extends SessionManager {

    @Override
    protected void execute(Session session) {
	RaceEntity raceEntity = createRandomRace();
	session.save(raceEntity);

	// Esto es igual que inscribir un participante = crear un dorsal
	// Transaction beginTransaction = session.beginTransaction();
	// RunnerEntity runner = new RunnerEntity();
	// runner.setId(3L);
	//
	// DorsalEntity dorsalAlex = new DorsalEntity();
	// dorsalAlex.setChipCode("42");
	// dorsalAlex.setDorsalNumber(2);
	// dorsalAlex.setRaceId(raceEntity.getId());
	// dorsalAlex.setRunner(runner);
	//
	// session.save(dorsalAlex);
	// beginTransaction.rollback();
	// raceEntity.setDorsals(new LinkedList<>());
	// raceEntity.getDorsals().get(dorsalAlex);
	// session.save(raceEntity)

    }

    private RaceEntity createRandomRace() {
	Random random = new Random();
	RaceEntity raceEntity = new RaceEntity();
	raceEntity.setDistanceInMeters(random.nextDouble() * 100);
	raceEntity.setInit_time(Instant.now().minus(Duration.ofDays(random.nextInt(365))));
	raceEntity.setName("Carrera Alex" + random.nextInt());
	raceEntity.setType(RaceType.values()[random.nextInt(4)]);
	return raceEntity;
    }
}
