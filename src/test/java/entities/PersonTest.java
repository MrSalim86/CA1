package entities;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for Person klassen.
 */
class PersonTest {

    private Person person;
    private final String EMAIL = "pelle.buha@cphbusiness.dk";
    private final String FIRST_NAME = "Pelle";
    private final String LAST_NAME = "Buha";
    private final int AGE = 51;
    private final Hobby HOBBY = new Hobby();
    private final Address ADDRESS = new Address();
    private final Phone PHONE = new Phone();

    /**
     * Opsæt Person-objektet før hver testmetode.
     */
    @BeforeEach
    void setUp() {
        person = new Person();
    }

    /**
     * Nested testklasse til test af Person settere og gettere.
     */
    @Nested
    @DisplayName("Test af Person settere og gettere")
    class PersonSettersAndGettersTest {

        /**
         * Tester setId og getId-metoderne i Person-klassen.
         */
        @Test
        @DisplayName("Tester setId og getId")
        void testIdSetterGetter() {
            int id = 1;
            person.setId(id);
            assertEquals(id, person.getId());
        }

        /**
         * Tester setEmail og getEmail-metoderne i Person-klassen.
         */
        @Test
        @DisplayName("Tester setEmail og getEmail")
        void testEmailSetterGetter() {
            person.setEmail(EMAIL);
            assertEquals(EMAIL, person.getEmail());
        }

        /**
         * Tester setFirstName og getFirstName-metoderne i Person-klassen.
         */
        @Test
        @DisplayName("Tester setFirstName og getFirstName")
        void testFirstNameSetterGetter() {
            person.setFirstName(FIRST_NAME);
            assertEquals(FIRST_NAME, person.getFirstName());
        }

        /**
         * Tester setLastName og getLastName-metoderne i Person-klassen.
         */
        @Test
        @DisplayName("Tester setLastName og getLastName")
        void testLastNameSetterGetter() {
            person.setLastName(LAST_NAME);
            assertEquals(LAST_NAME, person.getLastName());
        }

        /**
         * Tester setAge og getAge-metoderne i Person-klassen.
         */
        @Test
        @DisplayName("Tester setAge og getAge")
        void testAgeSetterGetter() {
            person.setAge(AGE);
            assertEquals(AGE, person.getAge());
        }

        /**
         * Tester setHobby og getHobby-metoderne i Person-klassen.
         */
        @Test
        @DisplayName("Tester setHobby og getHobby")
        void testHobbySetterGetter() {
            person.setHobby(HOBBY);
            assertEquals(HOBBY, person.getHobby());
        }

        /**
         * Tester setAddress og getAddress-metoderne i Person-klassen.
         */
        @Test
        @DisplayName("Tester setAddress og getAddress")
        void testAddressSetterGetter() {
            person.setAddress(ADDRESS);
            assertEquals(ADDRESS, person.getAddress());
        }

        /**
         * Tester setPhone og getPhone-metoderne i Person-klassen.
         */
        @Test
        @DisplayName("Tester setPhone og getPhone")
        void testPhoneSetterGetter() {
            person.setPhone(PHONE);
            assertEquals(PHONE, person.getPhone());
        }
    }
}
