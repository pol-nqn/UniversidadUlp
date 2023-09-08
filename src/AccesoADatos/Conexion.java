package AccesoADatos;

import org.mariadb.jdbc.Connection;
import java.sql.*;

public class Conexion {

    private static final String URL = "jdbc:mariadb://localhost:3306/";
    private static final String DB = "universidadulp";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection conn;

}
