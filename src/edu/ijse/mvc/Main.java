/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ijse.mvc;
import edu.ijse.mvc.db.DBConnection;
import java.sql.SQLException;
/**
 *
 * @author sakuni
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        System.out.println("hello");
        DBConnection.getInstance().getConnection();
    }
    
}
