
package Model;
import java.util.ArrayList;

public abstract class EstoqueDeMateriais {
        protected String nomeMaterial;
	protected String descriçãoMaterial;
	protected double valorDoMaterial;
        
    public String getNomeMaterial() {
        return nomeMaterial;
    }

    public void setNomeMaterial(String nomeMaterial) {
        this.nomeMaterial = nomeMaterial;
    }

    public String getDescriçãoMaterial() {
        return descriçãoMaterial;
    }

    public void setDescriçãoMaterial(String descriçãoMaterial) {
        this.descriçãoMaterial = descriçãoMaterial;
    }

    public double getValorDoMaterial() {
        return valorDoMaterial;
    }

    public void setValorDoMaterial(double valorDoMaterial) {
        this.valorDoMaterial = valorDoMaterial;
    }
}
