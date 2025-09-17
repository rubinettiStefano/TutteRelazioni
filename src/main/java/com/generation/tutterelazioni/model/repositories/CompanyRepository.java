package com.generation.tutterelazioni.model.repositories;

import com.generation.tutterelazioni.model.entities.Car;
import com.generation.tutterelazioni.model.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long> {
}
