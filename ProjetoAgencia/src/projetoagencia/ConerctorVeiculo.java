package projetoagencia;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class ConerctorVeiculo {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agencia";

    public static Connection createConnectionToMySQL() throws Exception {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = (Connection) DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

        return connection;
    }
}
