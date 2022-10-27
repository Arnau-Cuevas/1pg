package implementaciojava.practica1;

import java.util.Scanner;

public class Exercici3_c {
        private static final String MSG_1 = "Introdueix un valor: ";
    private static final String MSG_2 = "El valor esta dins de l'interval indicat.";
    private static final String MSG_3= "El valor no esta dins de l'interval indicat.";
    
    public static void main(String[] args) {
           int num;
           Scanner sc = new Scanner (System.in);
           
           System.out.println(MSG_1);
           num = sc.nextInt();
           if (num >=0 && num <=100) {
                System.out.println(MSG_2);
         }
           else {
                System.out.println(MSG_3);
         }
    }
}