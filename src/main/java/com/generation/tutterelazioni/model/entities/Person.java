package com.generation.tutterelazioni.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
public class Person extends BaseEntity
{
    @NotNull @NotBlank
    private String name;
    @NotNull @NotBlank
    private String surname;
    @NotNull @PastOrPresent
    private LocalDate dob;
    //1-1 con IdentityCard
    @OneToOne(mappedBy = "person",fetch = FetchType.EAGER)
    private IdentityCard ic;
                                                            //se salvo una Person che dentro alla suo Set ha delle macchine, salva anche loro
                                                            //se cancello una Person cancella anche le sue macchine
    @OneToMany(mappedBy = "owner",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Set<Car> cars;
    //N-N
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable
            (
                    //   name="persons_companies"
                    name="person_to_company",
                    //F.K. di quella tabella verso Person ha nome person_id
                    joinColumns = @JoinColumn(name = "person_id"),
                    //F.K verso altra tabella
                    inverseJoinColumns = @JoinColumn(name = "company_id")
            )
    private Set<Company> companies;

    //AGGIUNGERE SEMPRE ADDER QUANDO SI HA A CHE FARE CON COLLEZIONI
    public void addCar(Car c)
    {
        cars.add(c);
        c.setOwner(this);
    }

    public void addCompany(Company c)
    {
        companies.add(c);
        c.getEmployees().add(this);
    }
}
