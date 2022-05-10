package br.com.desafioTecnico.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UtilTest {

    @Test
    @DisplayName("Test random int")
    void gerarRandomInt() {
        int num = 5;
        Assertions.assertTrue(Util.gerarRandom(num) <= num);
    }

    @Test
    @DisplayName("Test random double")
    void gerarRandomDouble() {
        double num = 5.0;
        Assertions.assertTrue(Util.gerarRandom(num) <= num);
    }
}