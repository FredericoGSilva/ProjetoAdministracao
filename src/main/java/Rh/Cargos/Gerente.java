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
    
    public Gerente() { 
        super.setSalario(16.054);
    }
    
    @Override
    public double bonificacao() { 
        return super.bonificacao() + super.getSalario(); 
    }
    
}
