package com.generation.tutterelazioni.model.repositories;

import com.generation.tutterelazioni.model.entities.Car;
import com.generation.tutterelazioni.model.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {
}
