package projetoobjetcrud;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ObjetoDAO {

    /*COMANDO INSERT*/
    public void save(Objeto objeto) {

        String sql = "INSERT INTO objetos (id, nome, descricao) VALUES (?,?,?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionObj.createConnectionToMySQL();

            pstm = (PreparedStatement) conn.clientPrepareStatement(sql);
            pstm.setInt(1, objeto.getId());
            pstm.setString(2, objeto.getNome());
            pstm.setString(3, objeto.getDescricao());
            pstm.execute();

            System.out.println("Cadastro realizado com sucesso!!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (pstm != null) {
                    conn.close();
                }
                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /*COMANDO LIST*/
    public List<Objeto> getObjeto() throws SQLException {

        String sql = "SELECT * FROM objetos";

        List<Objeto> objetos = new ArrayList<Objeto>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {
            conn = ConnectionObj.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.clientPrepareStatement(sql);

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

    /*COMANDO UPDATE*/
    public void update(Objeto objeto) throws Exception {
        String sql = "UPDATE objetos SET nome = ?, descricao = ? WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionObj.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);

            pstm.setString(1, objeto.getNome());
            pstm.setString(2, objeto.getDescricao());
            pstm.setInt(3, objeto.getId());

            pstm.execute();

            System.out.println("Dados atualizados com sucesso!");

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

    /*COMANDO DELETE*/
    public void deleteById(int id) throws SQLException {
        String sql = "DELETE FROM objetos WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        System.out.println("Exclusão feita com sucesso!");

        try {
            conn = ConnectionObj.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);

            pstm.setInt(1, id);
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
