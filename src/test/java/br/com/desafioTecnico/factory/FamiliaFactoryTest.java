package br.com.desafioTecnico.factory;

import br.com.desafioTecnico.model.Dependente;
import br.com.desafioTecnico.model.Familia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class FamiliaFactoryTest {

    @Test
    @DisplayName("Test criar objeto Familia")
    void criarFamilia() {
        Dependente dependente = new Dependente(10);
        List<Dependente> dependentes = new ArrayList<>();
        dependentes.add(dependente);

        Familia familia = new Familia(100.0, dependentes);

        Assertions.assertInstanceOf(familia.getClass(), FamiliaFactory.criarFamilia());
    }
}