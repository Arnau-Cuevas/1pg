/*  	Arnau
    	Cuevas Medina
    	INS Manuel Vázquez Montalbán
    	27/10/2022
    	DAW
    	Programació
 */
package implementaciojava.practica1;

import java.util.Scanner;

public class Exercici3_g {

    private static final String MSG_1 = "Introdueix un valor: ";
    private static final String MSG_2 = "El valor es no senar.";
    private static final String MSG_3 = "El valor es senar.";

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG_1);
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(MSG_2);
        } else {
            System.out.println(MSG_3);
        }
    }
}
