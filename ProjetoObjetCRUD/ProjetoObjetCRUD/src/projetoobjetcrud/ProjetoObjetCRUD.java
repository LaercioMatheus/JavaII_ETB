package projetoobjetcrud;

import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import static projetoobjetcrud.ConnectionObj.createConnectionToMySQL;

public class ProjetoObjetCRUD {

    public static void main(String[] args) throws SQLException, Exception {

        //*TODOS OS MÉTODOS DESSA CLASSE PRECISA DE UM BANCO DE DADOS PARA FUNCIONAR*//
        /*TESTAR CONECCAO*/
        Connection conn = createConnectionToMySQL();

        if (conn != null) {
            System.out.println("Connectado!!");
            conn.close();
        }

        /*CRIAR REGISTRO*/
        Objeto objeto = new Objeto();

        objeto.setNome("Laércio");
        objeto.setDescricao("Testando os comandos");

        ObjetoDAO objetoDao = new ObjetoDAO();
        objetoDao.save(objeto);

        /*ATUALIZANDO REGISTRO DO BANCO*/
        Objeto obj = new Objeto();
        obj.setId(12);
        obj.setNome("Fábio");
        obj.setDescricao("Testando o 'create'");

        objetoDao.update(obj);

        /*DELETANDO OS REGISTROS OU A TABELA*/
        objetoDao.deleteById(12);

        //PESQUISAR OS DADOS DE REGISTRO*/
        System.out.println("\n -- MOSTRAR OS DADOS DO BANCO DE DADOS --");

        for (Objeto o : objetoDao.getObjeto()) {
            System.out.println(
                    "\nid: " + o.getId()
                    + "\nNome: " + o.getNome()
                    + "\nDescricao: " + o.getDescricao());
        }
    }

}
