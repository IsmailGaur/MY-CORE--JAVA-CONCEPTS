import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "Database@17";

        String query = "Select * from employess";


        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver load successfully: ");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }


        try{
            Connection con = DriverManager.getConnection(url, username, password);
                System.out.println("Connection established successfully: ");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                while(rs.next()){
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String job_title = rs.getString("Job_title");
                    double salary = rs.getInt("salary");

                    System.out.println();
                    System.out.println("================");
                    System.out.println("ID: " + id);
                    System.out.println("Name: " + name);
                    System.out.println("Job Title: " + job_title);
                    System.out.println("SalarY : " + salary);


                }
                rs.close();
                stmt.close();
                con.close();
            System.out.println("Connection closed successfully: ");

            } catch (SQLException e){
                System.out.println(e.getMessage());

            }
        }
    }

