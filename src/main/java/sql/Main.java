package sql;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.fabric.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost3306/abonentdatabase","root", "1234");
        connection.isReadOnly();
    }
}
