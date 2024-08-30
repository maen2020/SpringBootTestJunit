package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {

    @Test
    public void testSumar() {
        /*Given - Teniendo
         * Colocar todos los parametros
         * que se necesitan para ejecutar el metodo.
         */
        Example example = new Example();
        int numberA = 3;
        int numberB = 3;

        /*When - Cuando
         * Se llama al metodo.
         */
        int result = example.sumar(numberA, numberB);


        //Then - Entonces
        assertEquals(6, result);
        assertNotNull(result);
        assertInstanceOf(Integer.class, result);
    }

    @Test
    public void testCheckPositivo(){

        //Given - Teniendo
        Example example = new Example();
        int numero = 8;

        //When - Cuando
        boolean result = example.checkPositivo(numero);

        //Then - Entonces
        assertInstanceOf(Boolean.class, result);
    }
}
