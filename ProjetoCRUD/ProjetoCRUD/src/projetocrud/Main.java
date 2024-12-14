/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocrud;

import java.sql.Connection;
import java.sql.Date;
import static projetocrud.ConnectionFactory.createConnectionToMySQL;



/**
 *
 * @author 35936x
 */
public class Main {

    
    public static void main(String[] args) throws Exception {
        
        /*Connection connec = createConnectionToMySQL();
        
        if (connec != null) {
            System.out.println("Conectado!");
            System.out.println(connec);
            
            
            
            //SERVE PARA FECHAR A CONECÇÃO COM O BANCO DE DADOS
            connec.close();
        }*/
        
        //fazendo o teste final
        Contato contato = new Contato();
        contato.setId(1);
        contato.setNome("Laércio");
        contato.setIdade(17);
        //PARA PASSAR A FATA PRECISO COLOCAR ESSE PARAMETRO POR MEIO DESSE 'System.currentTimeMillis()'
        contato.setDataCadastro(new Date(System.currentTimeMillis()));
        
        //CHAMANDO A CLASSE DAO QUE TEM A FUNCAO SAVE ELA IRA FAZER COM QUE OS DADOS VAO PARA O BANCO
        ContatoDAO contatoDao = new ContatoDAO();
        contatoDao.save(contato);        
        
    }
    
}
