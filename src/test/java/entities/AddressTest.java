package entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Formålet med en unitstest er at verificere adfærden af en lille, isoleret kodeenhed, såsom en metode eller klasse.
 * Ved at skrive test for hver kodeenhed kan vi sikre, at koden fungerer efter hensigten, selvom kodebasen vokser og
 * ændrer sig over tid.
 **/

public class AddressTest {

    // @Test-annotationen over testSetAndGetStreet-metoden fortæller JUnit at køre denne metode som en test.
    @Test
    public void testSetAndGetStreet() {

        // Denne linje opretter et nyt adresseobjekt, som vi vil bruge til at teste metoderne setStreet og getStreet.
        Address address = new Address();

        // Disse to linjer sætter street-egenskaben for adresseobjektet til strengen "Lyngby Hovedgade 23" ved hjælp af
        // setStreet-metoden.
        String street = "Lyngby Hovedgade 23";
        address.setStreet(street);

        // Denne linje bruger assertEquals-metoden fra Assertions-klassen til at verificere, at den værdi, der
        // returneres af getStreet-metoden på adresseobjektet, er lig med den street-variabel, vi har angivet tidligere.
        Assertions.assertEquals(street, address.getStreet());

        /**
         * Hvis testen består, kan vi være rimeligt sikre på, at setStreet- og getStreet-metoderne i
         * Address-klassen fungerer efter hensigten. Hvis testen mislykkes, kan vi undersøge årsagen til fejlen
         * og foretage ændringer i koden efter behov for at løse problemet.
         **/
    }

    // Denne test verificerer, at getId-metoden returnerer den korrekte værdi efter indstilling af id-egenskaben.
    @Test
    public void testSetAndGetId() {
        Address address = new Address();
        String id = "1";
        address.setId(id);
        Assertions.assertEquals(id, address.getId());

        /**
         * Testcasen testSetAndGetId() tester metoderne setId() og getId() for Address-klassen.
         * Den opretter et nyt Address-objekt, sætter et ID ved hjælp af setId()-metoden og verificerer
         * derefter, at ID-egenskaben i Address-objektet blev indstillet korrekt ved at kontrollere, at
         * getId()-metoden returnerer det samme ID.
         */
    }

    // Denne test verificerer, at getAdditionalInfo-metoden returnerer den korrekte værdi efter indstilling af
    // additionalInfo-egenskaben.
    @Test
    public void testSetAndGetAdditionalInfo() {
        Address address = new Address();
        String additionalInfo = "Unit 4";
        address.setAdditionalInfo(additionalInfo);
        Assertions.assertEquals(additionalInfo, address.getAdditionalInfo());

        /**
         * Denne testcase tester metoderne setAdditionalInfo() og getAdditionalInfo() i Address-klassen.
         * Den opretter et nyt Address-objekt, angiver en værdi for egenskaben additionalInfo ved hjælp af
         * metoden setAdditionalInfo() og kontrollerer derefter, at den værdi, der returneres af metoden
         * getAdditionalInfo() er den samme som den værdi, der blev angivet ved hjælp af metoden setAdditionalInfo().
         * Dette er en simpel test for at sikre, at de grundlæggende getter- og settermetoder for
         * additionalInfo-egenskaben fungerer korrekt.
         */

    }

    // Test case for getPeople() metoden i Address-klassen
    @Test
    public void testGetPeople() {
        // Opret et nyt adresseobjekt, som vi vil bruge til at teste getPeople-metoden.
        Address address = new Address();

        // Opret et nyt sæt mennesker og tilføj to personer til sættet.
        Set<Person> people = new LinkedHashSet<>();
        Person person1 = new Person();
        Person person2 = new Person();
        people.add(person1);
        people.add(person2);

        // Indstil personerne i adresseobjektet ved hjælp af setPeople-metoden.
        address.setPeople(people);

        // Bekræft, at metoden getPeople() returnerer det korrekte sæt af personer.
        Assertions.assertEquals(people, address.getPeople());

        /**
         * testGetPeople tester metoden getPeople() ved at oprette et nyt Adresse-objekt, indstille et sæt af
         * personobjekter ved hjælp af metoden setPeople() og derefter kontrollere, at metoden getPeople()
         * returnerer det korrekte sæt af personobjekter.
         */
    }

    // Test case for setPeople() metoden i Address-klassen
    @Test
    public void testSetPeople() {
        // Opret et nyt adresseobjekt som vi vil bruge til at teste setPeople-metoden.
        Address address = new Address();

        // Opret et nyt sæt mennesker og tilføj to personer til sættet.
        Set<Person> people = new LinkedHashSet<>();
        Person person1 = new Person();
        Person person2 = new Person();
        people.add(person1);
        people.add(person2);

        // Indstil personerne i adresseobjektet ved hjælp af setPeople-metoden.
        address.setPeople(people);

        // Bekræft, at egenskaben people i adresseobjektet var indstillet korrekt ved hjælp af getPeople-metoden.
        Assertions.assertEquals(people, address.getPeople());

        /**
         * testSetPeople tester setPeople()-metoden ved at oprette et nyt Address-objekt, indstille et sæt
         * Person-objekter ved hjælp af setPeople()-metoden og derefter kontrollere, at people-egenskaben i
         * Address-objektet var indstillet korrekt ved at kontrollere, at getPeople() metoden returnerer det samme
         * sæt af personobjekter.
         */
    }

}
