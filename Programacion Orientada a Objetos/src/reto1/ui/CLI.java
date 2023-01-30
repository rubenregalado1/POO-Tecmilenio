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
        scanner.nextLine();

        System.out.println("Introduzca el primer valor");

        int operando1 = scanner.nextInt();scanner.nextLine();

        System.out.println("Introduzca su segundo valor");
        int operando2 = scanner.nextInt();scanner.nextLine();
        int resultado=-1;
        String operacion ="";


        switch (option){
            case 1:
                resultado = CALCULADORA.sumarNumeros(operando1,operando2);
                operacion = "+";
                break;
            case 2:
                resultado = CALCULADORA.restarNumeros(operando1,operando2);
                operacion = "-";
                break;
            case 3:
                resultado = CALCULADORA.dividirNumeros(operando1,operando2);
                operacion = "/";
                break;
            case 4:
                resultado = CALCULADORA.multiplicarNumeros(operando1,operando2);
                operacion = "*";
                break;
        }

        System.out.printf("El resultado de la operación %d %s %d = %d",operando1,operacion,operando2,resultado);
    }

}

