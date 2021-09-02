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
public class Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   //AMBOS LOOPS OBTEM O MESMO RESULTADO
        Scanner entrada = new Scanner(System.in);
        int n = 0, somador = 0; //int i = 0;
        
        for (int i = 0; i < 10; i++){
                System.out.println("Digite números: ");
                n = entrada.nextInt();
                somador = somador + n;
        } 
        
/*        while (i < 10){
            System.out.println("Digite números: ");
            n = entrada.nextInt();
            somador = somador + n;
            i++;
        } 
*/        System.out.printf("O valor somado é: %d.", somador);
    }
    
}
