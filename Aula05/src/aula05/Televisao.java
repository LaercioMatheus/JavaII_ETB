/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

/**
 *
 * @author Laercio Matheus
 */
public class Televisao extends Eletrodomestico {
    
    private int polegadas;
    private String tipo;

    /**
     * @return the polegadas
     */
    public int getPolegadas() {
        return polegadas;
    }

    /**
     * @param polegadas the polegadas to set
     */
    public void setPolegadas(int polegadas) {
        this.polegadas = polegadas;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //AQUI VAI SER O MÉTODO CONSTRUTOR
    public Televisao (int _numeroSerie, int _peso, String _marca, String _nome, int _polegadas, String _tipo) {
        super (_numeroSerie, _peso, _marca, _nome);
        
        this.polegadas = _polegadas;
        this.tipo = _tipo;
    }
    
    //O MÉTODO STRING TO STRING() {}
    //PARA MOSTRAR AS INFORMAÇÕES
    @Override
    public String toString() {
        return "--- INFORMAÇÕES DA TELEVISÃO ---" + 
                "\n Número de Série: " + getNumeroSerie() + 
                "\n Peso: " + getPeso() + "kg" +
                "\n Marca: " + getMarca() + 
                "\n Nome: " + getNome() + 
                "\n Polegadas: " + getPolegadas() + "'" +
                "\n Tipo: " + getTipo();
    }
}