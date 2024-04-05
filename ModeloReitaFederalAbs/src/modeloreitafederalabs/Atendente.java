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
public class Atendente extends Funcionario {

    private String setor;
    private Fisica fisica;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Fisica getFisica() {
        return fisica;
    }

    public void setFisica(Fisica fisica) {
        this.fisica = fisica;
    }

    //METODO CONSTRUTOR
    public Atendente(String setor, Fisica fisica, int matricula, String nome, Double salario, Endereco endereco) {
        super(matricula, nome, salario, endereco);
        this.setor = setor;
        this.fisica = fisica;
    }

    //METODO ABSTRATO LOCAL
    @Override
    public double calculaSalario() {
        return (salario + (salario * 0.15));
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n--- INFORMACOES DO ATENDENTE"
                + "\nNome: " + getNome()
                + "\nSetor: " + getSetor()
                + "\nPessoa Fisica: " + getFisica()
                + "\nMatricula: " + getMatricula()
                + "\nSalario: " + getSalario()
                + "\nEndereco: " + getEndereco()
                + "\nValor do calculo do Salario do Atendente: " + calculaSalario();
    }

}
