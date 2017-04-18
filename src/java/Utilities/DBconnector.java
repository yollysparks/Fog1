 package Utilities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Casper
 */
public class DBconnector {


    private final static String HOST     = "localhost";
    private final static int    PORT     = 3306;
    private final static String DATABASE = "jdbc:mysql://localhost:3306/cupcakes?useSSL=false";
    private final static String USERNAME = "root"; 
    private final static String PASSWORD = "indeche2013";
     private static String driver = "com.mysql.jdbc.Driver";
    private static Connection connection = null;
    
    
    public static Connection getConnector() throws SQLException, ClassNotFoundException{
        if (connection == null) {
            Class.forName("com.mysql.jdbc.Driver");
            String url = String.format("jdbc:mysql://localhost:3306/carport?useSSL=false", HOST, PORT, DATABASE);
            return DriverManager.getConnection(url, USERNAME, PASSWORD);
        }
        return connection;
    }
//    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        new DBconnector();
//    }
//    public ResultSet doQuery(String query) throws SQLException, ClassNotFoundException{
//        System.out.println("*********"+query);
//        Statement stmt = getConnector().createStatement();
//        ResultSet res = stmt.executeQuery(query);
//        return res;
//    }
//    
//    public void doUpdate(String query) throws SQLException, ClassNotFoundException{
//        Statement stmt = getConnector().createStatement();
//        stmt.executeUpdate(query);
//    }
//    
    public static PreparedStatement getPreparedStatement(String sql) throws SQLException, ClassNotFoundException{
        return getConnector().prepareStatement(sql);
    }

    public Connection getConnection() {
     Connection conn = null;
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(DBconnector.DATABASE,DBconnector.USERNAME,DBconnector.PASSWORD);
            
        } catch(ClassNotFoundException se){
           se.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return conn;
    }
    public void close(Statement stmt, ResultSet rs, Connection conn){
        try{
            if(rs != null)
                rs.close();
            stmt.close();
            conn.close();
        } catch(SQLException se){
            
        } catch(Exception ex){
            
        }
        finally{
            try{
              if(stmt!=null)
                 stmt.close();
           }catch(SQLException se2){
           }// nothing we can do
           try{
              if(conn!=null)
                 conn.close();
           }catch(SQLException se){
              se.printStackTrace();
           }
        }
    }
  }
