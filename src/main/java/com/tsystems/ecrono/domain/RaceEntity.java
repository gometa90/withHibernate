package com.tsystems.ecrono.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "race")
@Data
public class RaceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", columnDefinition = "INT")
    private Long id;
    @Column(name = "name")
    private String nombre;
    @Column(name = "distance_in_meters")
    private Double distanceInMeters;
    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private RaceType type;
    @Column(name = "init_time")
    private String init_time;

}
