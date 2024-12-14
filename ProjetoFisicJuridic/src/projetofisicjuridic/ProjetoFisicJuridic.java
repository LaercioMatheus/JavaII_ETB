/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofisicjuridic;

import java.util.Scanner;

/**
 *
 * @author 35936x
 */
public class ProjetoFisicJuridic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean loop = true;
        Scanner sc = new Scanner(System.in);

        while (loop) {
            /*MENU PARA INTERACAO COM O CODIGO*/
            System.out.println("\n----- SISTEMA DE INFORMAÇÕES -----");
            System.out.println("Informe uma opção:");
            System.out.println("[1] - Física");
            System.out.println("[2] - Jurídica");
            System.out.println("[3] - Encerrar o Programa");
            int opc = sc.nextInt();

            switch (opc) {
                case 1:
                    Fisica fisic = new Fisica("350.890.460-78",
                            new Atendente("Marcos Santos", 35986), "Laércio Matheus", 17);
                    System.out.println(fisic);
                    break;

                case 2:
                    Juridica juridic = new Juridica("256.987/035",
                            new Atendente("Marcos Santos", 35986), "Silvia Gomes", 32);
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
