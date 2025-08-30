import javax.swing.plaf.nimbus.State;
import java.sql.*;
public class DataInsertion {
    public static void main(String[] args)  throws ClassNotFoundException{
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "Database@17";

        String query = "INSERT INTO employess(id, name, job_title, salary) VALUES (4,'Suraj', 'Android Developer' , 85000.0)";


        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver load successfully!!!");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection con = DriverManager.getConnection(url, username,password);
            System.out.println("Connection established successfully!!!");
            Statement stmt = con.createStatement();
            int rowsaffected = stmt.executeUpdate(query);

            if(rowsaffected > 0){
                System.out.println("Insert Successfully " + rowsaffected+ " row(s.affected");
            }else{
                System.out.println("Insertion failed!!!");
            }

            stmt.close();
            con.close();
            System.out.println("Connection closed Successfully!!!");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
