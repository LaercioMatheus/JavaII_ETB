/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3d_laercio_a1.pkg2;

/**
 *
 * @author Laercio Matheus
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
    public Endereco(String _rua, int _numero) {
        this.rua = _rua;
        this.numero = _numero;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n-- INFORMAÇÕES DO Endereco --"
                + "\nRua: " + getRua()
                + "\nNúmero: " + getNumero();
    }

}