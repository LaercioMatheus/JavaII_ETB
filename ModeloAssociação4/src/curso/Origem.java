/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;

/**
 *
 * @author Laercio Matheus
 */
public class Origem {

    public String nomePai;
    public String nomeMae;
    public Cidade cidade;

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    //METODO CONSTRUTOR
    public Origem(String _nomePai, String _nomeMae, Cidade _cidade) {
        this.nomePai = _nomePai;
        this.nomeMae = _nomeMae;
        this.cidade = _cidade;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n-- INFORMAÇÕES ORIGEM --"
                + "\nNome Pai: " + getNomePai()
                + "\nNome Mae: " + getNomeMae()
                + "\nCidade: " + getCidade();
    }

}
