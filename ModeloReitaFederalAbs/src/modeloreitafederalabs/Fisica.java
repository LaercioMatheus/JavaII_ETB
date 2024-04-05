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
public class Fisica extends Pessoa {

    private String cpf;
    private ParaPessoaFisica parapessoafisica;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ParaPessoaFisica getParapessoafisica() {
        return parapessoafisica;
    }

    public void setParapessoafisica(ParaPessoaFisica parapessoafisica) {
        this.parapessoafisica = parapessoafisica;
    }

    
    //METODO CONSTRUTOR
    public Fisica(String cpf, ParaPessoaFisica parapessoafisica, String nome, Endereco endereco) {
        super(nome, endereco);
        this.cpf = cpf;
        this.parapessoafisica = parapessoafisica;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\nINFORMAÇÕES DE PESSOA FISICA"
                + "\ncpf: " + getCpf()
                + "\nPara pessoa fisica: " + getParapessoafisica();
    }

}
