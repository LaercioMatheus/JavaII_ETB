/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3d_laercio_a1.pkg2;

/**
 *
 * @author Laercio Matheus
 */
public class Proprietario {
    private String cpf;
    private String nome;
    private Endereco endereco;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public Proprietario(String cpf, String nome, Endereco endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\n-- INFORMAÇÕES DO PROPRIETARIO --"
                + "\nCPF: " + getCpf()
                + "\nNome: " + getNome()
                + "\nEndereço: " + getEndereco();        
    }    
    
}
