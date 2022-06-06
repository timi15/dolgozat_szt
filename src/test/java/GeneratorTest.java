import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratorTest {

    @Test
    @DisplayName("Gener�tor met�dus l�trehoz�sa")
    public void eredmenyGeneratorTest(){

      //  erdemjegyGenerator.generator();
    }

    @Test
    @DisplayName("Gener�tor met�dus param�ter")
    public void eredmenyGeneratorTest2(){

        erdemjegyGenerator.generator(4);
    }

    @Test
    @DisplayName("Gener�tor met�dus tesztel�se")
    public void eredmenyGeneratorTest3(){

        // m�nusz param�ter
        assertEquals(0, erdemjegyGenerator.generator(-1));

        // string param�terrel
        Exception exception = assertThrows(NumberFormatException.class, ()->{
            assertEquals(10, erdemjegyGenerator.generator(Integer.parseInt("d")));
        });

    }



}
