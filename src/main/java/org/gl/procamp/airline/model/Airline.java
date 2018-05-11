package org.gl.procamp.airline.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Getter
@AllArgsConstructor
@Entity
public class Airline {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column
    private List<Aircraft> aircrafts;

}
