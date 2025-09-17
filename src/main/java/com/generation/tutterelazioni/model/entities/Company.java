package com.generation.tutterelazioni.model.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
public class Company extends BaseEntity
{
    @NotNull
    @NotBlank
    private String name;

    @ManyToMany(mappedBy = "companies",fetch = FetchType.EAGER)
    private Set<Person> employees;

    public void addEmployee(Person p )
    {
        employees.add(p);
        p.getCompanies().add(this);
    }
}
