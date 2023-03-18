//package dtos;
//
//import entities.Person;
//import org.junit.jupiter.api.*;
//
//import static org.junit.jupiter.api.Assertions.*;
//
///**
// * Tests for PersonDTO klassen.
// */
//class PersonDTOTest {
//
//    private Person person;
//    private PersonDTO personDTO;
//
//    private final int ID = 1;
//    private final String EMAIL = "Mohamed@salim.dk";
//    private final String FIRST_NAME = "Mohamed";
//    private final String LAST_NAME = "Salim";
//    private final int AGE = 30;
//
//    /**
//     * Initialiserer testdataene før hver testmetode køres.
//     */
//    @BeforeEach
//    void setUp() {
//        person = new Person();
//        person.setEmail(EMAIL);
//        person.setFirstName(FIRST_NAME);
//        person.setLastName(LAST_NAME);
//        person.setAge(AGE);
//
//        personDTO = new PersonDTO(person);
//    }
//
//    /**
//     * Nested testklasse til test af PersonDTO settere og gettere.
//     */
//    @Nested
//    @DisplayName("Test af PersonDTO setters og getters")
//    class PersonDTOSettersAndGettersTest {
//
//        /**
//         * Tester setId og getId-metoderne i PersonDTO-klassen.
//         */
//        @Test
//        @DisplayName("Tester setId og getId")
//        void testIdSetterGetter() {
//            personDTO.setId(ID);
//            assertEquals(ID, personDTO.getId());
//        }
//
//        /**
//         * Tester setEmail og getEmail-metoderne i PersonDTO-klassen.
//         */
//        @Test
//        @DisplayName("Tester setEmail og getEmail")
//        void testEmailSetterGetter() {
//            String newEmail = "crossworkers@cairo.dk";
//            personDTO.setEmail(newEmail);
//            assertEquals(newEmail, personDTO.getEmail());
//        }
//
//        /**
//         * Tester setFirstName og getFirstName-metoderne i PersonDTO-klassen.
//         */
//        @Test
//        @DisplayName("Tester setFirstName og getFirstName")
//        void testFirstNameSetterGetter() {
//            String newFirstName = "Mayas";
//            personDTO.setFirstName(newFirstName);
//            assertEquals(newFirstName, personDTO.getFirstName());
//        }
//
//        /**
//         * Tester setLastName og getLastName-metoderne i PersonDTO-klassen.
//         */
//        @Test
//        @DisplayName("Tester setLastName og getLastName")
//        void testLastNameSetterGetter() {
//            String newLastName = "Andersen";
//            personDTO.setLastName(newLastName);
//            assertEquals(newLastName, personDTO.getLastName());
//        }
//
//        /**
//         * Tester setAge og getAge-metoderne i PersonDTO-klassen.
//         */
//        @Test
//        @DisplayName("Tester setAge og getAge")
//        void testAgeSetterGetter() {
//            int newAge = 40;
//            personDTO.setAge(newAge);
//            assertEquals(newAge, personDTO.getAge());
//        }
//
//        /**
//         * Tester setHobbyName og getHobbyName-metoderne i PersonDTO-klassen.
//         */
//        @Test
//        @DisplayName("Tester setHobbyName og getHobbyName")
//        void testHobbyNameSetterGetter() {
//            String newHobbyName = "Svømning";
//            personDTO.setHobbyName(newHobbyName);
//            assertEquals(newHobbyName, personDTO.getHobbyName());
//        }
//
//        /**
//         * Tester setPhoneNumber og getPhoneNumber-metoderne i PersonDTO-klassen.
//         */
//        @Test
//        @DisplayName("Tester setPhoneNumber og getPhoneNumber")
//        void testPhoneNumberSetterGetter() {
//            String newPhoneNumber = "45259817";
//            personDTO.setPhoneNumber(newPhoneNumber);
//            assertEquals(newPhoneNumber, personDTO.getPhoneNumber());
//        }
//
//        /**
//         * Tester setAddress og getAddress-metoderne i PersonDTO-klassen.
//         */
//        @Test
//        @DisplayName("Tester setAddress og getAddress")
//        void testAddressSetterGetter() {
//            String newAddress = "Frederikssundvej 1, 4000 Roskilde";
//            personDTO.setAddress(newAddress);
//            assertEquals(newAddress, personDTO.getAddress());
//        }
//    }
//}
