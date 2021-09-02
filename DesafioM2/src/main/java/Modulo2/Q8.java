package Modulo2;

import java.util.Scanner;
/**
 *
 * @author Rayssa
 */
public class Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[50];
        int contaNros = 0;
        char continuar = 'S';
        
        while (continuar == 'S' || continuar =='s'){
            System.out.printf("Digite o %dº número: \n", contaNros+1);
            numeros[contaNros] = entrada.nextInt();
            contaNros++;
            entrada.nextLine();
            System.out.println("Deseja continuar digitando números (S - Sim. N - Não)?");
            continuar = entrada.nextLine().charAt(0);
        }
        for (int i = 0; i <contaNros; i++){
            if(numeros[i] % 3 == 0)
                System.out.printf("%d\n", numeros[i]);
        }
    }
}
