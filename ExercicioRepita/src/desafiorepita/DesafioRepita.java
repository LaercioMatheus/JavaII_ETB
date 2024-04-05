/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiorepita;

import javax.swing.JOptionPane;


/**
 *
 * @author 01
 */
public class DesafioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
// VARIÁVEIS
        int n; //NÚMERO INFORMADO
        int soma = 0; //SOMA DOS NÚMEROS
        int tot = 0; //TOTAL DE NÚMEROS
        int totPar = 0; //TOTAL DE NÚMEROS PARES
        int totImpar = 0; //TOTAL DE NÚMEROS ÍMPARES
        int nCem = 0; //TOTAL DE NÚMEROS ACIMA DE 100
        int md = 0; //MÉDIA DOS NÚMEROS
        
        do /*FAÇA*/ {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um numero:"
                    + "<br><strong> (Valor 0 Enterrompe!)</strong></html>"));
            soma += n;
            if (n != 0) {
                tot++;
            //}
            if (n >= 100) {
                nCem++;
            }
            if (n % 2 == 0) {
                totPar++;
            } else {
                totImpar++;
            }
            }
        } while (n != 0); //ENQUANTO
            md = soma/tot;
            JOptionPane.showMessageDialog(null,
                    "<html>Resultado final: <hr>"+
                    "<br>Quantidade de Números: " + tot +
                    "<br>Quantidade de Pares: " + totPar +
                    "<br>Quantidade de Ímpares: "+ totImpar +
                    "<br>Acima de 100: " + nCem +
                    "<br>Média dos número: " + md +
                    "<br>Somatório vale " + soma + "<br><hr></html>", "RESULTADO", JOptionPane.WARNING_MESSAGE);
    }
    
}
