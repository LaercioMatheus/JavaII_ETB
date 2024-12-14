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
public class Atendente {

    String nome;
    int matricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    //METODO CONSTRUTOR
    public Atendente(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n---- Atendente ----"
                + "\nNome: " + getNome()
                + "\nMatricula: " + getMatricula();
    }

}
