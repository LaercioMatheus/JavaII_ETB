/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3d_laercio_a1.pkg2;

/**
 *
 * @author Laercio Matheus
 */
public class Moto extends Veiculo {

    private int cilindrada;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    //METODO CONSTRUTOR
    public Moto(int cilindrada, String placa, int ano, String cor, Double preco) {
        super(placa, ano, cor, preco);
        this.cilindrada = cilindrada;
    }

    //METODOS ABSTRATOS
    @Override
    public Double ipva() {
        return (preco * 0.05);
    }

    @Override
    public Double seguro() {
        return (preco * 0.08);
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n-- INFORMAÇÕES DA MOTO --"
                + "\nSeguro: " + seguro()
                + "\nIPVA: " + ipva()
                + "\nCilindrada: " + getCilindrada()
                + "\nPlaca: " + getPlaca()
                + "\nAno: " + getAno()
                + "\nCor: " + getCor()
                + "\nPreço: " + getPreco();
    }

}
