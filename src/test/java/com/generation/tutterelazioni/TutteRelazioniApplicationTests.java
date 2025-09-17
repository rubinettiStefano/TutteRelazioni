package com.generation.tutterelazioni;

import com.generation.tutterelazioni.model.entities.Car;
import com.generation.tutterelazioni.model.entities.Company;
import com.generation.tutterelazioni.model.entities.IdentityCard;
import com.generation.tutterelazioni.model.entities.Person;
import com.generation.tutterelazioni.model.repositories.CarRepository;
import com.generation.tutterelazioni.model.repositories.CompanyRepository;
import com.generation.tutterelazioni.model.repositories.ICRepository;
import com.generation.tutterelazioni.model.repositories.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class TutteRelazioniApplicationTests
{
    @Autowired
    PersonRepository pRepo;

    @Autowired
    CompanyRepository cRepo;
    @Autowired
    ICRepository icRepo;

    @Autowired
    CarRepository carRepo;
    @Test
    void contextLoads()
    {

//        Person p = new Person();
//        p.setName("Stefano");
//        p.setSurname("Rubinetti");
//        p.setDob(LocalDate.of(1995,8,27));
//
//        pRepo.save(p);

//        IdentityCard ic = new IdentityCard();
//        ic.setNumber("CD15364IY");
//        ic.setEmissionDate(LocalDate.of(2020,10,1));
//        ic.setExpirationDate(LocalDate.of(2030,9,30));
//
//        Person p = pRepo.findById(1L).orElse(null);
//
//        ic.setPerson(p);
//
//        icRepo.save(ic);

        //CD15364IY
//        Optional<IdentityCard> trovataForse = icRepo.trovaPerNumero("CD15364IY");
//
//        if(trovataForse.isPresent())
//        {
//            IdentityCard ic = trovataForse.get();
//            String nomePersona = ic.getPerson().getName();
//            String cognomePersona = ic.getPerson().getSurname();
//
//            System.out.println("Il colpevole è "+nomePersona+" "+cognomePersona);
//
//
//        }else
//        {
//            System.out.println("INDIZIO INUTILE");
//        }
//        Person p = pRepo.findById(1L).orElse(null);
//        IdentityCard cartaDiStefano = p.getIc();
//        System.out.println(cartaDiStefano.getExpirationDate());

//        Person p = pRepo.findById(1L).orElse(null);
//        //lavorare a partire dai figli
//        Car c = new Car();
//        c.setModel("Figliol Prodigo");
//        c.setPlateNumber("AAA777BBB");
//        c.setOwner(p);
//
//        carRepo.save(c);

        //a partire dal padre
//        p.addCar(c);
//        pRepo.save(p);

//        List<Person> persone = new ArrayList<>();
//
//        Person p1 = new Person();
//        p1.setName("Luca");
//        p1.setSurname("Bianchi");
//        p1.setDob(LocalDate.of(1985, 3, 15));
//        persone.add(p1);
//
//        Person p2 = new Person();
//        p2.setName("Maria");
//        p2.setSurname("Rossi");
//        p2.setDob(LocalDate.of(1990, 7, 22));
//        persone.add(p2);
//
//        Person p3 = new Person();
//        p3.setName("Giuseppe");
//        p3.setSurname("Verdi");
//        p3.setDob(LocalDate.of(1978, 12, 5));
//        persone.add(p3);
//
//        Person p4 = new Person();
//        p4.setName("Anna");
//        p4.setSurname("Ferrari");
//        p4.setDob(LocalDate.of(1995, 1, 30));
//        persone.add(p4);
//
//        Person p5 = new Person();
//        p5.setName("Marco");
//        p5.setSurname("Conti");
//        p5.setDob(LocalDate.of(1982, 6, 10));
//        persone.add(p5);
//
//        // Lista di aziende
//        List<Company> companies = new ArrayList<>();
//
//        Company c1 = new Company();
//        c1.setName("Tech Solutions Srl");
//        companies.add(c1);
//
//        Company c2 = new Company();
//        c2.setName("Green Energy Spa");
//        companies.add(c2);
//
//        Company c3 = new Company();
//        c3.setName("Wave Communications Ltd");
//        companies.add(c3);
//
//        pRepo.saveAll(persone);
//        cRepo.saveAll(companies);

        //TODO   QUESTO è IL COLLEGAMENTO N-N
//        Company c= cRepo.findById(2L).get();
//
//        List<Person> natiDopoIl90 = pRepo.trovaPerAnno(1990);
//
//        for(Person p:natiDopoIl90)
//            c.addEmployee(p);
//
//        //È obbligatorio fare il save dell'Entità su cui abbiamo messo la
//        //@JoinTable per salvare la relazione
//        //fate save di entrambe e amen
//        pRepo.saveAll(natiDopoIl90);
//        cRepo.save(c);

        Company c= cRepo.findById(2L).get();
        System.out.println("Impiegati di Green Energy SRL");
        for(Person p: c.getEmployees())
            System.out.println(p.getName());

        Person ste= pRepo.findById(1L).get();
        System.out.println("Aziende per cui lavora stefano");
        for(Company com:ste.getCompanies())
            System.out.println(com.getName());

    }

}
