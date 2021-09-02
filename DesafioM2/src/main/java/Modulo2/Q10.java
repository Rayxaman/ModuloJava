/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2;

/**
 *
 * @author Rayssa
 */
public class Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0;
        
        for (int i = 1; i <= 100; i++){
            contador = 0;
            for (int j = i; j >0; j--){
                if(i % j == 0)
                    contador++;
            }
            if(contador == 2)   
                System.out.printf("%d\n", i);
        } 
    }
    
}
