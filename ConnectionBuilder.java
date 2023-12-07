import java.sql.Connection;

public class ConnectionBuilder{
    public static Connection con;
    public static Connection getConnection(){
        return con;
    }
}
