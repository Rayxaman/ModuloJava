/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Rayssa
 */
public class Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        int[] numeros = new int [50];
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
        try {
            FileWriter arq = new FileWriter("C:\\Users\\Rayssa\\Documents\\Cursos\\Bootcamps\\IGTI Programador de Software Iniciante\\saída3.txt");
            PrintWriter gravarArquivo = new PrintWriter(arq);
            for (int i = 0; i <contaNros; i++){
                if(numeros[i] % 2 == 0 && numeros[i] > 10)  //PARA A QUESTÃO 7 BASTA REMOVER ESSE IF
                    gravarArquivo.printf("%d%n", numeros[i]);
            }
            arq.close();
            gravarArquivo.close();
            System.out.println("Programa Finalizado.");
        }
        catch (IOException e){
            System.err.println("Erro gravando dados: " + e.getMessage());
        }
    }
    
}
