package org.gl.procamp.airline.repository;

import org.gl.procamp.airline.model.Airline;
import org.springframework.data.repository.CrudRepository;

public interface AirlineRepository extends CrudRepository<Airline, Long> {
}
