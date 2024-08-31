package org.example;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {

    private Example example;

    /*
    Ejecutar este metodo antes de los test, solo cuando mandamos
    intanciar(crear) el mimso objeto para cada test.
     */
    @BeforeEach
    public void init(){
        this.example = new Example();
    }

    @Test
    public void testSumar() {
        /*Given - Teniendo
         * Colocar todos los parametros
         * que se necesitan para ejecutar el metodo.
         */
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
        int numero = 8;

        //When - Cuando
        boolean result = example.checkPositivo(numero);

        //Then - Entonces
        assertTrue(result);

    }

    @Test
    public void testCheckPositivoError(){

        /*
        Solo cuando se testean errores se utiliza esta estructura.
         */
        //Given - Teniendo
        int numero = -8;

        //Then - Entonces
        assertThrows(IllegalArgumentException.class, () -> {
            example.checkPositivo(numero);
        });
    }

    @Test
    public void testContarLetrasA(){

        //Give -  Teniendo
        String cadena= "unprogramadornace";

        //When - Cuando
        int result = example.contarLetrasA(cadena);

        //Then - Entonces
        assertEquals(3, result);
        assertNotNull(result);
    }

    @Test
    public void testContieneElemento(){

        //Given - Teniendo
        List<String> countries = List.of("Mexico", "Colombia", "Peru");
        String country = "Mexico";

        //When - Cuando
        boolean result = this.example.contieneElemento(countries, country);
        //Then - Entonces
        assertTrue(result);
    }
}