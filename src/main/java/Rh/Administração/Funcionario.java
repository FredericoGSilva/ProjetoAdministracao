/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rh.Administração;

/**
 *
 * @author Frederico
 */
public class Funcionario {
    private String nome;
    private String email; 
    private int telefone;
    private double salario;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //Aqui é o método com a regra geral de bonificação.
    public double bonificacao() {
        return salario * 0.05;
    }
    
    //FORMATAR -
    public void emiteInformacoesSobreFuncionario() {
        System.out.println("\nNome: " + nome + 
                           "\nTelefone: " + telefone + 
                           "\nEmail: " + email + 
                           "\nSalário: " + salario +
                           "\nBonificação: " + bonificacao());
    }
    
    
    
    
    
}
