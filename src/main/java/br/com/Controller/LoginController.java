/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.Controller;

import Conexao.ConexaoMySQL;
import br.com.Model.Administrador;
import br.com.Model.Funcionario;
import br.com.View.TelaDeLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Frederico
 */
public class LoginController {
    
    // O único q pode ter acesso ao login é o adm.
    
    private final TelaDeLogin view;
    
    public LoginController(TelaDeLogin view) {
        this.view = view;
    }
    
    public ResultSet atenticaLogin(Administrador adm) {
        Connection conexao = null;
        
        conexao = new ConexaoMySQL().conector();
        
        try {
            String consultaNoBanco = "select * from tb_loginAdministrador where usuario = ? and senha = ?";
            
            PreparedStatement preparaConexao = conexao.prepareStatement(consultaNoBanco);
            preparaConexao.setString(1, adm.getNome());
            preparaConexao.setString(2, adm.getSenhaAdm());
            ResultSet resultadoDaConexao = preparaConexao.executeQuery();
            return resultadoDaConexao;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe Administrador: " + erro);
            return null;
        }
    
    }
    
}
