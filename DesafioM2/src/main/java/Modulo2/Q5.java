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
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int[] numeros = new int[10], numerosDigitados = new int[10], numerosFixos = new int[10];
        
        for (int i = 0; i <10; i++){
            System.out.printf("Digite o %dº número: \n", i+1);
            numeros[i] = ent.nextInt();
            //for (i = 0; i <10; i++){
                System.out.printf("%d x %d = %d\n", numerosDigitados[i], numerosFixos[i], numerosDigitados[1]*numerosFixos[2]);
            //}
        }
    }
    
}
