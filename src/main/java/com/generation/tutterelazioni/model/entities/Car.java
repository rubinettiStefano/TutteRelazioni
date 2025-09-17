package com.generation.tutterelazioni.model.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Car extends BaseEntity
{
    private String model,plateNumber;

    //N-1 con Person
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Person owner;
}
