package com.generation.tutterelazioni.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class IdentityCard  extends BaseEntity
{
    //"CD15364IY"
    @NotNull @Pattern(regexp = "^[A-Z]{2}[0-9]{5}[A-Z]{2}$")
    @Column(unique = true)
    private String number;
    @PastOrPresent
    private LocalDate emissionDate;
    @Future
    private LocalDate expirationDate;

    //1-1 con Person
    @OneToOne(fetch = FetchType.EAGER)
    //annotazione per specificare F.K.
    @JoinColumn(name = "person_id")
    private Person person;
}
