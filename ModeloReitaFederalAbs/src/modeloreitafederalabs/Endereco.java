/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloreitafederalabs;

/**
 *
 * @author 35936x
 */
public class Endereco {

    private String rua;
    private int numero;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //METODO CONSTRUTOR
    public Endereco(String rua, int numero) {
        this.rua = rua;
        this.numero = numero;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n--- INFORMAÇÕES DO ENDERECO"
                + "\nRua: " + getRua()
                + "\nNumero: " + getNumero();
    }

}
