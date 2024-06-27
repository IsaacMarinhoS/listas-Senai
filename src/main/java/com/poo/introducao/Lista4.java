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

    void ex8() {

        class Item {
            String nome;
            double preco;

            Item(String nome, double preco) {
                this.nome = nome;
                this.preco = preco;
            }

            ArrayList<Item> listaDeCompras = new ArrayList<>();

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                while (true) {
                    mostrarMenu();
                    int opcao = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha

                    switch (opcao) {
                        case 1:
                            adicionarItem(scanner);
                            break;
                        case 2:
                            verLista();
                            break;
                        case 3:
                            removerItem(scanner);
                            break;
                        case 4:
                            verListaOrdenada();
                            break;
                        case 5:
                            System.out.println("Saindo...");
                            scanner.close();
                            return;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                    }
                }
            }

            void mostrarMenu() {
                System.out.println("\nMenu:");
                System.out.println("1. Adicionar item");
                System.out.println("2. Ver lista de compras");
                System.out.println("3. Remover item");
                System.out.println("4. Ver lista ordenada por preço (crescente)");
                System.out.println("5. Sair");
                System.out.print("Escolha uma opção: ");
            }

            void adicionarItem(Scanner scanner) {
                System.out.print("Digite o nome do item: ");
                String nome = scanner.nextLine();
                System.out.print("Digite o preço do item: ");
                double preco = scanner.nextDouble();
                scanner.nextLine(); // Consumir a nova linha

                listaDeCompras.add(new Item(nome, preco));
                System.out.println("Item '" + nome + "' adicionado com sucesso!");
            }

            void verLista() {
                if (listaDeCompras.isEmpty()) {
                    System.out.println("A lista de compras está vazia.");
                } else {
                    for (int i = 0; i < listaDeCompras.size(); i++) {
                        Item item = listaDeCompras.get(i);
                        System.out.printf("%d. %s - R$ %.2f%n", i + 1, item.nome, item.preco);
                    }
                }
            }

            void removerItem(Scanner scanner) {
                verLista();
                if (listaDeCompras.isEmpty()) {
                    return;
                }
                System.out.print("Digite o número do item a ser removido: ");
                try {
                    int itemNum = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha
                    if (itemNum > 0 && itemNum <= listaDeCompras.size()) {
                        Item removido = listaDeCompras.remove(itemNum - 1);
                        System.out.println("Item '" + removido.nome + "' removido com sucesso!");
                    } else {
                        System.out.println("Número inválido.");
                    }
                } catch (Exception e) {
                    System.out.println("Entrada inválida. Por favor, digite um número.");
                    scanner.nextLine(); // Limpar entrada inválida
                }
            }

            void verListaOrdenada() {
                if (listaDeCompras.isEmpty()) {
                    System.out.println("A lista de compras está vazia.");
                } else {
                    ArrayList<Item> listaOrdenada = new ArrayList<>(listaDeCompras);
                    Collections.sort(listaOrdenada, Comparator.comparingDouble(item -> item.preco));
                    for (int i = 0; i < listaOrdenada.size(); i++) {
                        Item item = listaOrdenada.get(i);
                        System.out.printf("%d. %s - R$ %.2f%n", i + 1, item.nome, item.preco);
                    }
                }
            }
        }

    }
}
