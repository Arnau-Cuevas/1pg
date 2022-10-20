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
public class Exercici14 {
    private static final String MSG_1 = "Introdueix un valor";
    private static final String MSG_2 = "Valor correcte";
    private static final String MSG_3 = "Error, introdueix el valor entre 0 i 10";
    
    public static void main(String[] args) {
        int num1, num2, num3, num4, num5;
    Scanner sc = new Scanner (System.in);
        System.out.println(MSG_1);
    num1 = sc.nextInt();
    if (num1 >=0 && num1 <=10){
        System.out.println(MSG_2);
     }
    else {
        System.out.println(MSG_3);
    }
    }
}
