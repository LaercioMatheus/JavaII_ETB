/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

/**
 *
 * @author Laercio Matheus
 */
public class MaquinaLavar extends Eletrodomestico {
    
    public String tipo;
    public String cor;

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

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    //AQUI VAI SER O METODO CONSTRUTOR
    public MaquinaLavar (int _numeroSerie, int _peso, String _marca, String _nome, String _tipo, String _cor) {
        super (_numeroSerie, _peso, _marca, _nome);
        this.tipo = _tipo;
        this.cor = _cor;
    }
    
    //O MÉTODO STRING TO STRING() {}
    //PARA MOSTRAR AS INFORMAÇÕES
    @Override
    public String toString() {
        return "--- INFORMAÇÕES DA MÁQUINA DE LAVAR ---" + 
                "\n Número de Série: " + getNumeroSerie() + 
                "\n Peso: " + getPeso() + "kg" +
                "\n Marca: " + getMarca() +
                "\n Nome: " + getNome() +
                "\n Tipo: " + getTipo() + 
                "\n Cor: " + getCor();
    }
}
