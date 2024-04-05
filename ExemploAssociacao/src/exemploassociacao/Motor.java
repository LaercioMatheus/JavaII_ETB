/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploassociacao;

/**
 *
 * @author Laercio Matheus
 */
public class Motor {
    
    public Double potencia;
    public String tipoCombustivel;

    /*GETs E SETs*/
    /**
     * @return the potencia
     */
    public Double getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }

    /**
     * @return the tipoCombustivel
     */
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    /**
     * @param tipoCombustivel the tipoCombustivel to set
     */
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    
    //METODO CONSTRUTOR
    public Motor (Double _potencia, String _tipoCombustivel) {
            this.potencia = _potencia;
            this.tipoCombustivel = _tipoCombustivel;
    }
    
    //METODO TOSTRING
    @Override
    public String toString() {
        return "\nPotência: " + getPotencia() + 
                "\nTipo de Combustível: " + getTipoCombustivel();
    }
}
