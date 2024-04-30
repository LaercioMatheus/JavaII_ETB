package projetocrud;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

//pesquisar o que e DAO
//é manipulacao com banco de dados
public class ContatoDAO {

    /*
    Create - save
    Read
    Update
    Delete*/
    public void save(Contato contato) {
        String sql = "INSERT INTO contatos(nome, idade, dataCadastro) VALUES (?,?,?)";

        Connection connec = null;
        PreparedStatement pstm = null;

        //
        //testa se tem erros
        try {

            //CONSTRUINDO A FORMA DE PEGAR OS DADOS E COLOCAR NO BANCO DE DADOS
            //essa e a coneccao 
            connec = ConnectionFactory.createConnectionToMySQL();

            //o 'PreparedStatement' esta pegando a coneccao para passar as instrucoes
            pstm = (PreparedStatement) connec.prepareStatement(sql);
            pstm.setString(1, contato.getNome()); //vai possibilitar que o valor da variavel e colocar aqui
            pstm.setInt(2, contato.getIdade());
            
            //tenho que criar um objeto dentro da lista para receber a data
            pstm.setDate(3, new Date(contato.getDataCadastro().getTime()));
            
            pstm.execute(); //executar

            System.out.println("Registro cadastrado  com SUCESSO!! :)");

           

            //mostra erros testados
            //todas as exessoes vao entrar messa variavel 'e'
        } catch (Exception e) {
            //funcao nativa e ira mostrar na tela os erros
            //ele é obrigatório
            e.printStackTrace();
        } finally {

            try {

                if (pstm != null) {
                    //TENHO QUE FECHAR A CONECÇÃO '''''SEMPRE'''''
                    connec.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}
