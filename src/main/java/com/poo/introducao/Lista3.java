package com.poo.introducao;

import java.util.Scanner;
import java.util.Random;

public class Lista3 {

    void ex1() {

        Scanner scanner = new Scanner(System.in);

        int segundos;

        System.out.print("Digite um número 'entre 1 e 59': ");
        segundos = scanner.nextInt();

        System.out.println("Contagem regressiva iniciada:");

        while (segundos > 0) {
            System.out.println(segundos);
            segundos--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

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

    void ex5() {

        Scanner scanner = new Scanner(System.in);

        String loginCorreto = "isaac";
        String senhaCorreta = "isaac123";
        int tentativas = 3;
        boolean acessoNegado = false;

        while (tentativas > 0) {

            System.out.print("Digite o login: ");
            String login = scanner.nextLine();
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            if (login.equals(loginCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Login realizado com sucesso!");
                break;
            } else {

                tentativas--;

                if (!login.equals(loginCorreto) && (tentativas > 0)) {
                    System.out.println("Login incorreto. Tente novamente.");

                    if (!senha.equals(senhaCorreta) && (tentativas > 0)) {
                        System.out.println("senha incorreta. Tente novamente.");

                    }
                    System.out.println("Tentativas restantes: " + (tentativas));
                } else if (!senha.equals(senhaCorreta) && (tentativas > 0)) {
                    System.out.println("senha incorreta. Tente novamente.");
                    System.out.println("Tentativas restantes: " + (tentativas));
                }
                if (tentativas == 1) {
                    System.out.println("Última tentativa, mais um erro e seu acesso será bloqueado!");
                }
            }
        }

        if (tentativas == 0) {
            System.out.println("Número máximo de tentativas alcançado. Seu acesso foi bloqueado.");
            acessoNegado = true;
        }
    }

    void ex6() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de andares da pirâmide: ");
        int andares = scanner.nextInt();

        for (int i = 1; i <= andares; i++) {

            for (int j = andares - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    void ex7() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a largura do retângulo: ");
        int largura = scanner.nextInt();
        
        System.out.print("Digite a altura do retângulo: ");
        int altura = scanner.nextInt();
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}

    

