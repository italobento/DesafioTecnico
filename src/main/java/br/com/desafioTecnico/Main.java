package br.com.desafioTecnico;

import br.com.desafioTecnico.controller.PontuacaoController;
import br.com.desafioTecnico.controller.Util;
import br.com.desafioTecnico.factory.FamiliaFactory;
import br.com.desafioTecnico.model.Familia;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        final int MAX_FAMILIA = 10;
        int qtdeFamilia = Util.gerarRandom(MAX_FAMILIA);

        List<Familia> familias = new ArrayList<>();

        for (int i = 0; i < qtdeFamilia; i++) {
            Familia familia = FamiliaFactory.criarFamilia();
            familias.add(familia);
        }

        PontuacaoController.calcularPontuacao(familias);
        PontuacaoController.ordenarPontuacao(familias);
        PontuacaoController.mostrarPontuacao(familias);

    }
}