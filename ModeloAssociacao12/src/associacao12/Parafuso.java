/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associacao12;

/**
 *
 * @author Laercio Matheus
 */
public class Parafuso {

    public String tamanho;
    public String tipoMaterial;
    public Fornecedor fornecedor;

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    //METODO CONSTRUTOR
    public Parafuso(String _tamanho, String _tipoMaterial, Fornecedor _fornecedor) {
        this.tamanho = _tamanho;
        this.tipoMaterial = _tipoMaterial;
        this.fornecedor = _fornecedor;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n---- INFORMAÇÕES DO PARAFUSO ----"
                + "\nTamanho: " + getTamanho()
                + "\nTipoMaterial: " + getTipoMaterial()
                + "\nFornecedor: " + getFornecedor();
    }

}
