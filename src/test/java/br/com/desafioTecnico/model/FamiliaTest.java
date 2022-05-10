package br.com.desafioTecnico.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class FamiliaTest {

    Familia familia;

    @BeforeEach
    void setUp() {
        familia = new Familia();
    }

    @Test
    @DisplayName("Test getPontuacao")
    void getPontuacao() {
        familia.setPontuacao(10);
        Assertions.assertEquals(10, familia.getPontuacao());
    }

    @Test
    @DisplayName("Test setPontuacao")
    void setPontuacao() {
        familia.setPontuacao(20);
        Assertions.assertEquals(20, familia.getPontuacao());
    }

    @Test
    @DisplayName("Test getRenda")
    void getRenda() {
        familia.setRenda(1000.0);
        Assertions.assertEquals(1000.0, familia.getRenda());
    }

    @Test
    @DisplayName("Test setRenda")
    void setRenda() {
        familia.setRenda(2000.0);
        Assertions.assertEquals(2000.0, familia.getRenda());
    }

    @Test
    @DisplayName("Test getDependentes")
    void getDependentes() {
        Dependente dependente = new Dependente(10);

        List<Dependente> dependentes = new ArrayList<>();
        dependentes.add(dependente);

        familia.setDependentes(dependentes);
        Assertions.assertNotNull(familia.getDependentes());
    }

    @Test
    @DisplayName("Test setDependentes")
    void setDependentes() {
        Dependente dependente = new Dependente(20);

        List<Dependente> dependentes = new ArrayList<>();
        dependentes.add(dependente);

        familia.setDependentes(dependentes);
        Assertions.assertNotNull(familia.getDependentes());
    }

    @Test
    @DisplayName("Test compareTo Familia")
    void compareTo() {
        familia.setPontuacao(10);

        Familia familia2 = new Familia();
        familia2.setPontuacao(20);

        Assertions.assertEquals(-1, familia.compareTo(familia2));
    }

    @Test
    @DisplayName("Test toString Familia")
    void testToString() {
        List<Dependente> dependentes = new ArrayList<>();
        Dependente dependente = new Dependente(10);
        dependentes.add(dependente);

        familia.setRenda(100.0);
        familia.setDependentes(dependentes);

        Assertions.assertEquals("Pontuação: 0 - Renda: 100.0 - Dependentes: [10,]", familia.toString());
    }
}