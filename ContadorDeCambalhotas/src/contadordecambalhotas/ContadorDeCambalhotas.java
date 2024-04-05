/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadordecambalhotas;

/**
 *
 * @author 01
 */
public class ContadorDeCambalhotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        //CONDIÇÃO ENQUANTO DIRETO!!!!!
        int cc = 0;
        while (cc < 20) { // 'cc+1' => Coloca a variável para começar contar do '1'
            System.out.println("Cambalhota ;) " + (cc+1));
            cc ++;
        }
        */
        
        /*
        //CONDIÇÃO ENQUANTO COM RESTRIÇÕES DO 'CONTINUE'
        int cc = 0;
        while (cc < 10) {
            cc ++;
            if (cc == 5 || cc == 7 || cc == 9) {
                continue; //AQUI VAI PULAR A CONDIÇÃO DENTRO DO LAÇO
            }
            System.out.println("Cambalhota!!" + cc);
        }
        */
        
        //CONDIÇÃO ENQUANTO COM RESTRIÇÕES DO 'BREAK'
        int cc = 0;
        while (cc < 10) {
            cc ++;
            if (cc == 2 || cc == 3 || cc == 4) {
                continue;
            }
            if (cc == 7) {
                break; //AQUI VAI SAIR DO LAÇO DE REPETOÇÃO
            }
            System.out.println("Cambalhota!!" + cc);
        }
    }
    
}
