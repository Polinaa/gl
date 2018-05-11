package org.gl.procamp.airline.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public abstract class Aircraft {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column
    private double fuelConsumption;

    @Column
    private double totalCapacity;

    @Column
    private double carryingCapacity;

    @Column
    private double flightRange;
}
