/*  Arnau
        Cuevas Medina
        INS Manuel Vázquez Montalbán
        27/10/2022
        DAW
        Programació
 */
package implementaciojava.practica1;

import java.util.Scanner;

public class Exercici6_a {

    private static final String MSG_1 = "Introdueix un any i un mes: ";
    private static final String MSG_2 = "El més té 28 dies.";
    private static final String MSG_3 = "El més té 29 dies.";
    private static final String MSG_4 = "El més té 30 dies.";
    private static final String MSG_5 = "El més té 31 dies.";

    public static void main(String[] args) {
        int any, mes;
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG_1);
        any = sc.nextInt();
        mes = sc.nextInt();
        if (mes % 2 == 0) {
            if (mes == 2) {
                if (any % 4 == 0) {
                    System.out.println(MSG_2);
                } 
                else 
                    System.out.println(MSG_3);
            } 
            else 
                System.out.println(MSG_4);
        } 
        else 
            System.out.println(MSG_5);
    }
}

