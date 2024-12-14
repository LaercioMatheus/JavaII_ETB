
package autonomia;


import static autonomia.ConnectorObj.createConnectionToMySQL;
import java.sql.Connection;



public class TesteAutonomia {

    public static void main(String[] args) throws Exception {
        
        //TESTANDO A CONECCAO
        Connection conn = createConnectionToMySQL();
        
        if (conn != null) {
            System.out.println("Conectado!!");
            conn.close();
        }
        
    }
    
}
