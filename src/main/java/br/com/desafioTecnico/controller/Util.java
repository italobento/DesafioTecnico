package br.com.desafioTecnico.controller;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Random;

public class Util {

    public static int gerarRandom(int max) {
        return new Random().nextInt(max);
    }

    public static double gerarRandom(double max) {
        double random = new Random().nextDouble();
        double resultado = (random * max);

        DecimalFormatSymbols decimalSymbols = DecimalFormatSymbols.getInstance();
        decimalSymbols.setDecimalSeparator('.');

        String numFormatado = new DecimalFormat("#.##", decimalSymbols).format(resultado);
        return Double.parseDouble(numFormatado);
    }

}
