/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloexempmodificadorestatico4;

/**
 *
 * @author Laercio Matheus
 */
public class Agencia {

    private int numAgencia;
    private String nome;

    public int getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //METODO CONSTRUTOR
    public Agencia(int numAgencia, String nome) {
        this.numAgencia = numAgencia;
        this.nome = nome;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n INFORMAÇÕES DA AGENCIA"
                + "\nNumero da Agencia: " + getNumAgencia()
                + "\nNome: " + getNome();
    }

}