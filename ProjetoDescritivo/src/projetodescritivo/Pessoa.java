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
public class Pessoa {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //METODO CONSTRUTOR
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

}
