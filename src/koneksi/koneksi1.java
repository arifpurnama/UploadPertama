
package koneksi;
    import java.sql.*;
/**
 *
 * @author Arif Purnama
 */
public class koneksi1 {
    public Connection conn;
    public Statement st;
    public ResultSet rs;
    
    public void Class(){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn=DriverManager.getConnection("jdbc:mysql://localhost/login","root","");
                System.out.println("Koneksi Sukses");
            } catch (Exception e) {
                System.out.println("e");
            }
    }
}

