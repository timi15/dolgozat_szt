import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SzovegTest {
    @Test
    @DisplayName("szamol metodus tesztleése")
    public void szamolTest(){
        assertEquals(2, szoveg.szamol("Oda nézz Géza! Kék az ég! De rég volt ilyen.", '!'));
        assertEquals(0, szoveg.szamol("Hányszor mondjam? Nem kértem ezt a terméket!", '.'));
        assertEquals(3, szoveg.szamol("double simaliba = Math.random(23.5)*4.5;", '.'));







    }
}
