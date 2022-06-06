import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SzovegTest {
    @Test
    @DisplayName("szamol metodus tesztle�se")
    public void szamolTest(){
        assertEquals(2, szoveg.szamol("Oda n�zz G�za! K�k az �g! De r�g volt ilyen.", '!'));
        assertEquals(0, szoveg.szamol("H�nyszor mondjam? Nem k�rtem ezt a term�ket!", '.'));
        assertEquals(3, szoveg.szamol("double simaliba = Math.random(23.5)*4.5;", '.'));







    }
}
