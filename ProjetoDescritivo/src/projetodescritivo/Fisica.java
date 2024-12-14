/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetodescritivo;

/**
 *
 * @author 35936x
 */
public class Fisica extends Pessoa {

    private int idFisica;
    private String cpf;
    private Atendente atendente;

    public int getIdFisica() {
        return idFisica;
    }

    public void setIdFisica(int idFisica) {
        this.idFisica = idFisica;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }

    //METODO CONSTRUTOR
    public Fisica(int idFisica, String cpf, Atendente atendente, String nome, int idade) {
        super(nome, idade);
        this.idFisica = idFisica;
        this.cpf = cpf;
        this.atendente = atendente;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n-- Fisica --"
                + "\nNome: " + getNome()
                + "\ncpf: " + getCpf()
                + "\nIdade: " + getIdade()
                + "\nID de pessoa fisica: " + getIdFisica()
                + "\nAtendente: " + getAtendente();
    }

}
