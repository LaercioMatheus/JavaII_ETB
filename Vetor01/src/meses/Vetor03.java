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
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double v[] = {3.5, 2.75, 9, -4.5};
        Arrays.sort(v); //CLASSE PARA COLOCAR O VETOR EM ORDEM
        
             //DOIS ELEMENTOS
        for (double valor: v) { // FOR IT (UM VETOR PARA CADA ELEMENTO)
            System.out.print(valor + " | ");
        }
    }
    
}