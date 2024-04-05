/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associacao12;

/**
 *
 * @author Laercio Matheus
 */
public class Roda {

    public int diametro;
    public String fabricente;
    public String cor;
    public Parafuso parafuso;

    /**
     * @return the diametro
     */
    public int getDiametro() {
        return diametro;
    }

    /**
     * @param diametro the diametro to set
     */
    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    /**
     * @return the fabricente
     */
    public String getFabricente() {
        return fabricente;
    }

    /**
     * @param fabricente the fabricente to set
     */
    public void setFabricente(String fabricente) {
        this.fabricente = fabricente;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    public Parafuso getParafuso() {
        return parafuso;
    }

    public void setParafuso(Parafuso parafuso) {
        this.parafuso = parafuso;
    }

    //METODO CONSTRUTOR
    public Roda(int _diametro, String _fabricante, String _cor, Parafuso _parafuso) {
        this.diametro = _diametro;
        this.fabricente = _fabricante;
        this.cor = _cor;
        this.parafuso = _parafuso;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\nDiâmetro: " + getDiametro()
                + "\nFabricante: " + getFabricente()
                + "\nCor: " + getCor()
                + "\nParafuso: " + getParafuso();
    }

}
