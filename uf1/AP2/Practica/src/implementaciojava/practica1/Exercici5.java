<<<<<<< HEAD:java/practica1/src/main/java/implementaciojava/practica1/Exercici5.java
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
>>>>>>> c707adbb75ca702555839aa2a598b9e40520fe04:java/Nueva carpeta/implementacionesjava/src/implementaciojava/practica1/Exercici5.java
package implementaciojava.practica1;
import java.util.Scanner;

public class Exercici5 {

    private static final String MSG_1 = "Introdueix un any: ";
    private static final String MSG_2 = "És un any de traspàs";
    private static final String MSG_3 = "No és un any de traspàs";

    public static void main(String[] args) {
        int any;
        Scanner sc = new Scanner(System.in);

        System.out.println(MSG_1);
        any = sc.nextInt();
        if ((any % 4 == 0) && ((any % 100 != 0) || (any % 400 == 0))) {
            System.out.println(MSG_2);
        } else {
            System.out.println(MSG_3);
        }
    }
}