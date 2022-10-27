package implementaciojava.practica1;

import java.util.Scanner;

public class Exercici3_f {
        private static final String MSG_1 = "Introdueix dos valors: ";
    private static final String MSG_2 = "";
    private static final String MSG_3= "";
    
    public static void main(String[] args) {
           int num1, num2;
           
           System.out.println(MSG_1);
           Scanner sc = new Scanner (System.in);
           num1 = sc.nextInt();
           num2 = sc.nextInt();
           if (num1 % num2 = <15) {
                System.out.println(MSG_2);
           } else {
                System.out.println(MSG_3);
         }
    }
}