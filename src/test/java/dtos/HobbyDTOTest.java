package dtos;

import entities.Hobby;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HobbyDTOTest {

    private Hobby hobby;
    private HobbyDTO hobbyDTO;

    private final String name = "name";
    private final String wikiLink = "wikiLink";
    private final String category = "category";
    private final String type = "type";


    @BeforeEach
    void setUp() {
        hobbyDTO = new HobbyDTO(name, wikiLink, category, type);

    }

    @Nested
    @DisplayName("Test HobbyDTO")
    class TestHobbyDTO {

        @BeforeEach
        void setUp() {
            hobbyDTO = new HobbyDTO(name, wikiLink, category, type);
        }

        @Test
        @DisplayName("Test HobbyDTO")
        void testHobbyDTO() {
            assertEquals(name, hobbyDTO.getName());
            assertEquals(wikiLink, hobbyDTO.getWikiLink());
            assertEquals(category, hobbyDTO.getCategory());
            assertEquals(type, hobbyDTO.getType());

        }
    }
}
