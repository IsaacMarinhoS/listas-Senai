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
  
    void ex2(){
        Scanner scanner = new Scanner(System.in);
        
        int numero1;
        int numero2;

        System.out.println("digite um numero: ");
        numero1=scanner.nextInt();

        System.out.println("digite um numero: ");
        numero2=scanner.nextInt();

        if(numero1 > numero2){
            System.out.println("numero " +numero1+" é maior que numero " +numero2);
            
        }else{
            System.out.println("numero " +numero2+" é maior que numero " +numero1);
        }
    }

}
