/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3d_laercio_a1.pkg2;

/**
 *
 * @author Laercio Matheus
 */
public class Onibus extends Veiculo {

    private int qtdPassageiros;
    Montadora montadora;

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
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
    public Onibus(int qtdPassageiros, Montadora montadora, String placa, int ano, String cor, Double preco) {
        super(placa, ano, cor, preco);
        this.qtdPassageiros = qtdPassageiros;
        this.montadora = montadora;
    }

    //METODOS ABSTRATOS
    @Override
    public Double ipva() {
        return (preco * 0.05);
    }

    @Override
    public Double seguro() {
        return (preco * 0.025);
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n-- INFORMAÇÕES DO Ônibus"
                + "\nSeguro: " + seguro()
                + "\nIPVA: " + ipva()
                + "\nQuantidade de Passageiros: " + getQtdPassageiros()
                + "\nMontadora: " + getMontadora()
                + "\nPlaca: " + getPlaca()
                + "\nAno: " + getAno()
                + "\nCor: " + getCor()
                + "\nPreço: " + getPreco();
    }

}
