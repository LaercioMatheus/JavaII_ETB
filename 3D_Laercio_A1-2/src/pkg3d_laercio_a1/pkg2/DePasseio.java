/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3d_laercio_a1.pkg2;

/**
 *
 * @author Laercio Matheus
 */
public class DePasseio extends Veiculo {

    private String marca;
    private String descricao;
    Montadora montadora;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }

    @Override
    public int getAno() {
        return ano;
    }

    @Override
    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public Double getPreco() {
        return preco;
    }

    @Override
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public Proprietario getProprietario() {
        return proprietario;
    }

    @Override
    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    //METODO CONSTRUTOR
    public DePasseio(String marca, String descricao, Montadora montadora, String placa, int ano, String cor, Double preco) {
        super(placa, ano, cor, preco);
        this.marca = marca;
        this.descricao = descricao;
        this.montadora = montadora;
    }

    //METODOS ABSTRATOS
    @Override
    public Double ipva() {
        return (preco * 0.03);
    }

    @Override
    public Double seguro() {
        return (preco * 0.015);
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n-- INFORMAÇÕES DO VEICULO DE PASSEIO"
                + "\nSeguro: " + seguro()
                + "\nIPVA: " + ipva()
                + "\nMarca: " + getMarca()
                + "\nDescrição: " + getDescricao()
                + "\nMontadora: " + getMontadora()
                + "\nPlaca: " + getPlaca()
                + "\nAno: " + getAno()
                + "\nCor: " + getCor()
                + "\nPreço: " + getPreco();
    }

}
