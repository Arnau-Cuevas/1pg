package cat.institumvm;

import java.util.Scanner;

public class Exercici19 {

    private static final String MSG_1 = "Introdueix 20 valors enters";
    private static final String MSG_2 = "Total pars: ";
    private static final String MSG_3 = "Total impars: ";
    private static final int SIZE = 20;

    public static void main(String[] args) {
        int i, a = 0, b = 0, num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);

        for (i = 0; i < SIZE; i++) {
            num = sc.nextInt();

            if (num % 2 == 0) {
                a = a + 1;
            } else {
                b = b + 1;
            }
        }
        System.out.println(MSG_2 + a);
        System.out.println(MSG_3 + b);
    }
}
