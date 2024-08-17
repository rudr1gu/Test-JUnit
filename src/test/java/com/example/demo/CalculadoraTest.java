package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculadoraTest {
    private CalculadoraService calculadoraService;

    @BeforeEach
    public void setUp() {
        calculadoraService = new CalculadoraService();
    }

    @Test
    public void testAdicionar() {
        assertEquals(4, calculadoraService.adicionar(2, 2));
    }

    @Test
    public void testSubtrair() {
        assertEquals(0, calculadoraService.subtrair(2, 2));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(4, calculadoraService.multiplicar(2, 2));
    }

    @Test
    public void testDividir() {
        assertEquals(1, calculadoraService.dividir(2, 2));
    }

    @Test
    public void testDividirPorZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadoraService.dividir(2, 0);
        });
    }
    
}