/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associacao12;

/**
 *
 * @author Laercio Matheus
 */
public class Motor {

    public int potencia;
    public int cilindrada;
    public String tipoCombustivel;
    public Parafuso parafuso;

    /**
     * @return the potencia
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    /**
     * @return the cilindrada
     */
    public int getCilindrada() {
        return cilindrada;
    }

    /**
     * @param cilindrada the cilindrada to set
     */
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
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

    public Parafuso getParafuso() {
        return parafuso;
    }

    public void setParafuso(Parafuso parafuso) {
        this.parafuso = parafuso;
    }

    //METODO CONSTRUTOR
    public Motor(int _potencia, int _cilindrada, String _tipoCombustivel, Parafuso _parafuso) {
        this.potencia = _potencia;
        this.cilindrada = _cilindrada;
        this.tipoCombustivel = _tipoCombustivel;
        this.parafuso = _parafuso;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\nPotência do motor: " + getPotencia()
                + "\nCilindrada do motor: " + getCilindrada()
                + "\nO tipo de combustível: " + getTipoCombustivel()
                + "\nParafuso: " + getParafuso();
    }

}
