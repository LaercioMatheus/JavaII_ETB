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
public class Fisica extends Pessoa {

    String cpf;
    Atendente atendente;

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
    public Fisica(String cpf, Atendente atendente, String nome, int idade) {
        super(nome, idade);
        this.cpf = cpf;
        this.atendente = atendente;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n---- Pessoa Fisica ----"
                + "\nNome: " + getNome()
                + "\nIdade: " + getIdade()
                + "\nCpf: " + getCpf()
                + "\nAtendente: " + getAtendente();
    }

}
