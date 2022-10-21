/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institumvm;

import java.util.Scanner;

 //Pre: Rep un nombre per teclat
public class Exercici9{
    private static final String MSG_1 = "Introdueix un valor";
    private static final String MSG_2 = "El valor esta entre 5 / 50";
    private static final String MSG_3 = "El valor no esta entre 5 / 50";
        
    
    public static void main(String[] args) {
           int num1;
           Scanner sc = new Scanner (System.in);
           
           System.out.println(MSG_1);
           num1 = sc.nextInt();
           if (num1 >= 5 && num1 <= 50) {
                System.out.println(MSG_2);
         }
           else {
                System.out.println(MSG_3);
         }
    }
}
 //Post: Retorna si el nombre esta ente l'interval de 5-50