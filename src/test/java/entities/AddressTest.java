package entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Formålet med en unitstest er at verificere adfærden af en lille, isoleret kodeenhed, såsom en metode eller klasse.
 * Ved at skrive test for hver kodeenhed kan vi sikre, at koden fungerer efter hensigten, selvom kodebasen vokser og
 * ændrer sig over tid.
 * AddressTest-klassen er en JUnit-testklasse, der tester adfærden af Address-klassens setStreet- og getStreet-metoder.
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
}
