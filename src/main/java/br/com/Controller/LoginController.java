/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.Controller;

import br.com.Controller.LoginHelper.LoginHelper;
import br.com.Model.Administrador;
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
    private LoginHelper helper;
    
    public LoginController(TelaDeLogin view) {
        this.view = view;
        this.helper = new LoginHelper(view);
        
    }
    
    public void entrarNoSistema() {
        helper.obterLogin();
    }
    
}
