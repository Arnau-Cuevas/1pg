/*  	Arnau
    	Cuevas Medina
    	INS Manuel Vázquez Montalbán
    	27/10/2022
    	DAW
    	Programació
 */
package implementaciojava.practica1;

import java.util.Scanner;
public class Exercici9 {
    private static final String MSG_1 = "Introdueix números i acabals amb 0: ";
    private static final String MSG_2 = "La mitjana dels números introduïts es: ";

    public static void main(String[] args) {   
        int num, suma = 0, quantitat = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();
        while(num != 0) {
            quantitat = quantitat + 1;
            suma = suma + num;
            num = sc.nextInt();
        }
        System.out.println(MSG_2 + (suma / quantitat));
}
}
