
package cat.institumvm;

import java.util.Scanner;

public class Exercici13 {
    private static final String MSG_1 = "Introdueix 5 valos naturas";
    private static final String MSG_2 = "La mitjana del valor és ";
    
    public static void main(String[] args) {
        int avg = 0, i, num1;
            Scanner sc = new Scanner (System.in);
            
            System.out.println(MSG_1);
            for (i=0;i<5;i++) {
            num1 = sc.nextInt();
            avg= num1 + avg;
            }
            System.out.println(MSG_2 + avg / i);
    }   
}

