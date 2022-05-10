package br.com.desafioTecnico.factory;

import br.com.desafioTecnico.controller.Util;
import br.com.desafioTecnico.model.Dependente;
import br.com.desafioTecnico.model.Familia;

import java.util.ArrayList;
import java.util.List;

public class FamiliaFactory {

    public static Familia criarFamilia() {
        final int MAX_IDADE = 25;
        final int MAX_QTDE_DEPENDENTES = 5;
        final double MAX_RENDA = 2000.00;

        int qtdeDependentes = Util.gerarRandom(MAX_QTDE_DEPENDENTES);
        List<Dependente> dependentes = new ArrayList<>();

        for (int i = 0; i < qtdeDependentes; i++) {
            int idade = Util.gerarRandom(MAX_IDADE);
            Dependente dependente = new Dependente(idade);
            dependentes.add(dependente);
        }

        double renda = Util.gerarRandom(MAX_RENDA);
        return new Familia(renda, dependentes);
    }
}
