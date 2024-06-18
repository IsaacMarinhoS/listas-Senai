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
        }else{
            System.out.println("Numero é 0!");

       }
    }
}
