package com.poo.introducao;

import java.util.Scanner;

public class Lista1 {

    void ex1() {

        int numero1;
        int numero2;
        int soma;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextInt();

        soma = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " e " + numero2 + " é " + soma);

    }

    void ex2() {

        Scanner scanner = new Scanner(System.in);

        String nome;
        String sobrenome;

        System.out.println("digite seu nome: ");
        nome = scanner.nextLine();

        System.out.println("digite seu sobrenome: ");
        sobrenome = scanner.nextLine();

        System.out.println("ola " + nome + " " + sobrenome);
        scanner.close();
    }

    void ex3() {

        Scanner scanner = new Scanner(System.in);

        double real;
        double dolar = 5.25;
        double valordolar;

        System.out.println("digite o valor em real: ");
        real = scanner.nextDouble();

        valordolar = real / dolar;

        System.out.println("você recebera " + valordolar);
        scanner.close();

    }

    void ex4() {

        Scanner scanner = new Scanner(System.in);

        int numeroDigitado;
        int respostaSucessor;
        int respostaAntecessor;

        System.out.println("digite seu numero ");
        numeroDigitado = scanner.nextInt();

        respostaAntecessor = numeroDigitado - 1;
        respostaSucessor = numeroDigitado + 1;

        System.out.println("O antecessor é " + respostaAntecessor + " O sucessor é " + respostaSucessor);
        scanner.close();
    }

    void ex5() {

        Scanner scanner = new Scanner(System.in);

        double valorMetroquadrado;
        double areaDoTerreno;
        double valorDoTerreno;

        System.out.println("digite o valor do m²: ");
        valorMetroquadrado = scanner.nextDouble();

        System.out.println("digite a area do terreno ");
        areaDoTerreno = scanner.nextDouble();

        valorDoTerreno = valorMetroquadrado * areaDoTerreno;

        System.out.println("o valor do seu terreno é de R$ " + valorDoTerreno);
        scanner.close();

    }

    void ex6() {

        Scanner scanner = new Scanner(System.in);

        float distanciaPercorrida;
        float QuantidadeDeCombustivelGasto;
        float resultado;

        System.out.println("Quantos quilometros você percorreu ");
        distanciaPercorrida = scanner.nextFloat();

        System.out.println("Quanto de combustivel você gastou: ");
        QuantidadeDeCombustivelGasto = scanner.nextFloat();

        resultado = distanciaPercorrida / QuantidadeDeCombustivelGasto;

        System.out.println("Seu carro esta consumindo KM/L " + resultado);
        scanner.close();

    }

    void ex7() {

        Scanner scanner = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double resultado;

        System.out.println("digite a primeira nota: ");
        nota1 = scanner.nextFloat();

        System.out.println("digite a segunta nota: ");
        nota2 = scanner.nextFloat();

        System.out.println("digite a terceira nota: ");
        nota3 = scanner.nextFloat();

        System.out.println("digite a quarta nota: ");
        nota4 = scanner.nextFloat();

        resultado = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Sua media é " + resultado);
        scanner.close();
    }

    void ex8() {

        Scanner scanner = new Scanner(System.in);

        double fahrenheit;
        double resultado;

        System.out.println("digite a temperatura em fahrenheit: ");
        fahrenheit = scanner.nextFloat();

        resultado = (fahrenheit - 32) * 5 / 9;

        System.out.println("o valor em graus celsios é de: " + resultado);
        scanner.close();
    }
}