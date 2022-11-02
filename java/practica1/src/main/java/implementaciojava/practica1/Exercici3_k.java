/*  	Arnau
    	Cuevas Medina
    	INS Manuel Vázquez Montalbán
    	27/10/2022
    	DAW
    	Programació
 */
package implementaciojava.practica1;
import java.util.Scanner;

public class Exercici3_k {

    private static final String MSG_1 = "Introdueix un valor";
    private static final String MSG_2 = "El valor introduït es multiple";
    private static final String MSG_3 = "El valor introduït no es multiple";

    public static void main(String[] args) {
        int num1, num2;

        System.out.println(MSG_1);
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 % num2 == 0) {
            System.out.println(MSG_2);
        } else {
            System.out.println(MSG_3);
        }
    }
}
