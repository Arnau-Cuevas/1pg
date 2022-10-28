    /*  Arnau
        Cuevas Medina
        INS Manuel Vázquez Montalbán
        27/10/2022
        DAW
        Programació
    */
package implementaciojava.practica1;
import java.util.Scanner;

public class Exercici4_a {

    private static final String MSG_1 = "Introdueix un mes: ";

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();
        if (num == 1) {
            System.out.println("Gener");
        } else if (num == 2) {
            System.out.println("Febrer");
        } else if (num == 3) {
            System.out.println("Març");
        } else if (num == 4) {
            System.out.println("Abril");
        } else if (num == 5) {
            System.out.println("Maig");
        } else if (num == 6) {
            System.out.println("Juny");
        } else if (num == 7) {
            System.out.println("Juliol");
        } else if (num == 8) {
            System.out.println("Agost");
        } else if (num == 9) {
            System.out.println("Septembre");
        } else if (num == 10) {
            System.out.println("Octubre");
        } else if (num == 11) {
            System.out.println("Novembre");
        } else if (num == 12) {
            System.out.println("Desembre");
        } else if (num < 1 || num > 12) {
            System.out.println("Error");
        }
    }
}