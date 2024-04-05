/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloexemploabstrato;

/**
 *
 * @author Laercio Matheus
 */

//A SINALIZAÇÃO NÃO VAI SAIR ENQUANTO ESSA CLASSE NÃO CONSTRUIR TODOS METODOS ABSTRATOS HERDADOS
public class Professor extends Pessoa {

    private String titulo;
    private String areaAtuacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
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
    public Professor(String titulo, String areaAtuacao, String nome, Double gratificacao, Double salario, Filiacao filiacao) {
        super(nome, gratificacao, salario, filiacao);
        this.titulo = titulo;
        this.areaAtuacao = areaAtuacao;
    }

    //METODO ABSTRATO HERDADO
    @Override
    public double salarioFinal() {
        //RETORNAR O PRODUTO DE UM CALCULO
        return (salario + (salario * 0.1) + gratificacao);
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n-- INFORMAÇÕES DO PROFESSOR --"
                + "\nTitulo: " + getTitulo()
                + "\nArea de Atuação: " + getAreaAtuacao()
                + "\nNome: " + getNome()
                + "\nGratificação: " + getGratificacao()
                + "\nSalário: " + getSalario()
                + "\nFiliação: " + getFiliacao()
                + "\nSalário Final: " + salarioFinal();
    }

}
