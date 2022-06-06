import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratorTest {

    @Test
    @DisplayName("Generátor metódus létrehozása")
    public void eredmenyGeneratorTest(){

      //  erdemjegyGenerator.generator();
    }

    @Test
    @DisplayName("Generátor metódus paraméter")
    public void eredmenyGeneratorTest2(){

        erdemjegyGenerator.generator(4);
    }

    @Test
    @DisplayName("Generátor metódus tesztelése")
    public void eredmenyGeneratorTest3(){

        // mínusz paraméter
        assertEquals(0, erdemjegyGenerator.generator(-1));

        // string paraméterrel
        Exception exception = assertThrows(NumberFormatException.class, ()->{
            assertEquals(10, erdemjegyGenerator.generator(Integer.parseInt("d")));
        });

    }



}
