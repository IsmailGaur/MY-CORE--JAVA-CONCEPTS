import java.sql.*;
public class DataDeletion{
    public static void main(String[] args)  throws ClassNotFoundException{
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "Database@17";

        String query = "DELETE FROM employess where id = 4";


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
                System.out.println("Deletion Successfully " + rowsaffected+ " row(s.affected");
            }else{
                System.out.println("Deletion failed!!!");
            }

            stmt.close();
            con.close();
            System.out.println("Connection closed Successfully!!!");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
