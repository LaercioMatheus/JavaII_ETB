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
public class ParaPessoaFisica extends DeclaracaoImposto {

    private Double multa;
    private Dependente dependente;

    public Double getMulta() {
        return multa;
    }

    public void setMulta(Double multa) {
        this.multa = multa;
    }

    public Dependente getDependente() {
        return dependente;
    }

    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
    }

    //METODO CONSTRUTOR
    public ParaPessoaFisica(Double multa, Dependente dependente, int numero, int ano, Double valorDeclaracao, Pagamento pagamento, Bens bens, Deducao deducao) {
        super(numero, ano, valorDeclaracao, pagamento, bens, deducao);
        this.multa = multa;
        this.dependente = dependente;
    }

    //METODOS ABSTRATOS LOCAIS
    public Double calculaParcial() {
        return (valorDeclaracao + Bens.valor + Bens.calculaTarifacao());
    }

    public Double calculaDesconto() {
        return (valorDeclaracao + Pagamento.calculaTaxa() - Deducao.calculaDeducao());
    }

    public Double calculaImpostoPessoaFisica() {
        return (valorDeclaracao + calculaParcial() - calculaDesconto());
    }

    //METODO TOSTRING
    //COMPLETAR O METODO TOSTRING DE ACORDO COM O METODO CONSTRUTOR
    @Override
    public String toString() {
        return "\n--- INFORMAÇÕES DE PARA PESSOA FISICA"
                + "\nMulta: " + getMulta()
                + "\nDependente: " + getDependente()
                + "\nNumero: " + getNumero()
                + "\nAno: " + getAno()
                + "\nValorDeclaracao: " + getValorDeclaracao()
                + "\nPagamento: " + getPagamento()
                + "\nBens: " + getBens()
                + "\nDeducao: " + getDeducao()
                + "\nValor do calculo da Parcela Parcial: " + calculaParcial()
                + "\nValor do calculo do Desconto: " + calculaDesconto()
                + "\nValor do calculo do Imposto para Pessoa Fisica: " + calculaImpostoPessoaFisica();
    }

}
