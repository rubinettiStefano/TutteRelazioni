package com.generation.tutterelazioni.model.repositories;

import com.generation.tutterelazioni.model.entities.IdentityCard;
import com.generation.tutterelazioni.model.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person,Long>
{
    @Query("SELECT p FROM Person p WHERE YEAR(p.dob)>= :anno")
    List<Person> trovaPerAnno(int anno);
}
