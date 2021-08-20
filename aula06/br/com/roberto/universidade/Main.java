package br.com.roberto.universidade;

public class Main {

    public static void main(String[] args) {
        programa01(2, 3, 17);
        programa02();
        programa03(299.3);
        programa04(
                0.05,
                12,
                13.10,
                5788,
                23,
                12.99,
                610
        );
        programa05(1045.00, 7845.36);
        programa06(2);
    }

    private static void programa01(int anos, int meses, int dias) {
        System.out.println(anos * 365 + meses * 30 + dias + " dias");
    }

    private static void programa02() {
        final var media1 = (8 + 9 + 7) / 3;
        final var media2 = (4 + 5 + 6) / 3;
        final var somaMedias = media1 + media2;
        final var mediaDasMedias = somaMedias / 2;
        System.out.println("Média aritmética dos números 8,9 e 7: " + media1);
        System.out.println("Média dos números 4, 5 e 6: " + media2);
        System.out.println("Soma das duas médias: " + somaMedias);
        System.out.println("Média das médias: " + mediaDasMedias);
    }

    private static void programa03(double saldo) {
        System.out.println("Saldo com reajuste: " + saldo * 1.15);
    }

    private static void programa04(
            double porcentagemIpi,
            int codigoPeca1,
            double valorPeca1,
            int qtdPeca1,
            int codigoPeca2,
            double valorPeca2,
            int qtdPeca2
    ) {
        final double ipi = (valorPeca1 * qtdPeca1 + valorPeca2 * qtdPeca2) * (porcentagemIpi / 100 + 1);
        System.out.println("Valor do IPI: " + ipi);
    }

    private static void programa05(double salarioMinimo, double salarioUsuario) {
        final var diferenca = (int) Math.floor(salarioUsuario/salarioMinimo) ;
        System.out.println("O usuário ganha " + diferenca + "SM");
    }

    private static void programa06(int valor) {
        System.out.println("Inteiro sucessor: " + valor++);
        System.out.println("Inteiro antecessor: " + valor--);
    }
}
