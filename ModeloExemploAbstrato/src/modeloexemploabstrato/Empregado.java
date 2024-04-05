/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloexemploabstrato;

/**
 *
 * @author Laercio Matheus
 */
public class Empregado extends Pessoa {

    private String matricula;
    private String setor;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public Filiacao getFiliacao() {
        return filiacao;
    }

    @Override
    public void setFiliacao(Filiacao filiacao) {
        this.filiacao = filiacao;
    }

    //METODO CONSTRUTOR
    public Empregado(String matricula, String setor, String nome, Double gratificacao, Double salario, Filiacao filiacao) {
        super(nome, gratificacao, salario, filiacao);
        this.matricula = matricula;
        this.setor = setor;
    }

    //METODO ABSTRATO
    @Override
    public double salarioFinal() {
        return (salario + gratificacao);
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n-- INFORMAÇÕES DO EMPREGADO --"
                + "\nMatricula: " + getMatricula()
                + "\nSetor: " + getSetor()
                + "\nNome: " + getNome()
                + "\nGratificação: " + getGratificacao()
                + "\nSalário: " + getSalario()
                + "\nFiliação: " + getFiliacao()
                + "\nSalário Final: " + salarioFinal();
    }

}
