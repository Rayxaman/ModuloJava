package Modulo2;

import java.util.Scanner;

/**
 *
 * @author Rayssa
 */
public class Q12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1 = 0;
        boolean resultado;
        
        System.out.println("Digite um número inteiro..: ");
        n1 = entrada.nextInt();
        
        resultado = (n1 % 2 == 0);
        System.out.printf("%b\n", resultado);
    }
    
}
