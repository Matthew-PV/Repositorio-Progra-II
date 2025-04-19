package com.prograII.dominio;

import junit.framework.TestCase;

public class Ejercicio11Test extends TestCase {
    private final Ejercicio11 mates = new Ejercicio11();

    //Apartado 1
    /**
     * Comprueba el apartado 1 para n = 0
     */
    public void testSumaNRecursivoN0() {
        assertEquals(0, mates.sumaNRecursiva(0));
    }
    /**
     * Comprueba el apartado 1 para n = 4
     */
    public void testSumaNRecursivoN4() {
        assertEquals(10, mates.sumaNRecursiva(4));
    }
    /**
     * Comprueba el apartado 1 para n = -4
     */
    public void testSumaNRecursivoMenos4() {
        assertEquals(-10, mates.sumaNRecursiva(-4));
    }
    /**
     * Comprueba el apartado 1 para n = 0
     */
    public void testSumaNFuncionalN0() {
        assertEquals(0, mates.sumaNFuncional(0));
    }
    /**
     * Comprueba el apartado 1 para n = 4
     */
    public void testSumaNFuncionalN4() {
        assertEquals(10, mates.sumaNFuncional(4));
    }
    /**
     * Comprueba el apartado 1 para n = -4
     */
    public void testSumaNFuncionalMenos4() {
        assertEquals(-10, mates.sumaNFuncional(-4));
    }



    //Apartado 2
    /**
     * Comprueba el apartado 2 para n = 0
     */
    public void testFactorialRecursivoN0() {
        assertEquals(1, mates.factorialRecursivo(0));
    }
    /**
     * Comprueba el apartado 2 para n = 1
     */
    public void testFactorialRecursivoN1() {
        assertEquals(1, mates.factorialRecursivo(1));
    }
    /**
     * Comprueba el apartado 2 para n = 4.
     */
    public void testFactorialRecursivoN4() {
        assertEquals(24, mates.factorialRecursivo(4));
    }
    /**
     * Comprueba el apartado 2 para n = -4
     */
    public void testFactorialRecursivolMenos4() {
        assertEquals(-1, mates.factorialRecursivo(-4));
    }

    /**
     * Comprueba el apartado 2 para n = 0
     */
    public void testFactorialFuncionalN0() {
        assertEquals(1, mates.factorialFuncional(0));
    }
    /**
     * Comprueba el apartado 2 para n = 1
     */
    public void testFactorialFuncionalN1() {
        assertEquals(1, mates.factorialFuncional(1));
    }
    /**
     * Comprueba el apartado 2 para n = 4
     */
    public void testFactorialFuncionalN4() {
        assertEquals(24, mates.factorialFuncional(4));
    }
    /**
     * Comprueba el apartado 2 para n = -4
     */
    public void testFactorialFuncionalMenos4() {
        assertEquals(-1, mates.factorialFuncional(-4));
    }



    //Apartado 3
    /**
     * Comprueba el apartado 3 para base = 0 y exponente = 0.
     * Dado que es una indeterminación, se devuelve -1.
     */
    public void testPotenciaRecursiva0a0() {
        assertEquals(-1, mates.potenciaRecursiva(0, 0));
    }
    /**
     * Comprueba el apartado 3 para base = 0 y exponente = 1.
     */
    public void testPotenciaRecursivaBase0a1() {
        assertEquals(0, mates.potenciaRecursiva(0, 1));
    }
    /**
     * Comprueba el apartado 3 para base = 0 y exponente = 5.
     */
    public void testPotenciaRecursivaBase0a5() {
        assertEquals(0, mates.potenciaRecursiva(0, 5));
    }

    /**
     * Comprueba el apartado 3 para base = 0 y exponente = 0.
     * Dado que es una indeterminación, se devuelve -1.
     */
    public void testPotenciaFuncional0a0() {
    }
}