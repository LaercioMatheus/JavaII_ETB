/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associacao12;

/**
 *
 * @author Laercio Matheus
 */
public class Pnel {
    public int diametro;
    public String fabricante;
    public Fornecedor fornecedor;

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    //METODO CONSTRUTOR
    public Pnel(int _diametro, String _fabricante, Fornecedor _fornecedor) {
        this.diametro = _diametro;
        this.fabricante = _fabricante;
        this.fornecedor = _fornecedor;
    }
    
    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n---- INFORMAÇÕES DO PNEL ----"
            + "\nDiametro: " + getDiametro()
            + "\nFabricante: " + getFabricante()
            + "\nFornecedor: " + getFornecedor();
    }

}
