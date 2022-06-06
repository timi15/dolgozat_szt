import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NegyzetTest {
    @Test
    @DisplayName("negyzet metodus létezik")
    public void negyzetTeszt(){
      //negyzet.hanyNegyzet();

    }

    @Test
    @DisplayName("negyzet metodus paramerfogadás")
    public void negyzetTeszt2(){
        negyzet.hanyNegyzet(72);

    }

    @Test
    @DisplayName("negyzet metodus tesztleése")
    public void negyzetTeszt3(){
        assertEquals(8, negyzet.hanyNegyzet(72));
        assertEquals(10, negyzet.hanyNegyzet(101));

        // minusz paraméterrel
        assertEquals(0, negyzet.hanyNegyzet(-1));


        // string paraméterrel
        Exception exception = assertThrows(NumberFormatException.class, ()->{
            assertEquals(10, negyzet.hanyNegyzet(Integer.parseInt("d")));
        });


        // double típusú paraméterrel
        assertEquals(2,negyzet.hanyNegyzet((int) 4.4));


    }

}
