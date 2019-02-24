package ex03;
import java.util.Scanner;

public class main3 {

    public static void main(String[] args) {
        float salarioB;
        float emprestimo;
        float porcentagem;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu salário: ");
        salarioB = sc.nextFloat();
        System.out.println("Informe o valor do emprestimo: ");
        emprestimo = sc.nextFloat();
        porcentagem = salarioB * 30/100;
        if (emprestimo <= porcentagem){
            System.out.println("Emprestimo concedido");
        }else{
            System.out.println("Emprestimo não Concedido");
        }

    }

}
