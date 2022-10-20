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
public class Exercici13 {
    private static final String MSG_1 = "Introdueix 5 valos naturas";
    private static final String MSG_2 = "La mitjana del valor és ";
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int avg = 0, i, num1;
            Scanner sc = new Scanner (System.in);
            
            System.out.println(MSG_1);
            for (i=0;i<5;i++) {
            num1 = sc.nextInt();
            avg= num1 + avg;
            }
            System.out.println(MSG_2 + avg / i);
    }
    
    
}

