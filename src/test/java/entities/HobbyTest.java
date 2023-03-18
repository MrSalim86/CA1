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
// * Tests for Hobby klassen.
// */
//class HobbyTest {
//
//    private Hobby hobby;
//    private final String HOBBY_NAME = "Computerspil";
//    private final String WIKI_LINK = "https://da.wikipedia.org/wiki/Computerspil";
//    private final String CATEGORY = "Indendørs";
//    private final String TYPE = "Underholdning";
//    private final Person PERSON_1 = new Person();
//    private final Person PERSON_2 = new Person();
//
//    /**
//     * Opsæt Hobby-objektet før hver testmetode.
//     */
//    @BeforeEach
//    void setUp() {
//        hobby = new Hobby();
//    }
//
//    /**
//     * Nested testklasse til test af Hobby settere og gettere.
//     */
//    @Nested
//    @DisplayName("Test af Hobby setters og getters")
//    class HobbySettersAndGettersTest {
//
//        /**
//         * Tester setId og getId-metoderne i Hobby-klassen.
//         */
//        @Test
//        @DisplayName("Tester setId og getId")
//        void testIdSetterGetter() {
//          //  hobby.setId(HOBBY_NAME);
//            assertEquals(HOBBY_NAME, hobby.getId());
//        }
//
//        /**
//         * Tester setWikiLink og getWikiLink-metoderne i Hobby-klassen.
//         */
//        @Test
//        @DisplayName("Tester setWikiLink og getWikiLink")
//        void testWikiLinkSetterGetter() {
//            hobby.setWikiLink(WIKI_LINK);
//            assertEquals(WIKI_LINK, hobby.getWikiLink());
//        }
//
//        /**
//         * Tester setCategory and getCategory-metoderne i Hobby-klassen.
//         */
//        @Test
//        @DisplayName("Tester setCategory og getCategory")
//        void testCategorySetterGetter() {
//            hobby.setCategory(CATEGORY);
//            assertEquals(CATEGORY, hobby.getCategory());
//        }
//
//        /**
//         * Tester setType and getType-metoderne i Hobby-klassen.
//         */
//        @Test
//        @DisplayName("Tester setType og getType")
//        void testTypeSetterGetter() {
//            hobby.setType(TYPE);
//            assertEquals(TYPE, hobby.getType());
//        }
//
//        /**
//         * Tester setPeople and getPeople-metoderne i Hobby-klassen.
//         */
//        @Test
//        @DisplayName("Tester setPeople og getPeople")
//        void testPeopleSetterGetter() {
//            Set<Person> people = new LinkedHashSet<>();
//            people.add(PERSON_1);
//            people.add(PERSON_2);
//            hobby.setPeople(people);
//            assertEquals(people, hobby.getPeople());
//        }
//    }
//}