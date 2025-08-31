import java.sql.*;

public class DataUpdation {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "Database@17";

        String query = "UPDATE employess " +
                "SET job_title = 'Java developer', salary = 75000.0 " +
                "WHERE id = 2;";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

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
                System.out.println("Update Successfully " + rowsaffected+ " row(s.affected");
            }else{
                System.out.println("Update failed!!!");
            }

            stmt.close();
            con.close();
            System.out.println("Connection closed Successfully!!!");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
