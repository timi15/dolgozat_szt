import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterEach;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class TestLista {

    private Lista testPeople = new Lista();

    @BeforeEach
    public void init() {
        testPeople.add("Jakab");
        testPeople.add("Juliska");
    }

    @Test
    @DisplayName("Méret ellenőrzés")
    public void testSize() {
        assertEquals(2, testPeople.size());
    }

    @Test
    @DisplayName("Üresség ellenőrzés")
    public void testIsEmpty() {
        assertEquals(false, testPeople.isEmpty());
        assertFalse(testPeople.isEmpty());
    }

    @Test
    @DisplayName("Hozzáadás ellenőrzés")
    public void testAdd() {
        testPeople.add("Géza");
        assertEquals(3, testPeople.size());
    }

    @Test
    @DisplayName("Törlés")
    public void testRemove() {
        Exception exception = assertThrows(NoSuchElementException.class, () -> {
            testPeople.remove("Jani");
        });
    }

    @Test
    @DisplayName("Összes Törlés")
    public void testRemoveAll() {
        testPeople.removeAll();
        assertTrue(testPeople.isEmpty());
    }

    @AfterEach
    public void destroy() {
        testPeople.removeAll();
    }
}
