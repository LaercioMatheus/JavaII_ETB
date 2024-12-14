package projetopesscrudmasc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {

    /*COMANDO INSERT(SAVE)*/
    public void save(Pessoa pessoa) {

        String sql = "INSERT INTO ficha(id, nome, cpf, idade, telefone) VALUES (?,?,?,?,?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {

            conn = ConnectionPess.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);

            pstm.setInt(1, pessoa.getId());
            pstm.setString(2, pessoa.getNome());
            pstm.setString(3, pessoa.getCpf());
            pstm.setInt(4, pessoa.getIdade());
            pstm.setInt(5, pessoa.getTelefone());
            pstm.execute();

            System.out.println("Cadastro feito com sucesso!! :)");

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
    public List<Pessoa> getPessoa() {
        String sql = "SELECT * FROM ficha";

        List<Pessoa> ficha = new ArrayList<Pessoa>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {

            conn = ConnectionPess.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rset = pstm.executeQuery();

            while (rset.next()) {

                Pessoa pessoa = new Pessoa();

                pessoa.setId(rset.getInt("id"));
                pessoa.setNome(rset.getString("nome"));
                pessoa.setCpf(rset.getString("cpf"));
                pessoa.setIdade(rset.getInt("idade"));
                pessoa.setTelefone(rset.getInt("telefone"));

                ficha.add(pessoa);
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
        return ficha;
    }

    /*COMANDO UPDATE*/
    public void update(Pessoa pessoa) {
        String sql = "UPDATE ficha SET nome = ?, cpf = ?, idade = ?, telefone = ? WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionPess.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);

            pstm.setString(1, pessoa.getNome());
            pstm.setString(2, pessoa.getCpf());
            pstm.setInt(3, pessoa.getIdade());
            pstm.setInt(5, pessoa.getTelefone());

            pstm.setInt(4, pessoa.getId());
            pstm.execute();

            System.out.println("Os dados do banco de dados foram alterados com sucesso!!");

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
    public void deleteId(int id) {
        String sql = "DELETE FROM ficha WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionPess.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareCall(sql);

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
