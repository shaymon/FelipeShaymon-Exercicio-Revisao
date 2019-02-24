package ex04;

import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num = sc.nextInt();
        if (num >= 100 || num <= 0) {
            System.out.println("Número não Compreendido");
        }else {
            System.out.println("número compreendido");
        }
    }
}
