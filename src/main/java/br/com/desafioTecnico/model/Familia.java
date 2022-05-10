package br.com.desafioTecnico.model;

import java.util.List;

public class Familia implements Comparable<Familia> {

    private Integer pontuacao = 0;
    private Double renda;
    private List<Dependente> dependentes;

    public Familia() {

    }

    public Familia(Double renda, List<Dependente> dependentes) {
        this.renda = renda;
        this.dependentes = dependentes;
    }


    public Integer getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Integer pontuacao) {
        this.pontuacao = pontuacao;
    }

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }

    public List<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(List<Dependente> dependentes) {
        this.dependentes = dependentes;
    }

    @Override
    public int compareTo(Familia f) {
        return getPontuacao().compareTo(f.getPontuacao());
    }

    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder();
        resultado.append("Pontuação: ")
                .append(getPontuacao())
                .append(" - Renda: ")
                .append(getRenda())
                .append(" - Dependentes: [");

        for (Dependente dependente : getDependentes()) {
            resultado.append(dependente.getIdade())
                    .append(",");
        }

        resultado.append("]");
        return resultado.toString();

    }

}