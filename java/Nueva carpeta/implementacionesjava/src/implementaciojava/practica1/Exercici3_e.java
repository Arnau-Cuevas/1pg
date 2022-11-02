<<<<<<< HEAD:java/practica1/src/main/java/implementaciojava/practica1/Exercici3_e.java
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
>>>>>>> c707adbb75ca702555839aa2a598b9e40520fe04:java/Nueva carpeta/implementacionesjava/src/implementaciojava/practica1/Exercici3_e.java
package implementaciojava.practica1;

import java.util.Scanner;

public class Exercici3_e {
        private static final String MSG_1 = "Introdueix un valor: ";
    private static final String MSG_2 = "El valor esta dins de l'interval indicat.";
    private static final String MSG_3= "El valor no esta dins de l'interval indicat.";
    
    public static void main(String[] args) {
           int num;
           Scanner sc = new Scanner (System.in);
           
           System.out.println(MSG_1);
           num = sc.nextInt();
           if (num >=25 && num <=50) {
                System.out.println(MSG_2);
         }
           else {
                System.out.println(MSG_3);
         }
    }
}