package com.generation.tutterelazioni.model.repositories;

import com.generation.tutterelazioni.model.entities.IdentityCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ICRepository extends JpaRepository<IdentityCard,Long>
{
    @Query("SELECT i FROM IdentityCard i WHERE i.number = :numero ")
    Optional<IdentityCard> trovaPerNumero(String numero);
}
