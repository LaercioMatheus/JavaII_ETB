package projetoupdate;

import java.sql.Connection;
import java.sql.DriverManager;

public class ObjetoConnection {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/objetos";

    public static Connection createConnectionToMySQL() throws Exception {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = (Connection) DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

        return connection;

    }

}
