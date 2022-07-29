/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Frederico
 */
public class ConexaoMySQL {
    
    public static Connection conector() {
        
        Connection conexao = null;
        
        //String driver = "com.mysql.cj.jdbc.Driver";
        
        //String url = "jdbc:mysql://127.0.0.1:3306/projeto_bonificacao_funcionario?zeroDateTimeBehavior=CONVERT_TO_NULL";
        //String usuario = "root";
        //String senha = "abril1999";
        
        try {
            String url = "jdbc:mysql://localhost:3306/projeto_bonificacao_funcionario?user=root&password=abril1999";
            conexao = DriverManager.getConnection(url);
            return conexao;
        } catch(SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            return null;
        }
        
    }
    
}
