import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        try{System.out.println("Hello world!");

        String sql = "select name from student where student_id=1";
        String url = "jdbc:mysql://localhost:3306/intellij";
        String username = "root";
        String password = "";

        Connection con = DriverManager.getConnection(url,username,password);
        Statement st = con.createStatement();

        ResultSet result = st.executeQuery(sql);
        result.next();
        String name = result.getString(1);
        System.out.println(name);
        con.close();
    }
        catch (Exception e){
            System.out.println(e);
        }
    }
}