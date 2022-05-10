package br.com.desafioTecnico.controller;

import br.com.desafioTecnico.model.Dependente;
import br.com.desafioTecnico.model.Familia;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class PontuacaoControllerTest {

    List<Dependente> dependentes;
    List<Familia> familias;

    @BeforeEach
    void setUp() {
        Dependente dependente1 = new Dependente(17);
        Dependente dependente2 = new Dependente(18);
        Dependente dependente3 = new Dependente(19);

        dependentes = new ArrayList<>();
        dependentes.add(dependente1);
        dependentes.add(dependente2);
        dependentes.add(dependente3);

        Familia familia1 = new Familia(900.0, dependentes);
        Familia familia2 = new Familia(1500.0, dependentes);
        Familia familia3 = new Familia(3000.0, dependentes);

        familias = new ArrayList<>();
        familias.add(familia1);
        familias.add(familia2);
        familias.add(familia3);
    }

    @Test
    @DisplayName("Test Calcular pontuação com mais de 3 dependentes maior de idade")
    void calcularPontuacaoMaior3Dependentes() {
        Dependente dependente = new Dependente(16);
        dependentes.add(dependente);

        PontuacaoController.calcularPontuacao(familias);
    }

    @Test
    @DisplayName("Test Calcular pontuação com menos de 3 dependentes maior de idade")
    void calcularPontuacaoMenor3Dependentes() {
        PontuacaoController.calcularPontuacao(familias);
    }

    @Test
    @DisplayName("Test Mostrar pontuação das famílias")
    void mostrarPontuacao() {
        PontuacaoController.mostrarPontuacao(familias);
    }

    @Test
    @DisplayName("Test Ordenar pontuação das famílias do menor para o maior")
    void ordenarPontuacao() {
        PontuacaoController.ordenarPontuacao(familias);
    }

}