/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloreitafederalabs;

/**
 *
 * @author 35936x
 */
public class DeclaracaoImposto {

    private int numero;
    private int ano;
    protected Double valorDeclaracao;
    private Pagamento pagamento;
    protected Bens bens;
    private Deducao deducao;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Double getValorDeclaracao() {
        return valorDeclaracao;
    }

    public void setValorDeclaracao(Double valorDeclaracao) {
        this.valorDeclaracao = valorDeclaracao;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Bens getBens() {
        return bens;
    }

    public void setBens(Bens bens) {
        this.bens = bens;
    }

    public Deducao getDeducao() {
        return deducao;
    }

    public void setDeducao(Deducao deducao) {
        this.deducao = deducao;
    }

    //METODO CONSTRUTOR
    public DeclaracaoImposto(int numero, int ano, Double valorDeclaracao, Pagamento pagamento, Bens bens, Deducao deducao) {
        this.numero = numero;
        this.ano = ano;
        this.valorDeclaracao = valorDeclaracao;
        this.pagamento = pagamento;
        this.bens = bens;
        this.deducao = deducao;
    }

}
