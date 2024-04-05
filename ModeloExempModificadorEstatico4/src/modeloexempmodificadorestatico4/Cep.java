/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloexempmodificadorestatico4;

/**
 *
 * @author Laercio Matheus
 */
public class Cep {

    private String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    //METODO CONSTRUTOR
    public Cep(String numero) {
        this.numero = numero;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n-- INFORMAÇÕES DO CEP"
                + "\nNumero: " + getNumero();
    }

}
