package entities;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for SkillLevel klassen.
 */
class SkillLevelTest {

    /**
     * Test at getId returnerer det korrekte id.
     */
    @Test
    @DisplayName("Test getId")
    void testGetId() {
        SkillLevel skillLevel = new SkillLevel();
        Integer id = 1;
        skillLevel.setId(id);
        assertEquals(id, skillLevel.getId());
    }

    /**
     * Test at setId sætter id'et korrekt.
     */
    @Test
    @DisplayName("Test setId")
    void testSetId() {
        SkillLevel skillLevel = new SkillLevel();
        Integer id = 2;
        skillLevel.setId(id);
        assertEquals(id, skillLevel.getId());
    }
}