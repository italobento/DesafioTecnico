package br.com.desafioTecnico.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DependenteTest {

    Dependente dependente;

    @BeforeEach
    void setUp() {
        dependente = new Dependente(18);
    }

    @Test
    @DisplayName("Test Dependente getIdade")
    void getIdade() {
        Assertions.assertEquals(18, dependente.getIdade());
    }

    @Test
    @DisplayName("Test Dependente setIdade")
    void setIdade() {
        dependente.setIdade(19);
        Assertions.assertEquals(19, dependente.getIdade());
    }
}