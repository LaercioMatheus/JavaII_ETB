package autonomia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ObjetoDAO {

    /*
    Create - save
    Read - List
    Update
    Delete
     */
    public void save(Objeto objeto) throws Exception {
        String sql = "INSERT INTO objeto(tamanho, cor, peso) VALUES (?,?,?,?)";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {

            conn = ConnectorObj.createConnectionToMySQL();

            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setInt(1, objeto.getTamanho());
            pstm.setString(2, objeto.getCor());
            pstm.setInt(3, objeto.getPeso());
            pstm.execute();

            System.out.println("Dados cadastrados con Sucesso!");

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

    public List<Objeto> getObjetos() {
        String sql = "SELECT * FROM objeto";

        List<Objeto> objetos = new ArrayList<>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {

            conn = ConnectorObj.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            while (rset.next()) {
                Objeto objeto = new Objeto();

                //objeto.setIdObjeto(rset.getInt("idObjeto"));
                objeto.setTamanho(rset.getInt("tamanho"));
                objeto.setCor(rset.getString("cor"));
                objeto.setPeso(rset.getInt("peso"));

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
                e.fillInStackTrace();
            }
        }
        return objetos;
    }
}
