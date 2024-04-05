/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;

/**
 *
 * @author Laercio Matheus
 */
public class Estado {
    public String nome;
    public String UF;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }
    
    
    //METODO CONSTRUTOR
    public Estado(String _nome, String _UF) {
        this.nome = _nome;
        this.UF = _UF;
    }
    
    //METODO TOSTRING
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n-- INFORMAÇÕES DO ESTADO --");
        sb.append("\nNome: ").append(getNome());
        sb.append("\nUF: ").append(getUF());
        return sb.toString();
    }
    
}
