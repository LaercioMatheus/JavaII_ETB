/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

/**
 *
 * @author Laercio Matheus
 */
public class Domestico extends Fogao {
    private String tipo;
    

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
    public Domestico(int _numeroSerie, int _peso, String _marca, String _nome, int _qtdBocas, Double _largura, String _tipo) {
        super(_numeroSerie, _peso, _marca, _nome, _qtdBocas, _largura);
        
        this.tipo = _tipo;
    }
    
    //O MÉTODO STRING TO STRING() {}
    //PARA MOSTRAR AS INFORMAÇÕES
    @Override
    public String toString() {
        return "----- INFORMAÇÕES DO FOGÃO +++DOMÉSTICO+++ -----" + 
                "\n Número de Série: " + getNumeroSerie() + 
                "\n Peso: " + getPeso() + "kg" +
                "\n Marca: " + getMarca() + 
                "\n Nome: " + getNome() + 
                "\n Quantidade de bocas: " + getQtdBocas() + " bocas" +
                "\n Largura: " + getLargura() + "cm" +
                "\n Tipo: " + getTipo();
    }
}
