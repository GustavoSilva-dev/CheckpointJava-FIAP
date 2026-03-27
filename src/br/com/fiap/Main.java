package br.com.fiap;

import java.util.Scanner;

// rm573880 - Gustavo Soares Silva
// rm565337 - Luiz Fernando Machado de Moura
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DespesaFamiliar desp = new DespesaFamiliar();

        try {
            System.out.println("Digite a sua renda familiar total:");
            desp.rendaFamiliar = scan.nextDouble();
            System.out.println("Digite o número de moradores da sua casa:");
            desp.numeroDeMoradores = scan.nextInt();
            System.out.println("Digite o gasto com conta de luz:");
            desp.gastoComLuz = scan.nextDouble();
            System.out.println("Digite o gasto com conta de água:");
            desp.gastoComAgua = scan.nextDouble();
            System.out.println("Digite o gasto com conta de internet:");
            desp.gastoComInternet = scan.nextDouble();
            System.out.println("Digite o gasto com a mensalidade da academia:");
            desp.valorMensalidadeDaAcademia = scan.nextDouble();

            System.out.printf("Renda Familiar Total: R$%.3f, Gasto Total com Despesas: R$%.3f, Renda Familiar Líquida: R$%.3f", desp.rendaFamiliar, desp.calcularTotalDeDespesas(), desp.calcularRendaFamiliarLiquida());
        } catch (Exception e) {
            System.out.println("--- Digito incorreto, tente novamente ;( ---");
        }

    }
}
