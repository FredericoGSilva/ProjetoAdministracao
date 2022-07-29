
import Rh.Administração.Bonificacao;
import Rh.Administração.Funcionario;
import Rh.Cargos.Gerente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Frederico
 */
public class testaPrograma {
    public static void main(String[] args) {
        
        Gerente frederico = new Gerente();
        frederico.setNome("Frederico G. Silva");
        frederico.setTelefone(555555555);
        frederico.setEmail("frederico@gmail.com");
        frederico.emiteInformacoesSobreFuncionario();
        
        
        
        
    }
}
