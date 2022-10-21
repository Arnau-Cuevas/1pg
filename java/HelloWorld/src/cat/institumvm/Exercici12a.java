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
public class Exercici12a {
        private static final String MSG_1 = "Introdueix la base del triangle  ";
        private static final String MSG_2 = "Introdueix l'altura del triangle ";
        private static final String MSG_3 = "L'àrea del triangle es ";

     public static void main(String[] args) {
         int area = 0, base, height;
        Scanner sc = new Scanner (System.in);
        
        System.out.println(MSG_1);
        base = sc.nextInt();
        
        System.out.println(MSG_2);
        height = sc.nextInt();
        
        area = (base * height /2);
         System.out.println(MSG_3 + area);
     }
}