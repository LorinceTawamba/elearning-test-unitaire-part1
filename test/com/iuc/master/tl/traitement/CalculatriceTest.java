package com.iuc.master.tl.traitement;

import org.junit.jupiter.api.*;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatriceTest {

    private double nbre1;
    private double nbre2;

    private Calculatrice cal;

    @BeforeEach
    void setUp() {
        nbre1 = new Random().nextDouble()*250;
        nbre2 = new Random().nextDouble()*100;
        cal = new Calculatrice();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @Order(1)
    void additionTest() {
        // Given
        System.out.println("nbre1 = " + nbre1);
        System.out.println("nbre2 = " + nbre2);

        // When
        double expected = nbre1+nbre2;
        double resultat = cal.addition(nbre1, nbre2);

        // Then
        assertEquals(expected, resultat);
    }

    @Test
    @Order(3)
    void soustractionTest() {
        // Given
        System.out.println("nbre1 = " + nbre1);
        System.out.println("nbre2 = " + nbre2);

        // When
        double expected = nbre1-nbre2;
        double resultat = cal.soustraction(nbre1, nbre2);

        // Then
        assertEquals(expected, resultat);
    }

    @Test
    @Order(4)
    void multiplicationTest() {
        // Given
        System.out.println("nbre1 = " + nbre1);
        System.out.println("nbre2 = " + nbre2);

        // When
        double expected = nbre1*nbre2;
        double resultat = cal.multiplication(nbre1, nbre2);

        // Then
        assertEquals(expected, resultat);
    }

    @Test
    @Order(2)
    void divisionTest() {
        // Given
        System.out.println("nbre1 = " + nbre1);
        System.out.println("nbre2 = " + nbre2);

        // When
        double expected = nbre1/nbre2;
        double resultat = cal.division(nbre1, nbre2);

        // Then
        assertEquals(expected, resultat);
    }
}