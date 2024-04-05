/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modeloexempmodificadorestatico4;

import java.util.Scanner;

/**
 *
 * @author Laercio Matheus
 */
public class TesteModeloExempModificadorEstatico4 {

    public static void main(String[] args) {

        boolean loop = true;
        Scanner sc = new Scanner(System.in);

        while (loop) {
            System.out.println("----- SISTEMA BANCARIO LIMA -----");
            System.out.println("Informe a opção desejada:");
            System.out.println("[1] - Informações de Pessoa Fisica");
            System.out.println("[2] - Encerrar o Programa");
            int opc = sc.nextInt();

            switch (opc) {
                case 1:

                    Fisica fisic = new Fisica("123.456.7820-56", 7.850, "Laércio Matheus", "(61)9999-8888", 10.000, 5.689,
                            new Endereco("Principal do Varjão", 5,
                                    new Cep("47888-256")),
                            new Conta(12598, 250.00,
                                    new Agencia(10987654, "Iti - Banco Rosa"),
                                    new Transacao("Pagamento", 3.550)),
                            new CartaoCredito(25695369, "31/03/2024", 1.580,
                                    new TransacaoCartao(65893, 16.000)));

                    System.out.println(fisic);
                    break;

                case 2:

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
