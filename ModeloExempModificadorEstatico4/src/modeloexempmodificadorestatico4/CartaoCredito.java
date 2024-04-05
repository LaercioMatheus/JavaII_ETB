/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloexempmodificadorestatico4;

/**
 *
 * @author Laercio Matheus
 */
public class CartaoCredito {

    private int numero;
    private String dataCriacao;
    private static Double valorDaCompra;
    private TransacaoCartao transacaocartao;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Double getValorDaCompra() {
        return valorDaCompra;
    }

    public void setValorDaCompra(Double valorDaCompra) {
        this.valorDaCompra = valorDaCompra;
    }

    public TransacaoCartao getTransacaocartao() {
        return transacaocartao;
    }

    public void setTransacaocartao(TransacaoCartao transacaocartao) {
        this.transacaocartao = transacaocartao;
    }

    //METODO CONSTRUTOR
    public CartaoCredito(int numero, String dataCriacao, Double valorDaCompra, TransacaoCartao transacaocartao) {
        this.numero = numero;
        this.dataCriacao = dataCriacao;
        this.valorDaCompra = valorDaCompra;
        this.transacaocartao = transacaocartao;
    }
    
    //METODO ABSTRATO
    public static Double saldoParcial() {
        return (Fisica.saldoAtual() - valorDaCompra);
    }

    
    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n INFORMAÇÕES DO CARTÃO DE CREDITO"
                + "\nNumero: " + getNumero()
                + "\nData de ciacao: " + getDataCriacao()
                + "\nValor da compra: " + getValorDaCompra()
                + "\nDados da Transação Cartão: " + getTransacaocartao()
                + "\n Valor do Saldo Parcial: " + saldoParcial();
    }

}
