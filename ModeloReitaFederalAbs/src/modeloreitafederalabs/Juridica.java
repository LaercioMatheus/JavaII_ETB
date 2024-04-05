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
public class Juridica extends Pessoa {

    private String cnpj;
    private ParaPessoaJuridica parapessoajuridica;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ParaPessoaJuridica getParapessoajuridica() {
        return parapessoajuridica;
    }

    public void setParapessoajuridica(ParaPessoaJuridica parapessoajuridica) {
        this.parapessoajuridica = parapessoajuridica;
    }

    public Juridica(String cnpj, ParaPessoaJuridica parapessoajuridica, String nome, Endereco endereco) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.parapessoajuridica = parapessoajuridica;
    }

    @Override
    public String toString() {
        return "\nINFORMAÇÕES DA PESSOA JURIDICA"
                + "\nCnpj: " + getCnpj()
                + "\nPara pessoa jurdica: " + getParapessoajuridica();
    }

}
