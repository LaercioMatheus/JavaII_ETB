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
public class Atendente {

    private int IdAtendente;
    private String nome;

    public int getIdAtendente() {
        return IdAtendente;
    }

    public void setIdAtendente(int IdAtendente) {
        this.IdAtendente = IdAtendente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //METODO CONSTRUTOR
    public Atendente(int IdAtendente, String nome) {
        this.IdAtendente = IdAtendente;
        this.nome = nome;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n-- Atendente --"
                + "\nID do Atendente: " + getIdAtendente()
                + "\nNome: " + getNome();
    }

}
