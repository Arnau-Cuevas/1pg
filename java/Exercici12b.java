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
public class Exercici12b {
        private static final String MSG_1 = "Introdueix un nombre enter";
        private static final String MSG_2 = "El doble del nombre es ";
        private static final String MSG_3 = "El triple del nombre es ";
        
     public static void main(String[] args) {
         int num1;
        Scanner sc = new Scanner (System.in);
           System.out.println(MSG_1);
           num1 = sc.nextInt();
           System.out.println(MSG_2 + num1*2);
           System.out.println(MSG_3 + num1*3);                   
     }
}