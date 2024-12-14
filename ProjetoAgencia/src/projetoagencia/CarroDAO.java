package projetoagencia;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CarroDAO {

    /*
    Create - save
    Read - List
    Update
    Delete
     */
    public void save(Carro carro) {

        String sql = "INSERT INTO automovel(id, fabricante, tamanho, tipo, valor, cor) VALUES (?,?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {

            conn = ConerctorVeiculo.createConnectionToMySQL();

            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setInt(1, carro.getId());
            pstm.setString(2, carro.getFabricante());
            pstm.setString(3, carro.getTamanho());
            pstm.setString(4, carro.getTipo());
            pstm.setDouble(5, carro.getValor());
            pstm.setString(6, carro.getCor());
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

    public List<Carro> getCarros() {

        String sql = "SELECT * FROM automovel";

        List<Carro> carros = new ArrayList<Carro>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {

            conn = ConerctorVeiculo.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            while (rset.next()) {
                Carro carro = new Carro();

                carro.setId(rset.getInt("id"));
                carro.setFabricante(rset.getString("fabricante"));
                carro.setTamanho(rset.getString("tamanho"));
                carro.setTipo(rset.getString("tipo"));
                carro.setValor(rset.getDouble("valor"));
                carro.setCor(rset.getString("cor"));

                carros.add(carro);
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

        return carros;
    }
}
