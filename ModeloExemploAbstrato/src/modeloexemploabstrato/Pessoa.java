/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloexemploabstrato;

/**
 *
 * @author Laercio Matheus
 */
//CLASSE ABSTRATA 'abstract' É UMA CLASSE SUPER QUE SOMENTE SERVE COMO MODELO PARA AS OUTRAS
public abstract class Pessoa {
    private String nome;
    protected Double gratificacao;
    protected Double salario;    
    Filiacao filiacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(Double gratificacao) {
        this.gratificacao = gratificacao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Filiacao getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(Filiacao filiacao) {
        this.filiacao = filiacao;
    }

    //METODO CONSTRUTOR
    public Pessoa(String nome, Double gratificacao, Double salario, Filiacao filiacao) {
        this.nome = nome;
        this.gratificacao = gratificacao;
        this.salario = salario;
        this.filiacao = filiacao;
    }
    
    //DEFINICAO DO METODO ABSTRATO
    public abstract double salarioFinal();
}
