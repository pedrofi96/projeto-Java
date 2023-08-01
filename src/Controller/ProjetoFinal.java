package Controller;

import Model.CadastrarNovoUsuario;
import Model.MateraisCasamento;



public class ProjetoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CadastrarNovoUsuario usuario = new CadastrarNovoUsuario();
       usuario.setNome("victor");
       usuario.setEmail("victoremanuel11@gmail.com");
       usuario.setCpf("07412234579");
       usuario.setSenha("123456");
       
       MateraisCasamento material = new MateraisCasamento();
       material.setNomeMaterial("Mesa");
       System.out.println(usuario.getNome());
       System.out.println(material.getNomeMaterial());

    }
    
}
