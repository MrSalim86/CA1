//package entities;
//
//import org.junit.jupiter.api.*;
//
//import static org.junit.jupiter.api.Assertions.*;
//
///**
// * Tests for CityInfo klassen.
// */
//class CityInfoTest {
//
//    private CityInfo cityInfo;
//    private final Integer ZIP_CODE = 2800;
//
//    /**
//     * Opsæt CityInfo-objektet før hver testmetode.
//     */
//    @BeforeEach
//    void setUp() {
//        cityInfo = new CityInfo();
//    }
//
//    /**
//     * Nested testklasse til test af CityInfo settere og gettere.
//     */
//    @Nested
//    @DisplayName("Test af CityInfo setters og getters")
//    class CityInfoSettersAndGettersTest {
//
//        /**
//         * ester setId og getId-metoderne i CityInfo-klassen.
//         */
//        @Test
//        @DisplayName("Tester setId og getId")
//        void testIdSetterGetter() {
//            cityInfo.setId(ZIP_CODE);
//            assertEquals(ZIP_CODE, cityInfo.getId());
//        }
//    }
//}
////TODO: Tilføj flere tests for andre metoder, når kolonner er migreret til entiteten