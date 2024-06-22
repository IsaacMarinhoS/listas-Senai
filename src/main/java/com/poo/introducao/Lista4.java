package com.poo.introducao;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista4 {

    void ex1() {

        double totalVendas = 0;

        double[] vendasDoDia = { 400, 50.75, 50.25, 550, 150, 250 };

        for (int i = 0; i < vendasDoDia.length; i++) {
            totalVendas += vendasDoDia[i];
        }

        System.out.print("O total de vendas do dia é: R$ " + totalVendas);
    }

    void ex2() {

        double totalVendas = 0;
        double[] vendasDoDia = { 400, 50.75, 50.25, 550, 150, 250 };
        double menorVenda = vendasDoDia[0];
        double maiorVenda = vendasDoDia[0];

        for (int i = 0; i < vendasDoDia.length; i++) {
            totalVendas += vendasDoDia[i];
        }
        for (int i = 1; i < vendasDoDia.length; i++) {
            if (vendasDoDia[i] < menorVenda) {
                menorVenda = vendasDoDia[i];
            }
            if (vendasDoDia[i] > maiorVenda) {
                maiorVenda = vendasDoDia[i];
            }
        }
        System.out.println("O total de vendas do dia é: R$ " + totalVendas);
        System.out.println("A compra de menor valor foi R$ " + menorVenda);
        System.out.println("A compra de maior valor foi R$ " + maiorVenda);
    }

    void ex3() {

        double totalVendas = 0;
        double[] vendasDoDia = { 400, 50.75, 50.25, 550, 150, 250 };
        double menorVenda = vendasDoDia[0];
        double maiorVenda = vendasDoDia[0];
        double ticketMedio = 0;

        for (int i = 0; i < vendasDoDia.length; i++) {
            totalVendas += vendasDoDia[i];
        }
        for (int i = 1; i < vendasDoDia.length; i++) {
            if (vendasDoDia[i] < menorVenda) {
                menorVenda = vendasDoDia[i];
            }
            if (vendasDoDia[i] > maiorVenda) {
                maiorVenda = vendasDoDia[i];
            }
            ticketMedio = totalVendas / vendasDoDia.length;
        }
        System.out.println("O total de vendas do dia é: R$ " + totalVendas);
        System.out.println("A compra de menor valor foi R$ " + menorVenda);
        System.out.println("A compra de maior valor foi R$ " + maiorVenda);
        System.out.println(String.format("O ticket medio é de R$ %.2f%n", ticketMedio));
    }

    void ex4() {

        int[] lista = { 3, 5, 6, 7, 8, 10, 22, 55, 110 };

        int contador = 0;

        for (int numero : lista) {
            if (numero % 2 == 0) {
                contador++;
            }
        }

        System.out.println("Quantidade de números pares na lista: " + contador);
    }
}

    

