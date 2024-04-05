/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3d_laercio_a1.pkg2;

import java.util.Scanner;

/**
 *
 * @author Laercio Matheus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean loop = true;
        Scanner sc = new Scanner(System.in);

        while (loop) {
            System.out.println("----- SISTEMA DE PROTEÇÃO PARA VEÍCULOS -----");
            System.out.println("Informe uma opção:");
            System.out.println("[1] - Veículo de passeio");
            System.out.println("[2] - Ônibus");
            System.out.println("[3] - Moto");
            System.out.println("[4] - Encerrar o Programa");
            int opc = sc.nextInt();

            switch (opc) {
                case 1:

                    DePasseio passeio = new DePasseio("Fiat", "Veículo de sete lugares",
                            new Montadora("236.985/874", "FIAT",
                                    new Endereco("Pricipal", 96)), "FOI-5D842", 2019, "Vermelho vinho", 98.500);
                    System.out.println(passeio);
                    break;

                case 2:

                    Onibus bus = new Onibus(74,
                            new Montadora("569.842/723", "Mercedes",
                                    new Endereco("Avenida Brasil", 56)), "MER-2T698", 2010, "Prata", 146.855);
                    System.out.println(bus);
                    break;

                case 3:

                    Moto moto = new Moto(156, "UIA-6D87", 2013, "Preto e Azul", 33.500);
                    System.out.println(moto);
                    break;

                case 4:
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
