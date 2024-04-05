/*  
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;

/**
 *
 * @author Laercio Matheus
 */
public class Cidade {

    public String nome;
    public Estado estado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    //METODO CONSTRUTOR
    public Cidade(String _nome, Estado _estado) {
        this.nome = _nome;
        this.estado = _estado;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n-- INFORMAÇÕES DA CIDADE --"
                + "\nNome: " + getNome()
                + "\nEstado: " + getEstado();
    }

}
