package com.poo.introducao;

import java.util.Scanner;
import java.util.Random;

public class Lista3 {

    void ex2() {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int multiplicacao;

        System.out.println("escreva um numero: ");
        numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            multiplicacao = numero * i;
            System.out.println(numero + " x " + i + " = " + multiplicacao);
        }
    }

    void ex3() {
        Scanner scanner = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("escreva um numero: ");
        numero1 = scanner.nextInt();

        System.out.print("escreva outro numero: ");
        numero2 = scanner.nextInt();

        if (numero1 <= numero2) {
            for (int i = numero1; i <= numero2; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = numero2; i <= numero1; i++) {

                if (i % 2 == 0) {
                    System.out.println(i);
                }

            }
        }
    }

    void ex4() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroEscolhido;
        int diferenca;
        int palpite = -1;

        numeroEscolhido = random.nextInt(100) + 1;

        System.out.println("Tente adivinhar o número.");

        while (palpite != numeroEscolhido) {
            System.out.print("Seu palpite: ");
            palpite = scanner.nextInt();

            diferenca = Math.abs(numeroEscolhido - palpite);

            if (palpite < numeroEscolhido) {
                if (diferenca > 10) {
                    System.out.println("Muito baixo");
                } else if (diferenca <= 2) {
                    System.out.println("Quase lá");
                } else {
                    System.out.println("Tá frio");
                }
            } else if (palpite > numeroEscolhido) {
                if (diferenca > 10) {
                    System.out.println("Muito alto");
                } else if (diferenca <= 2) {
                    System.out.println("Quase lá");
                } else {
                    System.out.println("Tá frio");
                }
            } else {
                System.out.println("Parabéns! Você adivinhou o número.");
            }

        }

    }
}
