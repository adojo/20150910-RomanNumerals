package de.adesso.evergabe.dojo.roman;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

public class MyTest {

    IntToRomanConverter sut = new IntToRomanConverter();

    @Test
     public void oneIsI() {
        assertEquals("I", sut.toRoman(1));
    }

    @Test
    public void twoIsII() {
        assertEquals("II", sut.toRoman(2));
    }

    @Test
    public void fiveToV(){
        assertEquals("V", sut.toRoman(5));
    }

    @Test
    public void thousendToM(){
        assertEquals("M", sut.toRoman(1000));
    }



    @Test
    public void fourToIV(){
        assertEquals("IV", sut.toRoman(4));
    }
    @Test
    public void threeToIII(){
        assertEquals("III", sut.toRoman(3));
    }

    @Test
    public void is1903toMCMIII(){
        assertEquals("MCMIII", sut.toRoman(1903));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isBeyond3000() {
        sut.toRoman(3400);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isSubZero() {
        sut.toRoman(-5);
    }

    @Test
    public void isWrong() {
        String roman = sut.toRoman(1907);
        assertNotEquals("DieMuddaVomPepe", roman);
    }



}
