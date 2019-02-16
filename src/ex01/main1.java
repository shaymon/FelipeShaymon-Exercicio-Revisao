package ex01;

import java.util.Scanner;

public class main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do Garçom: ");
        String nomeGarc = sc.nextLine();
        System.out.print("Valor das Despesas: ");
        double valorDespesa = sc.nextDouble();
        double valorTot = valorDespesa * 1.1;
        double valorGorjet = valorTot - valorDespesa;

        System.out.println("Valor Total da conta: " + valorTot);
        System.out.print("Valor da gorjeta: " + valorGorjet);


    }


}
