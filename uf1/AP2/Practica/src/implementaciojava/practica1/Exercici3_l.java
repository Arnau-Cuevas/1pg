<<<<<<< HEAD:java/practica1/src/main/java/implementaciojava/practica1/Exercici3_l.java
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
>>>>>>> c707adbb75ca702555839aa2a598b9e40520fe04:java/Nueva carpeta/implementacionesjava/src/implementaciojava/practica1/Exercici3_l.java
package implementaciojava.practica1;

import java.util.Scanner;

public class Exercici3_l {
    private static final String MSG_1 = "Introdueix nº de litres: ";
    private static final String MSG_2 = "La factura es de: ";
    
    public static void main(String[] args) {
        float num; 
        int fixa = 6;
        double calcul = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println(MSG_1);
        num = sc.nextInt();
        
        if (num < 50) {
            System.out.println(MSG_2 + fixa);
        } 
        else if (num > 50 && num<200) {
            calcul = (num * 0.1) + fixa;
            System.out.println(MSG_2 + calcul);
        }
        else if (num >200) {
            calcul= (num * 0.2) + fixa;
            System.out.println(MSG_2 + calcul);
        }
    }
}