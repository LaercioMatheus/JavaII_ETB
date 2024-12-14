/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetodescritivo;

import java.util.Scanner;

/**
 *
 * @author 35936x
 */
public class ProjetoDescritivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ///ESTRUTURA do WHILE e SWIRCH CASE
        boolean loop = true;
        Scanner sc = new Scanner(System.in);

        while (loop) {
            System.out.println("**** SISTEMA DE INDIVÍDUOS ****");
            System.out.println("Informe a opção que se identifica: ");
            System.out.println("[1] - Pessoa Fisica.");
            System.out.println("[2] - Pessoa Jurídica.");
            System.out.println("[3] - Encerrar script...");
            int opc = sc.nextInt();

            switch (opc) {
                case 1:

                    Fisica fisic = new Fisica(55, "123.456.789-56",
                            new Atendente(2586, "Daniel"), "Laércio", 17);
                    System.out.println(fisic);
                    System.out.println("----------------------");
                    break;

                case 2:

                    Juridica juridic = new Juridica(10, "258.657/456",
                            new Atendente(1269, "Rafael"), "Francisco", 44);
                    System.out.println(juridic);
                    break;

                case 3:
                    System.out.println("Encerrar o Script");
                    /*ATRIBULTO PARA O PROGRAMA ENCERRAR*/
                    //TENHO QUE COLOCAR O '0' PARA PARAR
                    System.exit(0);
                    break;

                default:
                    //CASO TENHA UMA OPÇÃO ERRADA
                    System.out.println("Opção INVÁLIDA!!" + "\nESCOLHA UMA OPÇÃO VÁLIDA E TENTE NOVAMENTE");
            }
        }

    }
}
