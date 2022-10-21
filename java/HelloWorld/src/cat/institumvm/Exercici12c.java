/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institumvm;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class Exercici12c {

    private static final String MSG_1 = "Introdueix tres nombres enters";
    private static final String MSG_2 = "La suma dels 2 primers es mes gran que el tercer";
    private static final String MSG_3 = "La suma dels 2 primers no es mes gran que el tercer";

    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        if ((num1 + num2) > num3) {
            System.out.println(MSG_2);
        } else {
            System.out.println(MSG_3);
        }
    }
}
