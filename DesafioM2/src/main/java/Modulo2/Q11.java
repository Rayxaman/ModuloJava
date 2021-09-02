/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Rayssa
 */
public class Q11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int[] valores = new int[1000], repeticoes = new int[1000];
        int limiteSuperior = 100;

        Random random = new Random();
        for (int i = 0; i < 1000; i++){ 
                valores[i] = random.nextInt(limiteSuperior);
        }
        
        for (int i = 0; i < 1000; i++){
            repeticoes[valores[i]]++;
        }
        for (int i = 1; i < 100; i++)
         System.out.printf("O número %d se repete %d vezes. \n", i, repeticoes[i]);
    }
    
}
