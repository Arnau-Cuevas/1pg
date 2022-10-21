/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institumvm;

import java.util.Scanner;

 //Pre: Rep un valor per teclat
public class Exercici8{
    private static final String MSG_1 = "Introdueix un valor";
    private static final String MSG_2 = "El valor es natural";
    private static final String MSG_3= "El valor no es natural";
    
    public static void main(String[] args) {
           int num1;
           Scanner sc = new Scanner (System.in);
           
           System.out.println(MSG_1);
           num1 = sc.nextInt();
           if (num1 >=1) {
                System.out.println(MSG_2);
         }
           else {
                System.out.println(MSG_3);
         }
    }
}
 //Pro: Retorna si el valor es natural o no
