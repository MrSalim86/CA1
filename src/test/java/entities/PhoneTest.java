package entities;

import org.junit.jupiter.api.*;

import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for Phone klassen.
 */
class PhoneTest {

    private Phone phone;
    private final String PHONE_NUMBER = "45492096";
    private final String DESCRIPTION = "Arbejdstelefon";
    private final Person PERSON_1 = new Person();
    private final Person PERSON_2 = new Person();

    /**
     * Opsæt Phone-objektet før hver testmetode.
     */
    @BeforeEach
    void setUp() {
        phone = new Phone();
    }

    /**
     * Nested testklasse til test af Phone settere og gettere.
     */
    @Nested
    @DisplayName("Test af Phone settere og gettere")
    class PhoneSettersAndGettersTest {

        /**
         * Tester setId og getId-metoderne i Phone-klassen.
         */
        @Test
        @DisplayName("Tester setId og getId")
        void testIdSetterGetter() {
            phone.setId(PHONE_NUMBER);
            assertEquals(PHONE_NUMBER, phone.getId());
        }

        /**
         * Tester setDescriptionPhone og getDescriptionPhone-metoderne i Phone-klassen.
         */
        @Test
        @DisplayName("Tester setDescriptionPhone og getDescriptionPhone")
        void testDescriptionPhoneSetterGetter() {
            phone.setDescriptionPhone(DESCRIPTION);
            assertEquals(DESCRIPTION, phone.getDescriptionPhone());
        }

        /**
         * Tester setPeople og getPeople-metoderne i Phone-klassen.
         */
        @Test
        @DisplayName("Tester setPeople og getPeople")
        void testPeopleSetterGetter() {
            Set<Person> people = new LinkedHashSet<>();
            people.add(PERSON_1);
            people.add(PERSON_2);
            phone.setPeople(people);
            assertEquals(people, phone.getPeople());
        }
    }
}