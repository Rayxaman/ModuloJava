package Modulo2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Rayssa
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        int n = 0, contador = 0;
        System.out.println("Digite o valor de n: ");
        n = ent.nextInt();
        
        for(int i = n; i > 0; i--){
            System.out.printf("Valor de i: %d. \n", i);
            if (i % 3 == 0)
                contador = contador + 1;
        }
        System.out.printf("Valor da variável contador: %d.", contador);
    }
    
}
