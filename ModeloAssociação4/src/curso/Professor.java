/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;

/**
 *
 * @author Laercio Matheus
 */
public class Professor {

    public String matr;
    public String nome;
    public String endereco;
    public Aluno aluno;
    public Origem origem;

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Origem getOrigem() {
        return origem;
    }

    public void setOrigem(Origem origem) {
        this.origem = origem;
    }

    //METODO CONSTRUTOR
    public Professor(String _matr, String _nome, String _endereco, Aluno _aluno, Origem _origem) {
        this.matr = _matr;
        this.nome = _nome;
        this.endereco = _endereco;
        this.aluno = _aluno;
        this.origem = _origem;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n-- INFORMAÇÕES DO PROFESSOR --"
                + "\nMatrícula: " + getMatr()
                + "\nNome: " + getNome()
                + "\nEndereco: " + getEndereco()
                + "\nAluno: " + getAluno()
                + "\nOrigem: " + getOrigem();
    }

}
