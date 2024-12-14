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
public class Juridica extends Pessoa {

    private int idJuridica;
    private String cnpj;
    private Atendente atendente;

    public int getIdJuridica() {
        return idJuridica;
    }

    public void setIdJuridica(int idJuridica) {
        this.idJuridica = idJuridica;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }

    //METODO COSNTRUTOR
    public Juridica(int idJuridica, String cnpj, Atendente atendente, String nome, int idade) {
        super(nome, idade);
        this.idJuridica = idJuridica;
        this.cnpj = cnpj;
        this.atendente = atendente;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n-- Juridica --"
                + "\nNome: " + getNome()
                + "\ncpf: " + getCnpj()
                + "\nIdade: " + getIdade()
                + "\nID de pessoa juridica: " + getIdJuridica()
                + "\nAtendente: " + getAtendente();
    }

}
