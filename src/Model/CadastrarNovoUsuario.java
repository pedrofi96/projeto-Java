
package Model;
import Model.MateraisCasamento;
import Model.MateraisFormatura;
import java.util.ArrayList;

public class CadastrarNovoUsuario {
        private String nome;
        private String cpf;
	private String email;
        private String senha;
        private double carrinho;
        private ArrayList<MateraisCasamento> materiaisCasamento;
        private ArrayList<MateraisFormatura> materiaisFormatura;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(double carrinho) {
        this.carrinho = carrinho;
    }
    
     public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public ArrayList<MateraisCasamento> getMateriaisCasamento() {
        return materiaisCasamento;
    }

    public void setMateriaisCasamento(ArrayList<MateraisCasamento> materiaisCasamento) {
        this.materiaisCasamento = materiaisCasamento;
    }

    public ArrayList<MateraisFormatura> getMateriaisFormatura() {
        return materiaisFormatura;
    }

    public void setMateriaisFormatura(ArrayList<MateraisFormatura> materiaisFormatura) {
        this.materiaisFormatura = materiaisFormatura;
    }
}
