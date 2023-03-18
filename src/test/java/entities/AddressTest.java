//package entities;
//
//import org.junit.jupiter.api.*;
//
//import java.util.LinkedHashSet;
//import java.util.Set;
//
//import static org.junit.jupiter.api.Assertions.*;
//
///**
// * Tests for Address klassen.
// */
//class AddressTest {
//
//    private Address address;
//    private final String STREET = "Lyngby Hovedgade 23";
//    private final String ID = "1";
//    private final String ADDITIONAL_INFO = "4. sal";
//    private final Person PERSON_1 = new Person();
//    private final Person PERSON_2 = new Person();
//
//    /**
//     * Opsæt Address-objektet før hver testmetode.
//     */
//    @BeforeEach
//    void setUp() {
//        address = new Address();
//    }
//
//    /**
//     * Nested testklasse til test af Address settere og gettere.
//     */
//    @Nested
//    @DisplayName("Test af Address settere og gettere")
//    class AddressSettersAndGettersTest {
//
//        /**
//         * Tester setStreet- og getStreet-metoderne i Address-klassen.
//         */
//        @Test
//        @DisplayName("Tester setStreet- og getStreet")
//        void testStreetSetterGetter() {
//            address.setStreet(STREET);
//            assertEquals(STREET, address.getStreet());
//        }
//
//        /**
//         * Tester setId og getId-metoderne i Address-klassen.
//         */
//        @Test
//        @DisplayName("Tester setId og getId")
//        void testIdSetterGetter() {
//            address.setId(ID);
//            assertEquals(ID, address.getId());
//        }
//
//        /**
//         * Tester setAdditionalInfo og getAdditionalInfo-metoderne i Address-klassen.
//         */
//        @Test
//        @DisplayName("Tester setAdditionalInfo og getAdditionalInfo")
//        void testAdditionalInfoSetterGetter() {
//            address.setAdditionalInfo(ADDITIONAL_INFO);
//            assertEquals(ADDITIONAL_INFO, address.getAdditionalInfo());
//        }
//
//        /**
//         * Tester setPeople og getPeople-metoderne i Address-klassen.
//         */
//        @Test
//        @DisplayName("Tester setPeople og getPeople")
//        void testPeopleSetterGetter() {
//            Set<Person> people = new LinkedHashSet<>();
//            people.add(PERSON_1);
//            people.add(PERSON_2);
//            address.setPeople(people);
//            assertEquals(people, address.getPeople());
//        }
//    }
//}
