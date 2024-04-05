
package exemploassociacao;

public class TesteExemploAssociacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //FAZENDO AS INSTANCIAS DA CLASSE VEICULO E DENTRO DELE TEM OUTRAS CLASSES SENDO INSTANCIADAS
        Veiculo verc = new Veiculo ("MAE-1L658", "Preto", 
                new Porta("Esquerdo"), 
                    new Motor(101.0, "Etanol"), 
                        new Roda(20, 5));
        
        /*MOSTRANDO OS DADOS DA ASSOCIACAO NA TELA*/
        System.out.println(verc);
    }
    
}
