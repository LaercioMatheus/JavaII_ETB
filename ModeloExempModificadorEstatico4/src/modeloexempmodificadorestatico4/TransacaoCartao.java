/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloexempmodificadorestatico4;

/**
 *
 * @author Laercio Matheus
 */
public class TransacaoCartao {

    private int numero;
    protected static Double valor;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    //METODO CONSTRUTOR
    public TransacaoCartao(int numero, Double valor) {
        this.numero = numero;
        this.valor = valor;
    }
    
    //METODO ABTRATO
    public static Double saldoFuturo() {
        return (CartaoCredito.saldoParcial() - valor);
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n INFORMAÇÕES DA Transacao do Cartão"
                + "\nNumero: " + getNumero()
                + "\nValor: " + getValor();
    }

}
