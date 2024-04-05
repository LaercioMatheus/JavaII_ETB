/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associacao12;

/**
 *
 * @author Laercio Matheus
 */
public class Fornecedor {

    public String cnpj;
    public String nome;

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

    //METODO CONSTRUTOR
    public Fornecedor(String _cnpj, String _nome) {
        this.cnpj = _cnpj;
        this.nome = _nome;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n---- INFORMAÇÕES DO FORNECEDOR ----"
                + "\ncnpj: " + getCnpj()
                + "\nNome: " + getNome();
    }

}
