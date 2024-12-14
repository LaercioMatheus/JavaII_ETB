package atividaderevisao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    /*COMANDO INSERT(SAVE)*/
    public void save(Aluno aluno) {

        String sql = "INSERT INTO alunos (id, matricula, nome, cpf, idade, turma, dataCadastro, telefone) VALUES (?, ?, ?, ?, ?, ? ,?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConectionAtividade.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);

            pstm.setInt(1, aluno.getId());
            pstm.setString(2, aluno.getMatricula());
            pstm.setString(3, aluno.getNome());
            pstm.setString(4, aluno.getCpf());
            pstm.setInt(5, aluno.getIdade());
            pstm.setString(6, aluno.getTurma());
            pstm.setDate(7, new Date(aluno.getDataCadastro().getTime()));
            pstm.setInt(8, aluno.getTelefone());
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
    public List<Aluno> getAluno() {
        String sql = "SELECT * FROM alunos";

        List<Aluno> alunos = new ArrayList<Aluno>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try {

            conn = ConectionAtividade.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rset = pstm.executeQuery();

            while (rset.next()) {

                Aluno aluno = new Aluno();

                aluno.setId(rset.getInt("id"));
                aluno.setMatricula(rset.getString("matricula"));
                aluno.setNome(rset.getString("nome"));
                aluno.setCpf(rset.getString("cpf"));
                aluno.setIdade(rset.getInt("idade"));
                aluno.setTurma(rset.getString("turma"));
                aluno.setDataCadastro(rset.getDate("dataCadastro"));
                aluno.setTelefone(rset.getInt("telefone"));
                alunos.add(aluno);
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
        return alunos;
    }

    /*COMANDO UPDATE*/
    public void update(Aluno aluno) {
        String sql = "UPDATE alunos SET matricula = ?, nome = ?, cpf = ?, idade = ?, turma = ?, dataCadastro = ?, telefone = ? WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {

            conn = ConectionAtividade.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);

            pstm.setString(1, aluno.getMatricula());
            pstm.setString(2, aluno.getNome());
            pstm.setString(3, aluno.getCpf());
            pstm.setInt(4, aluno.getIdade());
            pstm.setString(5, aluno.getTurma());
            pstm.setDate(6, new Date(aluno.getDataCadastro().getTime()));
            pstm.setInt(7, aluno.getTelefone());

            pstm.setInt(8, aluno.getId());
            pstm.execute();

            System.out.println("Os dados do bando de dados foram alterados com sucesso!!!");

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

        String sql = "DELETE FROM alunos WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConectionAtividade.createConnectionToMySQL();
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
