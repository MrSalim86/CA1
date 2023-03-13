package dtos;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for AddressDTO klassen.
 */
class AddressDTOTest {

    private AddressDTO addressDTO;

    private final String ID = "1";
    private final String ADDITIONAL_INFO = "5. sal - venstre";
    private final String STREET = "Dalgas Boulevard 48";
    private final String ZIPCODE = "2000";
    private final String CITY = "Frederiksberg";

    /**
     * Initialiserer testdataene før hver testmetode køres.
     */
    @BeforeEach
    void setUp() {
        addressDTO = new AddressDTO(ID, ADDITIONAL_INFO, STREET, ZIPCODE, CITY);
    }

    /**
     * Nested testklasse til test af AddressDTO settere og gettere.
     */
    @Nested
    @DisplayName("Test af AddressDTO setters og getters")
    class AddressDTOGettersAndSettersTest {

        /**
         * Tester setId og getId-metoderne i AddressDTO-klassen.
         */
        @Test
        @DisplayName("Tester setId og getId")
        void testIdSetterGetter() {
            String newId = "2";
            addressDTO.setId(newId);
            assertEquals(newId, addressDTO.getId());
        }

        /**
         * Tester setAdditionalInfo og getAdditionalInfo-metoderne i AddressDTO-klassen.
         */
        @Test
        @DisplayName("Tester setAdditionalInfo og getAdditionalInfo")
        void testAdditionalInfoSetterGetter() {
            String newAdditionalInfo = "9. sal - højre";
            addressDTO.setAdditionalInfo(newAdditionalInfo);
            assertEquals(newAdditionalInfo, addressDTO.getAdditionalInfo());
        }

        /**
         * Tester setStreet og getStreet-metoderne i AddressDTO-klassen.
         */
        @Test
        @DisplayName("Tester setStreet og getStreet")
        void testStreetSetterGetter() {
            String newStreet = "Havnegaden 31";
            addressDTO.setStreet(newStreet);
            assertEquals(newStreet, addressDTO.getStreet());
        }

        /**
         * Tester setZipcode og getZipcode-metoderne i AddressDTO-klassen.
         */
        @Test
        @DisplayName("Tester setZipcode og getZipcode")
        void testZipcodeSetterGetter() {
            String newZipcode = "9000";
            addressDTO.setZipcode(newZipcode);
            assertEquals(newZipcode, addressDTO.getZipcode());
        }

        /**
         * Tester setCity og getCity-metoderne i AddressDTO-klassen.
         */
        @Test
        @DisplayName("Tester setCity og getCity")
        void testCitySetterGetter() {
            String newCity = "Aalborg";
            addressDTO.setCity(newCity);
            assertEquals(newCity, addressDTO.getCity());
        }
    }
}
