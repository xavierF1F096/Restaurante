/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conec;
import com.mysql.jdbc.Connection;
import static java.lang.Character.UnicodeBlock.forName;
import static java.lang.System.out;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author xavier
 */
public class conection {
    public static Connection conn;
    public static final String driver="com.mysql.jdbc.Driver";
    public static final String user="root";
    public static final String pas="xavier.1996";
    public static final String url="jdbc:mysql://localhost:3306/azteca";
    
    
    public conection(){
    conn=null;
    try{
        Class.forName(driver);
        conn=(Connection) DriverManager.getConnection(url,user,pas);
        if(conn!=null){
            out.println("CONECCION ESTABLECIDA.....");
        }
    }catch(ClassNotFoundException | SQLException e){
   out.println("ERROR DE CONECCION");
    }
    }
    public Connection getConnection(){
    return conn;
            }
    public void desconectar(){
    conn=null;
   if(conn==null){
       out.println("conexcion desconectada");
   }
    }

    
    
}
