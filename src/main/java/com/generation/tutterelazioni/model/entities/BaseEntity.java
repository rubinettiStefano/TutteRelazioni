package com.generation.tutterelazioni.model.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//Non creare tabella, ma metti le proprietà di questa classe
//nella tabella delle sue estensioni
@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
