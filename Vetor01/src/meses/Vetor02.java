/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meses;

/**
 *
 * @author 01
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int dia[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("MESES DO ANO");
        for (int c = 0; c < mes.length; c++) {
        System.out.println("O mês de " + mes[c] + " tem " + dia[c] + " dias ao todo.");
        
            /*if (mes[2] = ) {
                dia[2] = 29;
            }
        */        
        }
    }
    
}
