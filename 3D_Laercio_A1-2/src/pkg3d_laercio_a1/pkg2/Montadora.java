/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3d_laercio_a1.pkg2;

/**
 *
 * @author Laercio Matheus
 */
public class Montadora {

    private String cnpj;
    private String nome;
    private Endereco endereco;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    //METODO CONSTRUTOR
    public Montadora(String _cnpj, String _nome, Endereco _endereco) {
        this.cnpj = _cnpj;
        this.nome = _nome;
        this.endereco = _endereco;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n-- INFORMAÇÕES DA MONTADORA --"
                + "\nCNPJ: " + getCnpj()
                + "\nNome: " + getNome()
                + "\nEndereço: " + getEndereco();
    }

}