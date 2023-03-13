package facades;

import dtos.PersonDTO;
import entities.Person;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import utils.EMF_Creator;

/**
 * PersonFacade-klassen leverer et par CRUD-operationer for Person-entiteten.
 */

//TODO Opret flere metoder, der leverer de CRUD-operationer, som vi har brug for.
public class PersonFacade {

    private static PersonFacade instance;
    private static EntityManagerFactory emf;

    private PersonFacade() {
    }

    /**
     * Returnerer en instans af PersonFacade-klassen ved hjælp af den medfølgende EntityManagerFactory.
     * Denne metode sikrer, at der kun oprettes én forekomst af klassen pr. EntityManagerFactory.
     * (Singleton pattern, som vi lærte sidste semester)
     *
     * @param _emf EntityManagerFactory, der skal bruges til at oprette en EntityManager-instans
     * @return en instans af PersonFacade-klassen
     */
    public static PersonFacade getPersonFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new PersonFacade();
        }
        return instance;
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    /**
     * Tilføjer en ny person-entitet til databasen.
     *
     * @param personDto DTO-objektet, der indeholder dataene for den nye Person-entitet
     * @return DTO-objektet for den nyligt tilføjede Person-entitet
     */
    public PersonDTO addPerson(PersonDTO personDto) {
        EntityManager em = getEntityManager();
        Person person = new Person(personDto.getEmail(), personDto.getFirstName(), personDto.getLastName(), personDto.getAge());
        try {
            em.getTransaction().begin();
            em.persist(person);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        return new PersonDTO(person);
    }

    /**
     * Henter en person-entitet ved dets ID.
     *
     * @param id'et for den person-entitet, der skal hentes
     * @return DTO-objektet for den hentede Person-entitet, eller null, hvis det ikke findes
     */
    public PersonDTO getPersonById(long id) {
        EntityManager em = emf.createEntityManager();
        try {
            Person person = em.find(Person.class, id);
            if (person == null) {
                return null;
            }
            return new PersonDTO(person);
        } finally {
            em.close();
        }
    }

    /**
     * Henter en liste over alle Person-entiteter i databasen.
     *
     * @return en liste over DTO-objekter for alle Person-entiteter i databasen
     */
    public List<PersonDTO> getAllPeople() {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<Person> query = em.createQuery("SELECT p FROM Person p", Person.class);
            List<Person> people = query.getResultList();
            List<PersonDTO> personDtos = new ArrayList<>();
            for (Person person : people) {
                personDtos.add(new PersonDTO(person));
            }
            return personDtos;
        } finally {
            em.close();
        }
    }
}