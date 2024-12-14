package projetocrud;

//IMPORTACOES DAS CLASSES
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;


public class ConnectionFactory {
    
    //  AQUI É PASSADO O NOME A SENHA E O ENDERECO
    //FAZENDO A CONECCAO COM O BANCO DE DADOS
    //O VALOR FINAL 'final' PARA A VARIAVEL VAI SER STRING E NOME
    private static final String USERNAME = "root";
    private static final String PASSWORD = ""; //A PASSWORD ESTA SENDO VAZIO COMO NO BANDO DE DADOS
    
    //PESQUISAR A SIGLA DENTRO DAS ASPAS 'jbdc'
    //FAZENDO A CONECCAO COM O BANCO DE DADOS
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda";
    
    public static Connection createConnectionToMySQL() throws Exception {
        
        //QUAL O DRIVE QUE VAI IMPORTAR A CONECCAO
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = (Connection) DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        
        //RETORNANDO A CONECCAO COM O BANCO DE DADOS
        return connection;
        
    }
    
}
