/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2;

import java.util.Scanner;

/**
 *
 * @author Rayssa
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n = 0;
        int[] valores = new int[3];
        
        System.out.println("Digite um valor para n: ");
        n = ent.nextInt();
        
        while (n >= -1){
            if (n >= 0 && n <= 10)
                valores[0] += 1;
            else if (n >= 11 && n <= 20)
                valores[1] += 1;
            else
                valores[2]++;
        }
        System.out.printf("Valores entre 0 e 10: %d. \n" 
                + "Valores entre 11 e 20: %d. \n"
                + "Valores acima de 20: %d. \n", valores[0], valores[1], valores[2]);
    } 
}
