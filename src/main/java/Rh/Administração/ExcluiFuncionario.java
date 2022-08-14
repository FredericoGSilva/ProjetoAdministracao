/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rh.Administração;

import Conexao.ConexaoMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Frederico
 */
public class ExcluiFuncionario {

    private String nome;

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void excluiFuncionario(ExcluiFuncionario funcionario) {

        Connection conexao = null;

        conexao = new ConexaoMySQL().conector();

        try {
            String sql = "delete from tb_funcionario where nome = ?";
            PreparedStatement preparando = conexao.prepareStatement(sql);
            preparando.setString(1, funcionario.getNome());
            preparando.execute();
            preparando.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe ExcluirFuncionario: " + erro);
        }

    }
}
