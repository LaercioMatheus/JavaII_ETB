/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

/**
 *
 * @author Laercio Matheus
 */
public class Fogao extends Eletrodomestico {
    public int qtdBocas;
    public Double largura;

    /**
     * @return the qtdBocas
     */
    public int getQtdBocas() {
        return qtdBocas;
    }

    /**
     * @param qtdBocas the qtdBocas to set
     */
    public void setQtdBocas(int qtdBocas) {
        this.qtdBocas = qtdBocas;
    }

    /**
     * @return the largura
     */
    public Double getLargura() {
        return largura;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(Double largura) {
        this.largura = largura;
    }
    
    //AQUI VAI SER O MÉTODO CONSTRUTOR
    public Fogao (int _numeroSerie, int _peso, String _marca, String _nome, int _qtdBocas, Double _largura) {
        super (_numeroSerie, _peso, _marca, _nome);
        
        this.qtdBocas = _qtdBocas;
        this.largura = _largura;
    }
}
