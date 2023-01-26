package reto1.ui;

import reto1.process.CALCULADORA;

import java.util.Scanner;

public class CLI {
    public static void mostrarMenu(){
        System.out.println("Elija una opción");
        System.out.println("Presione '1' para suma");
        System.out.println("Presione '2' para resta");
        System.out.println("Presione '3' para division");
        System.out.println("Presione '4' para multiplicacion");

        Scanner scanner = new Scanner(System.in);

        int option = scanner.nextInt();
        int option = scanner.nextLine();

        int operando1 = scanner.nextInt();scanner.nextLine();
        int operando2 = scanner.nextInt();scanner.nextLine();
        int resultado;


        switch (option){
            case 1:
                CALCULADORA.sumarNumeros(operando1,operando2);
                break;
        }

        System.out.println("El resultado de la operación es");
    }

}

