/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;

/**
 *
 * @author Laercio Matheus
 */
public class Aluno {

    public String matr;
    public String nome;
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

    public Origem getOrigem() {
        return origem;
    }

    public void setOrigem(Origem origem) {
        this.origem = origem;
    }

    //METODO CONSTRUTOR
    public Aluno(String _matr, String _nome, Origem _origem) {
        this.matr = _matr;
        this.nome = _nome;
        this.origem = _origem;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n-- INFORMAÇÕES DO ALUNO --"
                + "\nMatr: " + getMatr()
                + "\nNome: " + getNome()
                + "\nOrigem: " + getOrigem();
    }

}
