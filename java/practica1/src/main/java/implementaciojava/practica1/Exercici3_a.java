
package implementaciojava.practica1;

import java.util.Scanner;

public class Exercici3_a {
        private static final String MSG_1 = "Introdueix un valor: ";
    private static final String MSG_2 = "El valor es positiu.";
    private static final String MSG_3= "El valor es negatiu.";
    
    public static void main(String[] args) {
           int num;
           Scanner sc = new Scanner (System.in);
           
           System.out.println(MSG_1);
           num = sc.nextInt();
           if (num >=0) {
                System.out.println(MSG_2);
         }
           else {
                System.out.println(MSG_3);
         }
    }
}

