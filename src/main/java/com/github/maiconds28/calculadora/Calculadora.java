package com.github.maiconds28.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double primeiroNum, soma, subt, multip, divi;
        int segundoNum;

        // Leitura do primeiro número
        System.out.print("Digite o primeiro número: ");
        primeiroNum = sc.nextDouble();

        // Leitura do segundo número com validação (diferente de zero)
        do {
            System.out.print("Digite o segundo número (diferente de zero): ");
            segundoNum = sc.nextInt();
        } while (segundoNum == 0);

        // Operações
        soma = primeiroNum + segundoNum;
        subt = primeiroNum - segundoNum;
        multip = primeiroNum * segundoNum;
        divi = primeiroNum / segundoNum;
        
        // Resultados
        System.out.println("\nA soma é: " + soma);
        System.out.println("A subtração do primeiro pelo segundo é: " + subt);
        System.out.println("A multiplicação é: " + multip);
        System.out.println("A divisão do primeiro pelo segundo é: " + divi);

        sc.close();
    }
}
