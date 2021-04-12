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

    @Test
    public void TweedeTest() {

        int verschil;

        verschil = 34 - 57;

        int expected = -23;

        assertEquals(expected, verschil);
    }

    @Test
    public void DerdeTest() {

        String s = "abcde";

        String actual = s.toUpperCase();

        String expected = "ABCDE";

        assertEquals(expected, actual);
    }

    //Uit de Counter testen de "add-methode" -->Niets anders dan eerst maar hier maak je gebruik van je object
    @Test
    public void CounterTestAdd() {
        Counter counter = new Counter();

        counter.add(1);
        counter.add(2);
        counter.add(3);

        int expected = 6;

        assertEquals(expected, counter.getTotal());
    }

    //Nu met een array: Uit de counter de methode met de array
    @Test
    public void CounterTestAddArray() {

        //arrange
        Counter counter = new Counter();
        int[] numbers = new int[] {1,2,3};

        //act
        counter.add(numbers);
        int actual = counter.getTotal(); //Zijn persoonlijke voorkeur is zo opschrijven (niet op het laatst pas rekenen maar hier):

        //assert
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void CounterTestReset() {

        //arrange
        Counter counter = new Counter();
        int[] numbers = new int[] {1,2,3};

        //act
        counter.add(numbers);
        counter.reset();
        int actual = counter.getTotal();

        //assert
        int expected = 0;
        assertEquals(expected, actual);
    }

    //voorbeeld eerst de test maken en daarna de methode
    @Test
    public void CounterTestMaximum() {

        //arrange
        Counter counter = new Counter();
        int[] numbers = new int[] {1,2,3};

        //act
        counter.add(numbers);
        int actual = counter.getMaximum(numbers);

        //assert
        int expected = 3;
        assertEquals(expected, actual);
    }
}
