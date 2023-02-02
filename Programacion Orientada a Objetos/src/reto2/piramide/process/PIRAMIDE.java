package reto2.piramide.process;

public class PIRAMIDE {
    public static void printPyramid(int numRenglon){

        System.out.println();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (i > 5 && i < 7) {
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
