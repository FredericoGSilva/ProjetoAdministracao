/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rh.Administração;

import br.com.Model.Funcionario;
import Conexao.ConexaoMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Frederico
 */
public class CadastroFuncionarios extends Funcionario {

    public ResultSet cadastraNoBanco(CadastroFuncionarios cadastro) {
        Connection conexao = null;

        conexao = new ConexaoMySQL().conector();

        try {
            String cadastraNoBanco = "insert into tb_funcionario(nome, email, telefone, cargo) values (?, ?, ?, ?)";

            PreparedStatement preparaConexao = conexao.prepareStatement(cadastraNoBanco);
            preparaConexao.setString(1, cadastro.getNome());
            preparaConexao.setString(2, cadastro.getEmail());
            preparaConexao.setInt(3, cadastro.getTelefone());
            preparaConexao.setString(4, cadastro.getCargo());

            preparaConexao.execute();
            preparaConexao.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe CadastroFuncionario: " + erro);
        }
        return null;
    }
}
