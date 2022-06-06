import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NegyzetTest {
    @Test
    @DisplayName("negyzet metodus l�tezik")
    public void negyzetTeszt(){
      //negyzet.hanyNegyzet();

    }

    @Test
    @DisplayName("negyzet metodus paramerfogad�s")
    public void negyzetTeszt2(){
        negyzet.hanyNegyzet(72);

    }

    @Test
    @DisplayName("negyzet metodus tesztle�se")
    public void negyzetTeszt3(){
        assertEquals(8, negyzet.hanyNegyzet(72));
        assertEquals(10, negyzet.hanyNegyzet(101));

        // minusz param�terrel
        assertEquals(0, negyzet.hanyNegyzet(-1));


        // string param�terrel
        Exception exception = assertThrows(NumberFormatException.class, ()->{
            assertEquals(10, negyzet.hanyNegyzet(Integer.parseInt("d")));
        });


        // double t�pus� param�terrel
        assertEquals(2,negyzet.hanyNegyzet((int) 4.4));


    }

}
