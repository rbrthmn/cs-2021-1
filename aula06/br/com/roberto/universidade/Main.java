package br.com.roberto.universidade;

import jdk.internal.logger.BootstrapLogger;

public class Main {
    private static BootstrapLogger logger;

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

    private static void programa01(int anos, int meses, int dias) {
        logger.log(System.Logger.Level.INFO, anos * 365 + meses * 30 + dias + " dias");
    }

    private static void programa02() {
        final var media1 = (8 + 9 + 7) / 3;
        final var media2 = (4 + 5 + 6) / 3;
        final var somaMedias = media1 + media2;
        final var mediaDasMedias = somaMedias / 2;
        logger.log(System.Logger.Level.INFO, "Média aritmética dos números 8,9 e 7: " + media1);
        logger.log(System.Logger.Level.INFO, "Média dos números 4, 5 e 6: " + media2);
        logger.log(System.Logger.Level.INFO, "Soma das duas médias: " + somaMedias);
        logger.log(System.Logger.Level.INFO, "Média das médias: " + mediaDasMedias);
    }

    private static void programa03(double saldo) {
        logger.log(System.Logger.Level.INFO, "Saldo com reajuste: " + saldo * 1.15);
    }

    private static void programa04(
            double porcentagemIpi,
            double valorPeca1,
            int qtdPeca1,
            double valorPeca2,
            int qtdPeca2
    ) {
        final double ipi = (valorPeca1 * qtdPeca1 + valorPeca2 * qtdPeca2) * (porcentagemIpi / 100 + 1);
        logger.log(System.Logger.Level.INFO, "Valor do IPI: " + ipi);
    }

    private static void programa05(double salarioMinimo, double salarioUsuario) {
        final var diferenca = (int) Math.floor(salarioUsuario / salarioMinimo);
        logger.log(System.Logger.Level.INFO, "O usuário ganha " + diferenca + "SM");
    }

    private static void programa06(int valor) {
        logger.log(System.Logger.Level.INFO, "Inteiro sucessor: " + valor++);
        logger.log(System.Logger.Level.INFO, "Inteiro antecessor: " + (valor - 1));
    }
}
