/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloexempmodificadorestatico4;

/**
 *
 * @author Laercio Matheus
 */
public class Endereco {

    private String rua;
    private int numero;
    private Cep cep;

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

    public Cep getCep() {
        return cep;
    }

    public void setCep(Cep cep) {
        this.cep = cep;
    }

    //METODO CONSTRUTOR
    public Endereco(String rua, int numero, Cep cep) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n INFORMAÇÕES DO ENDERECO"
                + "\nRua: " + getRua()
                + "\nNumero: " + getNumero()
                + "\nCep do Endereço: " + getCep();
    }

}