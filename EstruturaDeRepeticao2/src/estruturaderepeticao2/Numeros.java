/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturaderepeticao2;

import java.util.Scanner;

/**
 *
 * @author 01
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("DIGITE UM NÚMERO: ");
            n = teclado.nextInt();
            s += n;
            System.out.print("Quer continuar? [SIM] ou [NÃO]");
            resp = teclado.next();
        } while (resp.equals("Sim"));
        System.out.println("A soma de todos os valores é " + s);
    }
    
}
