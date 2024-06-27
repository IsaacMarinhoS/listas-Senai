package com.poo.introducao;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Trabalhosenai {

    void senai2() {

        ArrayList<String> listaDeCompras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nLista de Compras - Menu");
            System.out.println("1. Adicionar item");
            System.out.println("2. Remover item");
            System.out.println("3. Atualizar item");
            System.out.println("4. Exibir itens");
            System.out.println("5. Verificar se um item está na lista");
            System.out.println("6. Ver número de itens na lista");
            System.out.println("7. Ordenar itens");
            System.out.println("8. Limpar lista");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o item a ser adicionado: ");
                    String itemAdicionar = scanner.nextLine();
                    listaDeCompras.add(itemAdicionar);
                    System.out.println(itemAdicionar + " adicionado à lista.");
                    break;
                case 2:
                    System.out.print("Digite o item a ser removido: ");
                    String itemRemover = scanner.nextLine();
                    if (listaDeCompras.remove(itemRemover)) {
                        System.out.println(itemRemover + " removido da lista.");
                    } else {
                        System.out.println(itemRemover + " não encontrado na lista.");
                    }
                    break;
                case 3:
                    System.out.print(
                            "Digite a posição do item a ser atualizado (0 a " + (listaDeCompras.size() - 1) + "): ");
                    int posicao = scanner.nextInt();
                    scanner.nextLine();
                    if (posicao >= 0 && posicao < listaDeCompras.size()) {
                        System.out.print("Digite o novo valor do item: ");
                        String novoValor = scanner.nextLine();
                        listaDeCompras.set(posicao, novoValor);
                        System.out.println("Item na posição " + posicao + " atualizado para " + novoValor + ".");
                    } else {
                        System.out.println("Posição inválida.");
                    }
                    break;
                case 4:
                    System.out.println("Itens na lista de compras:");
                    for (String item : listaDeCompras) {
                        System.out.println(item);
                    }
                    break;
                case 5:
                    System.out.print("Digite o item a ser verificado: ");
                    String itemVerificar = scanner.nextLine();
                    if (listaDeCompras.contains(itemVerificar)) {
                        System.out.println(itemVerificar + " está na lista.");
                    } else {
                        System.out.println(itemVerificar + " não está na lista.");
                    }
                    break;
                case 6:
                    System.out.println("Número de itens na lista: " + listaDeCompras.size());
                    break;
                case 7:
                    Collections.sort(listaDeCompras);
                    System.out.println("Lista de compras ordenada.");
                    break;
                case 8:
                    listaDeCompras.clear();
                    System.out.println("Lista de compras limpa.");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }
}
