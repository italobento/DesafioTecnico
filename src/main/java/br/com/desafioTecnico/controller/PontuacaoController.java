package br.com.desafioTecnico.controller;

import br.com.desafioTecnico.model.Dependente;
import br.com.desafioTecnico.model.Familia;

import java.util.Collections;
import java.util.List;

public class PontuacaoController {

    public static void calcularPontuacao(List<Familia> familias) {
        for (Familia familia : familias) {

            if (familia.getRenda() <= 900) {
                familia.setPontuacao(familia.getPontuacao() + 5);
            } else if (familia.getRenda() <= 1500) {
                familia.setPontuacao(familia.getPontuacao() + 3);
            }

            int count = 0;
            for (Dependente dependente : familia.getDependentes()) {
                if (dependente.getIdade() <= 18) {
                    count++;
                }
            }

            if (count >= 3) {
                familia.setPontuacao(familia.getPontuacao() + 3);
            } else if (count > 0) {
                familia.setPontuacao(familia.getPontuacao() + 2);
            }
        }
    }

    public static void mostrarPontuacao(List<Familia> familias) {
        for (Familia familia : familias) {
            System.out.println(familia.toString());
        }
    }

    public static void ordenarPontuacao(List<Familia> familias) {
        Collections.sort(familias);
    }

}
