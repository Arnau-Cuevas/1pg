
package cat.institumvm;

import java.util.Scanner;

public class Exercici14 {
    private final static int MAX= 10;
    private final static int MIN= 0;
    private static final String MSG_1 = "Introdueix un valor";
    private static final String MSG_2 = "Valor correcte";
    
    public static void main(String[] args) {
        int num1 = 0;
    Scanner sc = new Scanner (System.in);
        do {
    System.out.println(MSG_1);
    num1 = sc.nextInt();
        } while (num1 > MAX || num1 < MIN);
    System.out.println(MSG_2 +" " + num1);
    }
    
}