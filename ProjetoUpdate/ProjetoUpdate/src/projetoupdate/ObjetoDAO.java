package projetoupdate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ObjetoDAO {

    /*
    Create - save
    Read - List
    Update - update
    Delete
     */
    public void save(Objeto objeto) {
        String sql = "INSERT INTO (id, nome, descricao) VALUES (?, ?, ?)";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ObjetoConnection.createConnectionToMySQL();

            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setInt(1, objeto.getId());
            pstm.setString(2, objeto.getNome());
            pstm.setString(3, objeto.getDescricao());
            pstm.execute();

            System.out.println("Cadastro realizado com Sucesso!!");

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

    public List<Objeto> getObjetos() throws Exception {

        String sql = "SELECT * FROM objetos";

        List<Objeto> objetos = new ArrayList<>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = ObjetoConnection.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rset = pstm.executeQuery();

            while (rset.next()) {
                Objeto objeto = new Objeto();

                objeto.setId(rset.getInt("id"));
                objeto.setNome(rset.getString("nome"));
                objeto.setDescricao(rset.getString("descricao"));

                objetos.add(objeto);
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
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return objetos;
    }

    public void update(Objeto objeto) throws Exception {
        String sql = "UPDATE objetos SET nome ?, decricao = ? WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ObjetoConnection.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);

            pstm.setString(1, objeto.getNome());
            pstm.setString(2, objeto.getDescricao());
            pstm.setInt(3, objeto.getId());

            pstm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (pstm != null) {
                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
