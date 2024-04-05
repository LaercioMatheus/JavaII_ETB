/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;

/**
 *
 * @author Laercio Matheus
 */
public class Disciplina {

    public String nome;
    public int cargaHoraria;
    public Aluno aluno;
    public Professor professor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    //METODO CONSTRUTOR
    public Disciplina(String _nome, int _cargaHoraria, Aluno _aluno, Professor _professor) {
        this.nome = _nome;
        this.cargaHoraria = _cargaHoraria;
        this.aluno = _aluno;
        this.professor = _professor;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "-- INFORMAÇÕES DA DISCIPLINA --"
                + "\nNome: " + getNome()
                + "\nCarga Horária: " + getCargaHoraria()
                + "\nAluno: " + getAluno()
                + "\nProfessor: " + getProfessor();
    }

}
