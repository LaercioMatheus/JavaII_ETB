package projetopesscrudmasc;

import java.sql.Connection;
import static projetopesscrudmasc.ConnectionPess.createConnectionToMySQL;

public class ProjetoPessCRUDMasc {

    public static void main(String[] args) throws Exception {

        //*TODOS OS MÉTODOS DESSA CLASSE PRECISA DE UM BANCO DE DADOS PARA FUNCIONAR*//
        /*TESTAR CONECCAO*/
        Connection conn = createConnectionToMySQL();

        if (conn != null) {
            System.out.println("Connectado!!");
            conn.close();
        }

        /*CRIAR REGISTRO/
        Pessoa pessoa = new Pessoa();

        //pessoa.setId(0);
        pessoa.setNome("Teste");
        pessoa.setCpf("23641067035");
        pessoa.setIdade(30);
        pessoa.setTelefone(99812658);
*/
        PessoaDAO pessoadao = new PessoaDAO();
        //pessoadao.save(pessoa);

        /*ATUALIZAR OS REGISTROS DO BANCO DE DADOS/
        Pessoa pess = new Pessoa();

        pess.setId(4);
        pess.setNome("Teste");
        pess.setCpf("36915638735");
        pess.setIdade(26);

        pessoadao.update(pess);

        /*DELETANDO OS REGISTROS OU A TABELA
        pessoadao.deleteId(4);
*/
        /*PESQUISAR OS DADOS DE REGISTRO*/
        System.out.println("\n -- MOSTRAR OS DADOS DO BANCO DE DADOS --");

        for (Pessoa p : pessoadao.getPessoa()) {
            System.out.println(
                    "\nid: " + p.getId()
                    + "\nNome: " + p.getNome()
                    + "\nCPF: " + p.formatarCPF()
                    + "\nIdade: " + p.getIdade()
                    + "\nTelefone: " + p.FormatarTele());
        }
    }

}
