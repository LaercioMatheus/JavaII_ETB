/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meses;

import java.util.Arrays;

/**
 *
 * @author 01
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[] = {3, 7, 3, 1, 4, 5, 9};
        for (int v: vet) {
            System.out.print(v + " ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet, 5); //QUANDO O RESULTADO FICA NEGATIVO É PORQUE O VALOR NÃO EXISTE
        System.out.println("Encontrei o valor na posição: " + p); /*FICA NA POSIÇÃO ACIMA DA QUE É REALMENTE PORQUE O 
        VETOR COMEÇA SEMPRE NA POSIÇÃO '0' COM ZERO.*/
    }
    
}
