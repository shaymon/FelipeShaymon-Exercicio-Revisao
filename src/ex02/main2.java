package ex02;

import javax.swing.*;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double volume;
        double pi=3.141559;
        double altura;
        double r;
        System.out.println("Informe o raio: ");
        r = Double.parseDouble(JOptionPane.showInputDialog("informe o raio"));

        System.out.println("Informe a altura: ");
        altura = Double.parseDouble(JOptionPane.showInputDialog("informe a altura: "));

        volume = pi*(r*r)*altura;

        System.out.println("O valor do volume de uma lata de óleoé " + volume);


    }

}
