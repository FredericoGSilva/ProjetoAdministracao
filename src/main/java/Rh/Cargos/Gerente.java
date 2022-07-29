/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rh.Cargos;

import Rh.Administração.Funcionario;

/**
 *
 * @author Frederico
 */
public class Gerente extends Funcionario {
    private int senhaDoGerente;
    
    public Gerente() { //Rever se os construtores das classes irão iniciar com os salários.
        super.setSalario(16.054);
    }
    
     //salario = 16.054,00
    
    /*Gerente têm a sua própria regra de bonificação:
        regra geral + salario*/
    @Override
    public double bonificacao() { //A bonificação de todas as classes filhas(cargos) serão exibidas no método emiteInformacoesSobreFuncionario(), junto com outras informações
        return super.bonificacao() + super.getSalario(); 
    }
    
    
    
    
    
    
    
}
