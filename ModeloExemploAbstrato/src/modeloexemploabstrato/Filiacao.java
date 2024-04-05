/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloexemploabstrato;

/**
 *
 * @author Laercio Matheus
 */
public class Filiacao {

    private String nomePai;
    private String nomeMae;

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

    //METODO CONSTRUTOR
    public Filiacao(String nomePai, String nomeMae) {
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n-- INFORMAÇÕES DA FILIAÇÃO --"
                + "\nNomePai: " + getNomePai()
                + "\nNomeMae: " + getNomeMae();
    }

}
