<<<<<<< HEAD:java/practica1/src/main/java/implementaciojava/practica1/Exercici3_f.java
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
>>>>>>> c707adbb75ca702555839aa2a598b9e40520fe04:java/Nueva carpeta/implementacionesjava/src/implementaciojava/practica1/Exercici3_f.java
package implementaciojava.practica1;

import java.util.Scanner;

public class Exercici3_f {
     private static final String MSG_1 = "Introdueix un número: ";
    
    public static void main(String[] args) {
<<<<<<< HEAD:java/practica1/src/main/java/implementaciojava/practica1/Exercici3_f.java
        float num1, num2;        
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();
            if(num1 / num2 > 15){
                System.out.println("El número es més gran que 15");
            }
            else {
                System.out.println("El número es menor que 15");
            }           
  }
}    
=======
           int num1, num2;
           
           System.out.println(MSG_1);
           Scanner sc = new Scanner (System.in);
           num1 = sc.nextInt();
           num2 = sc.nextInt();
           if (num1 % num2  <15) {
                System.out.println(MSG_2);
           } else {
                System.out.println(MSG_3);
         }
    }
}
>>>>>>> c707adbb75ca702555839aa2a598b9e40520fe04:java/Nueva carpeta/implementacionesjava/src/implementaciojava/practica1/Exercici3_f.java
