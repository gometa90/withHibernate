package com.tsystems.ecrono.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(name = "dorsals")
@Data
@ToString(of = { "id", "chipCode", "timeStamp" })
@EqualsAndHashCode(of = "id")
public class DorsalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "race_id")
    private Long raceId;
    @Column(name = "dorsal_number")
    private int dorsalNumber;

    @Column(name = "chip_code", nullable = false)
    private String chipCode;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "dorsal")
    private List<TimeStampEntity> timeStamp;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "runner_id")
    private RunnerEntity runner;

}
