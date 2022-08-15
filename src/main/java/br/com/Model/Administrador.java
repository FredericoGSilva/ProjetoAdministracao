/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.Model;

import br.com.Controller.ConexaoMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Frederico
 */
public class Administrador extends Funcionario {

    private int id;
    private String senhaAdm;

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome); 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSenhaAdm() {
        return senhaAdm;
    }

    public void setSenhaAdm(String senhaAdm) {
        this.senhaAdm = senhaAdm;
    }

    //salario = 4.350,00
    public Administrador() { 
        super.setSalario(4350.00);
    }
/*
    @Override
    public double bonificacao() {
        return super.bonificacao(); 
    }
*/
    // método q faz a verificação do login e senha:
    public ResultSet autenticaLogin() {
        Connection conexao = null;
        
        conexao = new ConexaoMySQL().conector();
        
        try {
            String consultaNoBanco = "select * from tb_loginAdministrador where usuario = ? and senha = ?";
            
            PreparedStatement preparaConexao = conexao.prepareStatement(consultaNoBanco);
            preparaConexao.setString(1, this.getNome());
            preparaConexao.setString(2, this.getSenhaAdm());
            ResultSet resultadoDaConexao = preparaConexao.executeQuery();
            return resultadoDaConexao;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe Administrador: " + erro);
            return null;
        }
    }

}
