/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.Model;

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

/*    //salario = 4.350,00
    public Administrador() { 
        super.setSalario(4350.00);
    }
*/
    @Override
    public double bonificacao() {
        return super.bonificacao(); 
    }
    

}
