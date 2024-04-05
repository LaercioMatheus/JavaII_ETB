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
public class Auditoria {

    private int numero;
    private String data;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    //METODO CONSTRUTOR
    public Auditoria(int numero, String data) {
        this.numero = numero;
        this.data = data;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n--- INFORMAÇÕES DE AUDITORIA"
                + "\nNumero: " + getNumero()
                + "\nData: " + getData();
    }

}
