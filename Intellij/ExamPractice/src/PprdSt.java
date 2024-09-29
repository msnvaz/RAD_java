import java.sql.*;
import java.util.Scanner;

public class PprdSt {

    static String url = "jdbc:mysql://localhost:3306/intellij";
    static String username = "root";
    static String password = "";

    public static void display()  throws SQLException {
        Connection con = DriverManager.getConnection(url, username, password);

        PreparedStatement prst = con.prepareStatement("Select * from student where student_id>? ");
        prst.setInt(1,0);

        ResultSet rSet =prst.executeQuery();
        System.out.println();

        while(rSet.next()){
            System.out.println("Student ID : "+rSet.getString("student_id"));
            System.out.println("Name : "+rSet.getString("name"));
            System.out.println("Address : "+rSet.getString("address"));
            System.out.println("Phone Number : "+rSet.getString("contact_number"));
            System.out.println();
        }
    }

    public static void insert() throws SQLException{
        Scanner scan = new Scanner(System.in);
        Connection con = DriverManager.getConnection(url,username,password);

        System.out.println("Enter student name : ");
        String nameIn = scan.nextLine();
        System.out.println("Enter student address : ");
        String addressIn = scan.nextLine();
        System.out.println("Enter student Phone Number : ");
        String phnumIn = scan.nextLine();

        String sql = "insert into student(name,address,contact_number) VALUES (?,?,?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1,nameIn);
        pst.setString(2,addressIn);
        pst.setString(3,phnumIn);
        pst.executeUpdate();
    }
    public static void main(String[] args) {
        try {
            int choice=0;
            while(choice!=3){
                Scanner scan = new Scanner(System.in);
                System.out.println("Choices : ");
                System.out.println("1 : Display ");
                System.out.println("2 : Insert ");
                System.out.println("3 : Quit ");
                System.out.println("Enter a choice (1-3) ");
                choice = scan.nextInt();


                switch (choice) {
                    case 1:
                        display();
                        break;
                    case 2:
                        insert();
                        break;
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
