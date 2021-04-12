//package test; Dit had hij maar dat kan zijn omdat hij een fout moest herstellen

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CounterTest {

    @Test
    public void EersteTest() {

        int som;

        som = 34 + 56;

        int expected = 90;

        //Het gaat steeds over de expected en de Actual
        assertEquals(expected, som);

    }

}
