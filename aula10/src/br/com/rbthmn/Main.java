package br.com.rbthmn;

import java.util.logging.Level;

/**
 * Classe principal
 */
public class Main {
    /**
     * Atributo para instanciacao de um logger
     */
    public static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Main.class.getName());

    /**
     * Metodo estatico principal que agrupa as demais funcoes da classe
     *
     * @param args
     */
    public static void main(String[] args) {
        programa01(2, 3, 17);
        programa02();
        programa03(299.3);
        programa04(
                0.05,
                13.10,
                5788,
                12.99,
                610
        );
        programa05(1045.00, 7845.36);
        programa06(2);
    }

    /**
     * Metodo que transforma uma data em dias
     *
     * @param anos Numero inteiro para representacao dos anos
     * @param meses Numero inteiro para representacao dos meses
     * @param dias Numero inteiro para representacao dos dias
     */
    private static void programa01(int anos, int meses, int dias) {
        logger.log(Level.INFO, () -> anos * 365 + meses * 30 + dias + " dias");
    }

    /**
     * Metodo que calcula a media aritmetica dos numeros 8,9 e 7 e a media entre os numeros 4,5 e 6.
     * Depois calcula a soma entre essas medias assim como a media delas.
     *
     */
    private static void programa02() {
        final var media1 = (8 + 9 + 7) / 3;
        final var media2 = (4 + 5 + 6) / 3;
        final var somaMedias = media1 + media2;
        final var mediaDasMedias = somaMedias / 2;
        logger.log(Level.INFO, () -> "Média aritmética dos números 8,9 e 7: " + media1);
        logger.log(Level.INFO, () -> "Média dos números 4, 5 e 6: " + media2);
        logger.log(Level.INFO, () -> "Soma das duas médias: " + somaMedias);
        logger.log(Level.INFO, () -> "Média das médias: " + mediaDasMedias);
    }

    /**
     * Metodo que recebe um saldo e calcula com reajuste de 15 por cento
     *
     * @param saldo Valor do saldo
     */
    private static void programa03(double saldo) {
        logger.log(Level.INFO, () -> "Saldo com reajuste: " + saldo * 1.15);
    }

    /**
     * Metodo que calcula o IPI dado a formula: (valor1quant1 + valor2quant2)*(IPI/100 + 1)
     *
     * @param porcentagemIpi Parametro do tipo double que representa a porcentagem do IPI
     * @param valorPeca1 Parametro do tipo double que representa o valor da peca 1
     * @param qtdPeca1 Parametro do tipo inteiro que representa a quantidade existente da peca 1
     * @param valorPeca2 Parametro do tipo double que representa o valor da peca 2
     * @param qtdPeca2 Parametro do tipo inteiro que representa a quantidade existente da peca 2
     */
    private static void programa04(
            double porcentagemIpi,
            double valorPeca1,
            int qtdPeca1,
            double valorPeca2,
            int qtdPeca2
    ) {
        final double ipi = (valorPeca1 * qtdPeca1 + valorPeca2 * qtdPeca2) * (porcentagemIpi / 100 + 1);
        logger.log(Level.INFO, () -> "Valor do IPI: " + ipi);
    }

    /**
     * Metodo que dado o salario minimo e o salario do usuario, calcula quantos salarios minimos o usuario ganha.
     *
     * @param salarioMinimo Parametro do tipo double que representa o salario minimo estipulado
     * @param salarioUsuario Parametro do tipo double que representa o salario do usuario
     */
    private static void programa05(double salarioMinimo, double salarioUsuario) {
        final var diferenca = (int) Math.floor(salarioUsuario / salarioMinimo);
        logger.log(Level.INFO, () -> "O usuário ganha " + diferenca + "SM");
    }

    /**
     * Metodo que recebe um valor inteiro e calcula seu antecessor e sucessor.
     *
     * @param valor  Parametro do tipo inteiro que representa o valor a ser modificado
     */
    private static void programa06(int valor) {
        final int valorAcrescido = valor++;
        final int valorDecrescido = valor++;
        logger.log(Level.INFO, () -> "Inteiro sucessor: " + valorAcrescido);
        logger.log(Level.INFO, () -> "Inteiro antecessor: " + valorDecrescido);
    }
}
