    /*  Arnau
        Cuevas Medina
        INS Manuel Vázquez Montalbán
        27/10/2022
        DAW
        Programació
    */
package implementaciojava.practica1;

import java.util.Scanner;

public class Exercici3_h {
        private static final String MSG_1 = "Introdueix un valor: ";
    
    public static void main(String[] args) {
           int num;
           Scanner sc = new Scanner (System.in);
           
           System.out.println(MSG_1);
           num = sc.nextInt();
           if (num % 2 == 0) {
                num = num * num;
                System.out.println(num);
         }
           else {
               num = num * num * num;
                System.out.println(num);
         }
    }
}