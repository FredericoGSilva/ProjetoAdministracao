/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rh.Administração;

import br.com.Model.Funcionario;

/**
 *
 * @author Frederico
 */
public class Bonificacao extends Funcionario {
    
    public double bonificacaoGeral() {
        return getSalario() * 0.05;
    }
    
    public double bonificacaoAdministrador() {
        return bonificacaoGeral() + getSalario();
    }
    
    
}
