/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rh.Cargos;

import Conexao.ConexaoMySQL;
import Rh.Administração.Funcionario;
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
    private String nomeAdm;
    private String senhaAdm;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeAdm() {
        return nomeAdm;
    }

    public void setNomeAdm(String nomeAdm) {
        this.nomeAdm = nomeAdm;
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

    @Override
    public double bonificacao() {
        return super.bonificacao(); 
    }
    
    Connection conexao = null;

    public ResultSet autenticacaoAdministrador(Administrador adm) {

        conexao = new ConexaoMySQL().conector();
        
        try {
            String consultaNoBanco = "select * from login where usuario = ? and senha = ?";
            
            PreparedStatement preparaConexao = conexao.prepareStatement(consultaNoBanco);
            preparaConexao.setString(1, adm.getNomeAdm());
            preparaConexao.setString(2, adm.getSenhaAdm());
            ResultSet resultadoDaConexao = preparaConexao.executeQuery();
            return resultadoDaConexao;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe Administrador: " + erro);
            return null;
        }
    }

}
