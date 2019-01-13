package Styczen2019;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestrukcyjneHasloTest {
   @Test
    public void test(){
        String pasword="ssoopp";

        boolean a=RestrukcyjneHaslo.validationOfPassword1(pasword);
        assertFalse(a);
    }
}