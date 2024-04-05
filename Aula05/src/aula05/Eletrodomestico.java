/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

/**
 *
 * @author Laercio Matheus
 */
public class Eletrodomestico {
    
    private int numeroSerie;
    private int peso;
    private String marca;
    private String nome;

    //AQUI VAI SER O MÉTODO CONSTRUTOR DA CLASSE PRINCIPAL (SUPERCLASSE)
    public Eletrodomestico (int _numeroSerie, int _peso, String _marca, String _nome) {
        this.numeroSerie = _numeroSerie;
        this.peso = _peso;
        this.marca = _marca;
        this.nome = _nome;
    }
    
    /**
     * @return the numeroSerie
     */
    public int getNumeroSerie() {
        return numeroSerie;
    }

    /**
     * @param numeroSerie the numeroSerie to set
     */
    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}