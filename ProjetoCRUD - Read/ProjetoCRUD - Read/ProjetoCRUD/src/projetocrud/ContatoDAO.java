package projetocrud;

import com.mysql.jdbc.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List; //importou a classe de utilitarios do java
import java.util.concurrent.ExecutionException;

public class ContatoDAO {

    /*
    Create - save
    Read - list
    Update
    Delete
     */
    public void save(Contato contato) {

        String sql = "INSERT INTO contatos(nome, idade, dataCadastro) VALUES (?,?,?)";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {

            conn = ConnectionFactory.createConnectionToMySQL();

            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, contato.getNome());
            pstm.setInt(2, contato.getIdade());
            pstm.setDate(3, new Date(contato.getDataCadastro().getTime()));
            pstm.execute();

            System.out.println("Registro cadastrado com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (pstm != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    //pegar ...
    public List<Contato> getContatos() throws SQLException {

        //o java vai fazer a consulta no banco por meio da ling SQL que esta abaixo
        String sql = "SELECT * FROM contatos";

        //vai pegar tudo o que estiver no banco e transformar em uma matriz
        List<Contato> contatos = new ArrayList<>();

        Connection con = null;
        PreparedStatement pstm = null;

        //É ESPECIFICO PARA MANIPULAR DADOS DO BANCO
        ResultSet rset = null;

        try {

            con = ConnectionFactory.createConnectionToMySQL();

            pstm = (PreparedStatement) con.prepareStatement(sql);

            rset = pstm.executeQuery();

            //enquanto tiver proximo valor vai continuar repetindo
            while (rset.next()) {

                Contato contato = new Contato();

                contato.setId(rset.getInt("id"));
                contato.setNome(rset.getString("nome"));
                contato.setIdade(rset.getInt("idade"));
                contato.setDataCadastro(rset.getDate("dataCadastro"));

                //tudo que estiver entro do banco vai para a variavel contatos
                contatos.add(contato);

            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {

                if (rset != null) {
                    rset.close();
                }

                if (pstm != null) {
                    pstm.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            return contatos;
        }
    }
}
