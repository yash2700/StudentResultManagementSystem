/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectionProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author yaswa
 */
public class ConnectionProvider {
    
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentResultSystem", "root", "Yaswanth1!");
            return con;
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        return null;
    }
    public static void main(String[] args) {
        ConnectionProvider obj= new ConnectionProvider();
        Connection c=obj.getCon();
        
    }
}
