package implementaciojava.practica1;

import java.util.Scanner;

public class Exercici4 {

    private static final String MSG_1 = "Introdueix un mes: ";

    public static void main(String[] args) {
        int num1;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextInt();
        if (num1 == 1) {
            System.out.println("Gener");
        } else if (num1 == 2) {
            System.out.println("Febrer");
        } else if (num1 == 3) {
            System.out.println("Març");
        } else if (num1 == 4) {
            System.out.println("Abril");
        } else if (num1 == 5) {
            System.out.println("Maig");
        } else if (num1 == 6) {
            System.out.println("Juny");
        } else if (num1 == 7) {
            System.out.println("Juliol");
        } else if (num1 == 8) {
            System.out.println("Agost");
        } else if (num1 == 9) {
            System.out.println("Septembre");
        } else if (num1 == 10) {
            System.out.println("Octubre");
        } else if (num1 == 11) {
            System.out.println("Novembre");
        } else if (num1 == 12) {
            System.out.println("Desembre");
        } else if (num1 < 1 || num1 > 12) {
            System.out.println("Error");
        }
    }
}
