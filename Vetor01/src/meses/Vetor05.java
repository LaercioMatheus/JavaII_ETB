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
public class Vetor05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PREENCHE O VETOR AUTOMATICAMENTE COM O MÉTODO 'Array.fill();'
        int v[] = new int[20];
        Arrays.fill(v, 0); //PREENCHER O VETOR 'v' COM OS VALORES '0'
        for (int valor: v) {
            System.out.print(valor + " )( ");
        }
        
        /*
        int n = 80;
        int v[] = {n};
        Arrays.fill(v, n);
        
        for (int valor: v) {
            System.out.print(valor + " )( ");
        }
        */
        
        
    /*    
        int v[] = {2, 0, 3, 9};
        v[v[2]] = v[v[1]];
        for (int i: v) {
            System.out.println(i);
        }*/
    }
    
}
