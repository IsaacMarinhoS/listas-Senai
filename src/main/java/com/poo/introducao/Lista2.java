package com.poo.introducao;

import java.util.Scanner;

public class Lista2 {

    void ex1() {
        Scanner scanner = new Scanner(System.in);

        int numeroDigitado;

        System.out.print("Digite o primeiro número: ");
        numeroDigitado = scanner.nextInt();

        if (numeroDigitado != 0) {
            if (numeroDigitado % 2 == 0) {
                System.out.println("Seu numero é par!");
            } else {
                System.out.print("seu numero é impar!");
            }
        } else {
            System.out.println("Numero é 0!");
            scanner.close();

        }
    }

    void ex2() {
        Scanner scanner = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("digite um numero: ");
        numero1 = scanner.nextInt();

        System.out.println("digite um numero: ");
        numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("numero " + numero1 + " é maior que numero " + numero2);

        } else {
            System.out.println("numero " + numero2 + " é maior que numero " + numero1);
        }
    }

    void ex3() {

        Scanner scanner = new Scanner(System.in);

        String idade = "n";
        String gestante = "n";
        String deficiente = "n";

        System.out.print("Você tem 65 anos ou mais? Responda com s/n: ");
        idade = scanner.nextLine();

        if (idade.equals("s")) {
            System.out.println("Encaminhe-se à fila preferencial.");
        } else {
            System.out.print("Você é gestante? Responda com s/n: ");
            gestante = scanner.nextLine();

            if (gestante.equals("s")) {
                System.out.println("Encaminhe-se à fila preferencial.");
            } else {
                System.out.print("Você é deficiente) Responda com s/n: ");
                deficiente = scanner.nextLine();
                if (deficiente.equals("s")) {
                    System.out.println("Encaminhe-se à fila preferencial.");
                } else {
                    System.out.println("Encaminh-se à fila comum.");
                }
            }
        }
    }

    void ex4() {

        Scanner scanner = new Scanner(System.in);

        int idade;
        int menorDeIdade;
        int maiorDeIdade;
        int acompanhado;

        System.out.print("digite sua idade:");
        idade = scanner.nextInt();

        if (idade < 16) {
            System.out.print("você não pode entrar!");
        } else if (idade >= 16 && idade < 18) {
            System.out.print("Você pode entrar somente acompanhado!");
        } else {
            System.out.print("Você esta liberado!");

        }
    }

    void ex5() {

        Scanner scanner = new Scanner(System.in);

        String login = "isaacAbc";
        String senha = "isaac2929";
        String loginDigitado;
        String senhaDigitada;

        System.out.print("Digite seu login: ");
        loginDigitado = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        senhaDigitada = scanner.nextLine();

        if (loginDigitado.equals(login) && senhaDigitada.equals(senha)) {
            System.out.print("Login e senha corretos.");
        } else if (!loginDigitado.equals(login)) {
            System.out.print("Login ou senha incorreta.");
        } else if (!senhaDigitada.equals(senha)) {
            System.out.print("Login ou senha incorreta.");

        }
    }

    void ex6() {

        Scanner scanner = new Scanner(System.in);

        double nota1;
        double nota2;
        double media;
        double recuperacao;

        System.out.print("digite a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("digite a segunda nota: ");
        nota2 = scanner.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media >= 6) {
            System.out.print("Você passou com a media: "+media );
        } else {
            System.out.print("Você esta de recuperação. Digite a nota de recuperação: ");
            recuperacao = scanner.nextDouble();
            if (nota1 < nota2) {
                nota1 = recuperacao;

            } else {
                nota2 = recuperacao;
            }
            media = (nota1 + nota2) / 2;
            if (media >= 6) {
                System.out.print("Você passou com a media: "+media);
            } else {
                System.out.print("Você esta reprovado!");

            }
        }

    }
}
