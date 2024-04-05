/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloexempmodificadorestatico4;

/**
 *
 * @author Laercio Matheus
 */
public class Fisica extends Pessoa {

    private String Cpf;

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public Fisica(String Cpf, Double saldo, String nome, String telefone, Double limite, Double valorGasto, Endereco endereco, Conta conta, CartaoCredito cartaocredito) {
        super(saldo, nome, telefone, limite, valorGasto, endereco, conta, cartaocredito);
        this.Cpf = Cpf;
    }
    
    //METODO ABSTRATO LOCAL QUE VAI SER SOMENTE DA CLASSE FISICA
    //*****TODO METODO STATICO EXIGE QUE SUAS VARIAVEIS SEJAM STATICAS TAMBEM****
    public static Double saldoAtual() {
        return (saldo - valorGasto);
    }

    @Override
    public String toString() {
        return "\n INFORMAÇÕES DE PESSOA FISICA"
                + "\nNome: " + getNome()
                + "\nCpf: " + getCpf()
                + "\nSaldo: " + getSaldo()                
                + "\nTelefone: " + getTelefone()
                + "\nLimite financeiro: " + getLimite()
                + "\nValor Gasto: " + getValorGasto()
                + "\nDados do Endereco de Pessoa Fisica: " + getEndereco()
                + "\nDados da Conta de Pessoa Fisica: " + getConta()
                + "\nDados Cartao de Credito de Pessoa Fisica: " + getCartaocredito()
                + "\nValor do Saldo Atual: " + saldoAtual();
    }

}
