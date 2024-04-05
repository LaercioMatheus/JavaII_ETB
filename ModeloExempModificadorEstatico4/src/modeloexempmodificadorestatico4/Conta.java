/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloexempmodificadorestatico4;

/**
 *
 * @author Laercio Matheus
 */
public class Conta {

    private int numConta;
    private Double saldo;
    private Agencia agencia;
    private Transacao transacao;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Transacao getTransacao() {
        return transacao;
    }

    public void setTransacao(Transacao transacao) {
        this.transacao = transacao;
    }

    //METODO CONSTRUTOR
    public Conta(int numConta, Double saldo, Agencia agencia, Transacao transacao) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.agencia = agencia;
        this.transacao = transacao;
    }
    
    //METODO ABSTRATO
    public Double saldoConta() {
        return (TransacaoCartao.saldoFuturo() - TransacaoCartao.valor);
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n INFORMAÇÕES DA CONTA"
                + "\nNumero da Conta: " + getNumConta()
                + "\nSaldo: " + getSaldo()
                + "\nDados de Agencia da Conta: " + getAgencia()
                + "\nDados de Transacao da Conta: " + getTransacao();
    }

}
