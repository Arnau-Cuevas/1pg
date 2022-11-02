/*  	Arnau
    	Cuevas Medina
    	INS Manuel Vázquez Montalbán
    	27/10/2022
    	DAW
    	Programació
 */
package implementaciojava.practica1;
import java.util.Scanner;

public class Exercici6_b {
    private static final String MSG_1 = "Introdueix un any i un mes: ";

    public static void main(String[] args) {       
        int mes, any, valorCase;    
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        any = sc.nextInt();
        mes = sc.nextInt();
        
        if (mes % 2 == 0){
            if (mes == 2){
                if (any % 4 == 0){
                    valorCase = 2;
                }
                else
                    valorCase = 1;
            }
            else
                valorCase = 3;
        }
        else {
            valorCase = 4;
        }

        switch (valorCase) {       
            case 1:
                System.out.println("28 dies");
                break;
            case 2:
                System.out.println("29 dias");
                break;
            case 3:
                System.out.println("30 dias");
                break;
            case 4:
                System.out.println("31 dias");
                break;
        }
}
}    
