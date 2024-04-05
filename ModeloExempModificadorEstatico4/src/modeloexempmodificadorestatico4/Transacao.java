/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloexempmodificadorestatico4;

/**
 *
 * @author Laercio Matheus
 */
public class Transacao {

    private String tipo;
    private Double valorTransacao;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getValorTransacao() {
        return valorTransacao;
    }

    public void setValorTransacao(Double valorTransacao) {
        this.valorTransacao = valorTransacao;
    }

    //METODO CONSTRUTOR
    public Transacao(String tipo, Double valorTransacao) {
        this.tipo = tipo;
        this.valorTransacao = valorTransacao;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n INFORMAÇÕES DA TRANSACAO"
                + "\nTipo: " + getTipo()
                + "\nValor da transação: " + getValorTransacao();
    }

}