package exemploassociacao;

/**
 *
 * @author Laercio Matheus
 */
public class Roda {
    
    public int aro;
    public int qtdParafisos;

    /*GETs E SETs*/
    /**
     * @return the aro
     */
    public int getAro() {
        return aro;
    }

    /**
     * @param aro the aro to set
     */
    public void setAro(int aro) {
        this.aro = aro;
    }

    /**
     * @return the qtdParafisos
     */
    public int getQtdParafisos() {
        return qtdParafisos;
    }

    /**
     * @param qtdParafisos the qtdParafisos to set
     */
    public void setQtdParafisos(int qtdParafisos) {
        this.qtdParafisos = qtdParafisos;
    }
    
    //METODO CONSTRUTOR
    public Roda (int _aro, int _qtdParafusos) {
        this.aro = _aro;
        this.qtdParafisos = _qtdParafusos;
    }
    
    //METODO TOSTRING
    @Override
    public String toString() {
        return "\nNº Aro: " + getAro() + 
                "\nQuantidade de Parafusos: " + getQtdParafisos();
    }
}
