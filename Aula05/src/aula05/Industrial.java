/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

/**
 *
 * @author Laercio Matheus
 */
public class Industrial extends Fogao {
    
    private Double profundidade;

    /**
     * @return the profundidade
     */
    public Double getProfundidade() {
        return profundidade;
    }

    /**
     * @param profundidade the profundidade to set
     */
    public void setProfundidade(Double profundidade) {
        this.profundidade = profundidade;
    }
    
    //AQUI VAI SER O MÉTODO CONSTRUTOR
    public Industrial(int _numeroSerie, int _peso, String _marca, String _nome, int _qtdBocas, Double _largura, Double _profundidade) {
        super(_numeroSerie, _peso, _marca, _nome, _qtdBocas, _largura);
        
        this.profundidade = _profundidade;
    }
    
    //O MÉTODO STRING TO STRING() {}
    //PARA MOSTRAR AS INFORMAÇÕES
    @Override
    public String toString() {
        return "--- INFORMAÇÕES DO FOGÃO ++INDUSTRIAL++ ---" + 
                "\n Número de Série: " + getNumeroSerie() + 
                "\n Peso: " + getPeso() + "kg" +
                "\n Marca: " + getMarca() + 
                "\n Nome: " + getNome() + 
                "\n Quantidade de bocas: " + getQtdBocas() + " bocas" +
                "\n Largura: " + getLargura() + "cm" +
                "\n Profundidade: " + getProfundidade() + "cm";
    }
}