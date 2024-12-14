/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofisicjuridic;

/**
 *
 * @author 35936x
 */
public class Juridica extends Pessoa {

    String cnpj;
    Atendente atendente;

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

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }

    //METODO CONSTRUTOR
    public Juridica(String cnpj, Atendente atendente, String nome, int idade) {
        super(nome, idade);
        this.cnpj = cnpj;
        this.atendente = atendente;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n---- Pessoa Juridica ----"
                + "\nNome: " + getNome()
                + "\nIdade: " + getIdade()
                + "\nCnpj: " + getCnpj()
                + "\nAtendente: " + getAtendente();
    }

}
