package projetocrud;

import com.mysql.jdbc.Connection;
import java.sql.Date;
import static projetocrud.ConnectionFactory.createConnectionToMySQL;

public class Main {

    public static void main(String[] args) throws Exception {

        //TESTA A CONECCAO COM O BANCO DE DADOS
        /*Connection conn = createConnectionToMySQL();

        if (conn != null) {
            System.out.println("Conectado!");

            conn.close();
        }*/
        
        //CRIA REGISTRO NO BANCO DE DADOS
        /*Contato contato = new Contato();
        
        //contato.setId(1);
        contato.setNome("Bernardo");
        contato.setIdade(15);
        contato.setDataCadastro(new Date(System.currentTimeMillis()));*/
        
        ContatoDAO contatoDao = new ContatoDAO();
        //contatoDao.save(contato);

        //listar registro do banco de dados
        for (Contato c : contatoDao.getContatos()) {
            
            System.out.println("TABELA CONTATOS"
                    + " Nome: " + c.getNome()
                    + " ID: " + c.getId()
                    + " Idade: " + c.getIdade()
                    + " Data Cadastro: " + c.getDataCadastro()
            );
            
        }
    }

}
