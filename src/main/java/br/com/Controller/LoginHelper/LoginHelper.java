/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.Controller.LoginHelper;

import br.com.Model.Administrador;
import br.com.View.TelaDeLogin;

/**
 *
 * @author Frederico
 */
public class LoginHelper {
    
    private TelaDeLogin view;

    public LoginHelper(TelaDeLogin view) {
        this.view = view;
    }
    
    public Administrador obterLogin() {
        String nome = view.getTxt_Nome().getText();
        String senha = view.getTxt_Senha().getText();
        Administrador adm = new Administrador();
        adm.setNome(nome);
        adm.setSenhaAdm(senha);
        return adm;
    }
    
    
}
