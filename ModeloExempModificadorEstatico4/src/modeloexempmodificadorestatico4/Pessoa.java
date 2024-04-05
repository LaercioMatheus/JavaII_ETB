/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloexempmodificadorestatico4;

/**
 *
 * @author Laercio Matheus
 */
public abstract class Pessoa {

    protected static Double saldo;
    private String nome;
    private String telefone;
    private Double limite;
    protected static Double valorGasto;
    private Endereco endereco;
    private Conta conta;
    private CartaoCredito cartaocredito;

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Double getValorGasto() {
        return valorGasto;
    }

    public void setValorGasto(Double valorGasto) {
        this.valorGasto = valorGasto;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public CartaoCredito getCartaocredito() {
        return cartaocredito;
    }

    public void setCartaocredito(CartaoCredito cartaocredito) {
        this.cartaocredito = cartaocredito;
    }

    //METODO CONSTRUTOR
    public Pessoa(Double saldo, String nome, String telefone, Double limite, Double valorGasto, Endereco endereco, Conta conta, CartaoCredito cartaocredito) {
        this.saldo = saldo;
        this.nome = nome;
        this.telefone = telefone;
        this.limite = limite;
        this.valorGasto = valorGasto;
        this.endereco = endereco;
        this.conta = conta;
        this.cartaocredito = cartaocredito;
    }

    //METODO TOSTRING COMO ABSTRATO, vai servir como modelo e vai obrigar as outras especies a fazerem esse metodo
    @Override
    public abstract String toString();
    
}
