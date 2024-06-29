package com.poo.introducao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

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

        System.out.println("Total de números pares na lista: " + contador);
    }

    void ex5() {

        ArrayList<String> listaDeCompras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("Menu:");
            System.out.println("1. Inserir item");
            System.out.println("2. Ver lista");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do item: ");
                    String item = scanner.nextLine();
                    listaDeCompras.add(item);
                    System.out.println("Item adicionado!\n");
                    break;
                case 2:
                    System.out.println("Lista de Compras:");
                    for (int i = 0; i < listaDeCompras.size(); i++) {
                        System.out.println((i + 1) + ". " + listaDeCompras.get(i));
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.\n");
            }
        } while (opcao != 3);
    }

    void ex6() {

        ArrayList<String> listaDeCompras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("1. Inserir item");
            System.out.println("2. Ver a lista");
            System.out.println("3. Remover item");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o item que deseja incluir: ");
                    String item = scanner.nextLine();
                    listaDeCompras.add(item);
                    System.out.println("Item adicionado!\n");
                    break;
                case 2:
                    System.out.println("Lista de Compras:");
                    for (int i = 0; i < listaDeCompras.size(); i++) {
                        System.out.println((i + 1) + ". " + listaDeCompras.get(i));
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Lista de Compras:");
                    for (int i = 0; i < listaDeCompras.size(); i++) {
                        System.out.println((i + 1) + ". " + listaDeCompras.get(i));
                    }
                    System.out.print("Digite o número que quer remover: ");
                    int numeroItem = scanner.nextInt();
                    if (numeroItem > 0 && numeroItem <= listaDeCompras.size()) {
                        listaDeCompras.remove(numeroItem - 1);
                        System.out.println("Item removido!\n");
                    } else {
                        System.out.println("Número inválido!\n");
                    }
                    break;

                default:
                    System.out.println("Opção não encontrada.\n");
            }
        } while (opcao != 4);

    }

    void ex7() {

        ArrayList<String> listaDeCompras = new ArrayList<>();
        ArrayList<Double> listaDePrecos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("1. Inserir item");
            System.out.println("2. Ver lista");
            System.out.println("3. Remover item");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do item: ");
                    String item = scanner.nextLine();
                    System.out.print("Digite o preço do item: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();
                    listaDeCompras.add(item);
                    listaDePrecos.add(preco);
                    System.out.println("Item e preço adicionados!\n");
                    break;
                case 2:
                    System.out.println("Lista de Compras:");
                    for (int i = 0; i < listaDeCompras.size(); i++) {
                        System.out.printf("%d. %s - R$ %.2f%n", (i + 1), listaDeCompras.get(i), listaDePrecos.get(i));
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Lista de Compras:");
                    for (int i = 0; i < listaDeCompras.size(); i++) {
                        System.out.printf("%d. %s - R$ %.2f%n", (i + 1), listaDeCompras.get(i), listaDePrecos.get(i));
                    }
                    System.out.print("Digite o número do item a ser removido: ");
                    int numeroItem = scanner.nextInt();
                    if (numeroItem > 0 && numeroItem <= listaDeCompras.size()) {
                        listaDeCompras.remove(numeroItem - 1);
                        listaDePrecos.remove(numeroItem - 1);
                        System.out.println("Item removido!\n");
                    } else {
                        System.out.println("Número inválido!\n");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.\n");
            }
        } while (opcao != 4);

    }

    void ex8(){
        ArrayList<String> listaDeCompras = new ArrayList<>();
        ArrayList<Double> listaDePrecos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("1. Inserir item");
            System.out.println("2. Ver lista");
            System.out.println("3. Remover item");
            System.out.println("4. Ordenar em ordem crescente");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do item: ");
                    String item = scanner.nextLine();
                    System.out.print("Digite o preço do item: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();
                    listaDeCompras.add(item);
                    listaDePrecos.add(preco);
                    System.out.println("Item e preço adicionados!\n");
                    break;
                case 2:
                    System.out.println("Lista de Compras:");
                    for (int i = 0; i < listaDeCompras.size(); i++) {
                        System.out.printf("%d. %s - R$ %.2f%n", (i + 1), listaDeCompras.get(i), listaDePrecos.get(i));
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Lista de Compras:");
                    for (int i = 0; i < listaDeCompras.size(); i++) {
                        System.out.printf("%d. %s - R$ %.2f%n", (i + 1), listaDeCompras.get(i), listaDePrecos.get(i));
                    }
                    System.out.print("Digite o número do item a ser removido: ");
                    int numeroItem = scanner.nextInt();
                    if (numeroItem > 0 && numeroItem <= listaDeCompras.size()) {
                        listaDeCompras.remove(numeroItem - 1);
                        listaDePrecos.remove(numeroItem - 1);
                        System.out.println("Item removido!\n");
                    } else {
                        System.out.println("Número inválido!\n");
                    }
                    break;
                    case 4:
                    if (listaDeCompras.size() > 1) {
                        // Implementação da ordenação por seleção
                        for (int i = 0; i < listaDePrecos.size() - 1; i++) {
                            int minIndex = i;
                            for (int j = i + 1; j < listaDePrecos.size(); j++) {
                                if (listaDePrecos.get(j) < listaDePrecos.get(minIndex)) {
                                    minIndex = j;
                                }
                            }
                            // Troca os elementos de posição
                            Collections.swap(listaDePrecos, i, minIndex);
                            Collections.swap(listaDeCompras, i, minIndex);
                        }
                        System.out.println("Lista de Compras ordenada por preço crescente:");
                        for (int i = 0; i < listaDeCompras.size(); i++) {
                            System.out.printf("%d. %s - R$ %.2f%n", (i + 1), listaDeCompras.get(i), listaDePrecos.get(i));
                        }
                    } else {
                        System.out.println("Não há itens suficientes para ordenar.\n");
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.\n");
            }

        }while (opcao != 5);
    }
}
