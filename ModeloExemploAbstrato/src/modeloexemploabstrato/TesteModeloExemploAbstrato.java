/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modeloexemploabstrato;

import java.util.Scanner;

/**
 *
 * @author Laercio Matheus
 */
public class TesteModeloExemploAbstrato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean loop = true;
        Scanner sc = new Scanner(System.in);

        while (loop) {
            System.out.println("----- SISTEMA DE INFORMAÇÕES DO INDIVÍDUO -----");
            System.out.println("Informe uma opção:");
            System.out.println("[1] - Informações do Professor");
            System.out.println("[2] - Informações do Empregado");
            System.out.println("[3] - Encerrar o Programa");
            int opc = sc.nextInt();

            switch (opc) {
                case 1:
                    Professor prof = new Professor("15384.9", "Matemática", "Henrique Gomes", 2.500, 7.000,
                            new Filiacao("Francisco Arcanjo", "Cristiane Rodrigues"));
                    System.out.println(prof);
                    break;

                case 2:
                    Empregado empreg = new Empregado("5874z", "Manutenção", "Daniel Silva", 870.00, 2.500,
                            new Filiacao("João do Nascimento", "Dona Lurdes"));

                    System.out.println(empreg);
                    break;

                case 3:
                    System.out.println("Encerrar o Script");
                    /*ATRIBULTO PARA O PROGRAMA ENCERRAR*/
                    //TENHO QUE COLOCAR O '0' PARA PARAR
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção INVÁLIDA!!" + "\nESCOLHA UMA OPÇÃO VÁLIDA E TENTE NOVAMENTE");
            }
        }
    }
}
