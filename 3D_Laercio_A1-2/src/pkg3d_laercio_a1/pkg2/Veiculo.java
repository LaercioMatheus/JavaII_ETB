/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3d_laercio_a1.pkg2;

/**
 *
 * @author Laercio Matheus
 */
public abstract class Veiculo {

    private String placa;
    protected int ano;
    private String cor;
    protected Double preco;
    Proprietario proprietario;

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Veiculo(String placa, int ano, String cor, Double preco) {
        this.placa = placa;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
    }

    //METODOS ABSTRATOS
    public abstract Double ipva();

    public abstract Double seguro();

}
