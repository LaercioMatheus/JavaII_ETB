/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;

/**
 *
 * @author Laercio Matheus
 */
public class Curso {

    public String nome;
    public int qtdSemestre;
    public int cargaHoraria;
    public Disciplina disciplina;
    public Aluno aluno;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdSemestre() {
        return qtdSemestre;
    }

    public void setQtdSemestre(int qtdSemestre) {
        this.qtdSemestre = qtdSemestre;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    //METODO CONSTRUTOR
    public Curso(String _nome, int _qtdSemestre, int _cargaHoraria, Disciplina _disciplina, Aluno _aluno) {
        this.nome = _nome;
        this.qtdSemestre = _qtdSemestre;
        this.cargaHoraria = _cargaHoraria;
        this.disciplina = _disciplina;
        this.aluno = _aluno;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n-- INFORMAÇÕES DO ALUNO --"
                + "\nNome: " + getNome()
                + "Quantidade de Semestres: " + getQtdSemestre()
                + "\nCarga Horaria: " + getCargaHoraria()
                + "\nDisciplina: " + getDisciplina()
                + "\nAluno: " + getAluno();
    }

}
