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
public class ParaPessoaJuridica extends DeclaracaoImposto {

    private String observacao;

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    //METODO CONSTRUTOR
    public ParaPessoaJuridica(String observacao, int numero, int ano, Double valorDeclaracao, Pagamento pagamento, Bens bens, Deducao deducao) {
        super(numero, ano, valorDeclaracao, pagamento, bens, deducao);
        this.observacao = observacao;
    }

    //METODOS ABSTRATOS LOCAIS
    public Double calculaParcial() {
        return (valorDeclaracao + (Bens.valor * 2) + Bens.calculaTarifacao());
    }

    public Double calculaImpostoPessoaJuridica() {
        return (calculaParcial() - Deducao.calculaDeducao() + Pagamento.valor + valorDeclaracao);
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n--- INFORMAÇÕES DE PESSOA JURIDICA"
                + "\nNumero: " + getNumero()
                + "\nAno: " + getAno()
                + "\nValorDeclaracao: " + getValorDeclaracao()
                + "\nPagamento: " + getPagamento()
                + "\nBens: " + getBens()
                + "\nObservacao: " + getObservacao()
                + "\nDeducao: " + getDeducao()
                + "\nValor do calculo da parcela Parcial: " + calculaParcial()
                + "\nValor do calculo do Imposto para Pessoa Juridica: " + calculaImpostoPessoaJuridica();
    }

}
