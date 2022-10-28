/*      Arnau
        Cuevas Medina
        INS Manuel Vázquez Montalbán
        27/10/2022
        DAW
        Programació
 */
package implementaciojava.practica1;

import java.util.Scanner;

public class Exercici6_b {

    private static final String MSG_1 = "Introdueix un mes: ";

    public static void main(String[] args) {
        int any, mes;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        any = sc.nextInt();
        mes = sc.nextInt();
        
        switch (mes){
            case 1:
                System.out.println("El mes té 28 dies");
                break;
            case 2:
                System.out.println("El mes té 29 dies");
                break;
            case 3:
                System.out.println("El mes té 30 dies");
                break;
            case 4:
                System.out.println("El mes té 31 dies");
                break;          
            
        }

    }
}