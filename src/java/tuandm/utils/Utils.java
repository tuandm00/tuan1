package tuandm.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class Utils {

    public Connection getConnection() throws Exception {
        String url = "jdbc:sqlserver://" + servername + ":" + portnumber + ";databasename=" + dbname;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userid, password);
    }

    private final String servername = "SE140420";
    private final String dbname = "HanaShop";
    private final String portnumber = "1433";
    private final String userid = "sa";
    private final String password = "sa";

    //Test connection
    public static void main(String[] args) {

        try {
            Connection conn = new Utils().getConnection();
            if (conn != null) {
                System.out.println("Connect Successfully");
            }
            else     {
                System.out.println("Connect Failed");
            }
        } catch (Exception ex) {
        }

    }
}
