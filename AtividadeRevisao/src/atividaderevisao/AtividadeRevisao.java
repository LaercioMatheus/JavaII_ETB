package atividaderevisao;

import static atividaderevisao.ConectionAtividade.createConnectionToMySQL;
import java.sql.Connection;
import java.time.Instant;
import java.util.Date;

public class AtividadeRevisao {

    public static void main(String[] args) throws Exception {

        //*TODOS OS MÉTODOS DESSA CLASSE PRECISA DE UM BANCO DE DADOS PARA FUNCIONAR*//
        /*TESTAR CONECCAO*/
        Connection conn = createConnectionToMySQL();

        if (conn != null) {
            System.out.println("Connectado!!");
            conn.close();
        }

        /*CRIAR REGISTRO*/
        Aluno aluno = new Aluno();

        //aluno.setId(0);
        aluno.setMatricula("658413f");
        aluno.setNome("Nicolas");
        aluno.setCpf("00352516823");
        aluno.setIdade(20);
        aluno.setTurma("3º D");
        aluno.setDataCadastro(new Date(System.currentTimeMillis()));
        aluno.setTelefone(999843206);

        AlunoDAO alunoDao = new AlunoDAO();
        alunoDao.save(aluno);

        /*ATUALIZAR OS REGISTROS DO BANCO DE DADOS/
        Aluno aluno = new Aluno();

        aluno.setId(4);
        aluno.setMatricula("15714c");
        aluno.setNome("Rafael");
        aluno.setCpf("65413798540");
        aluno.setIdade(29);
        aluno.setTurma("4º C");
        aluno.setDataCadastro(new Date(System.currentTimeMillis()));
        aluno.setTelefone(994685135);

        alunoDao.update(aluno);
         */
 /*DELETANDO OS REGISTROS OU A TABELA/
        alunoDao.deleteId(5);

        
        /*PESQUISAR OS DADOS DE REGISTRO*/
        System.out.println("\n -- MOSTRAR OS DADOS DO BANCO DE DADOS --");

        for (Aluno a : alunoDao.getAluno()) {
            System.out.println(
                    "\nid: " + a.getId()
                    + "\nMatricula: " + a.getMatricula()
                    + "\nNome: " + a.getNome()
                    + "\nCPF: " + a.formatarCPF()
                    + "\nIdade: " + a.getIdade()
                    + "\nTurma: " + a.getTurma()
                    + "\nData Cadastro: " + Aluno.sdf.format(a.getDataCadastro())
                    + "\nTelefone: " + a.FormatarTele());
        }
    }
}
