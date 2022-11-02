<<<<<<< HEAD:java/practica1/src/main/java/implementaciojava/practica1/Exercici3_j.java
/*  	Arnau
    	Cuevas Medina
    	INS Manuel Vázquez Montalbán
    	27/10/2022
    	DAW
    	Programació
 */
=======
    /*  Arnau
        Cuevas Medina
        INS Manuel Vázquez Montalbán
        27/10/2022
        DAW
        Programació
    */
>>>>>>> c707adbb75ca702555839aa2a598b9e40520fe04:java/Nueva carpeta/implementacionesjava/src/implementaciojava/practica1/Exercici3_j.java
package implementaciojava.practica1;

import java.util.Scanner;

public class Exercici3_j {

    private static final String MSG_1 = "Introdueix 3 valors: ";
    private static final String MSG_2 = "El número més gran és: ";
    private static final String MSG_3 = "Els números son iguals";

    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG_1);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println(MSG_2 + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(MSG_2 + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(MSG_2 + num3);
        } else {
            System.out.println(MSG_3);
        }
    }
}