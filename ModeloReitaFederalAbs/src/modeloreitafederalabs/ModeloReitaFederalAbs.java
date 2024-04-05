/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloreitafederalabs;

import java.util.Scanner;

/**
 *
 * @author 35936x
 */
public class ModeloReitaFederalAbs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean loop = true;
        Scanner sc = new Scanner(System.in);

        while (loop) {
            System.out.println("----- SISTEMA DE INFORMAÇÕES DA RECEITA FEDERAL -----");
            System.out.println("Informe a opção desejada:");
            System.out.println("[1] - Informações de Pessoa Fisica");
            System.out.println("[2] - Informações de Pessoa Juridica");
            System.out.println("[3] - Informações do Atendente");
            System.out.println("[4] - Informações do Auditor");
            System.out.println("[5] - Encerrar o Programa");
            int opc = sc.nextInt();

            switch (opc) {
                case 1:
                    Fisica fisic = new Fisica("145.368.972-65",
                            new ParaPessoaFisica(250.0,
                                    new Dependente(5876, "Matheus Silva", 17), 89, 2023, 3.698,
                                    new Pagamento(5863, "Foi efetuado dentro do praso", 236.81),
                                    new Bens(87964, "Todos os bens", 65.980),
                                    new Deducao(597846, "Parte dos bens", 25.650)), "Luccas da Cruz",
                            new Endereco("Ponte Nova Principal", 58));

                    System.out.println(fisic);
                    break;

                case 2:
                    Juridica juridc = new Juridica("256.567/546",
                            new ParaPessoaJuridica("Todo ano é ano de declaracao", 40, 2022, 3.500,
                                    new Pagamento(23, "Tem que abaixar esse preco!!", 5.000),
                                    new Bens(5445, "Grande parte dos bens", 44.896),
                                    new Deducao(2365, "Todos pode ser deduzido", 100.000)), "Gustavo Gomes",
                            new Endereco("W3 Norte", 709));

                    System.out.println(juridc);
                    break;

                case 3:
                    Atendente atendent = new Atendente("Técnico",
                            new Fisica("369.842.981-70",
                                    new ParaPessoaFisica(800.00,
                                            new Dependente(5406, "Elias Santos", 49), 12, 2020, 2.500,
                                            new Pagamento(02, "Pagamento completo", 18.369),
                                            new Bens(9887, "Um terço dos bens", 14.806),
                                            new Deducao(27895, "Nem todos podem ser deduzidos", 70.00)), "Vitor Henrique",
                                    new Endereco("Asa Sul", 102)), 6749, "Yvan Francisco", 15.500,
                            new Endereco("Taguatinga Norte", 700));

                    System.out.println(atendent);
                    break;

                case 4:
                    Auditor audit = new Auditor(700.00,
                            new Auditoria(38, "04/07/2023"), 92843, "Andre Rodrigues", 10.000,
                            new Endereco("Aguas Claras", 5));

                    System.out.println(audit);
                    break;

                case 5:

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
