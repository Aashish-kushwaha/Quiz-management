/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuizProject;
import java.sql.*;

/**
 *
 * @author dell
 */
public class ConnetionProvider {
    public static Connection getCon()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quizmanagement","root", "root");
            return con;
            
        }catch(ClassNotFoundException | SQLException e){
            return null;
        }
    }
}
