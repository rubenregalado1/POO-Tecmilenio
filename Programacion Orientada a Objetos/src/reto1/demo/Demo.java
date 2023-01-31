package reto1.demo;

public class Demo {
    public static void main(String[] args) {
        demoFor();
        demoForArreglos();

    }

    public static void demoFor() {
        for (int i=0;i<10;i++) {
            System.out.println("*");

        }
        System.out.println();
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                System.out.println("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i=0;i<10;i++){
            for (int j=0;j<i+1;j++){
                System.out.println("*");
            }
            System.out.println();
        }

    }
    public static void demoForArreglos(){
        String[] arreglo = {"pato","palabra","acido","desoxirribonucleico","chapala"};

        for (String palabra :arreglo){
            System.out.println(palabra);
        }

        for
    }
}