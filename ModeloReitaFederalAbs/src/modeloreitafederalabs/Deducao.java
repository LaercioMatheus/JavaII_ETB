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
public class Deducao {

    private int codigo;
    private String descricao;
    protected static Double valor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    //METODO CONSTRUTOR
    public Deducao(int codigo, String descricao, Double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }

    //METODO ABSTRATO LOCAL
    public static Double calculaDeducao() {
        return (valor * 0.012);
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n-- INFORMAÇÕES DE PAGAMENTO"
                + "\nCodigo: " + getCodigo()
                + "\nDescricao: " + getDescricao()
                + "\nValor: " + getValor()
                + "\nValor do calculo da Dedução: " + calculaDeducao();
    }
}
