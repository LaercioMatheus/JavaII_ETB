package exemploassociacao;

/**
 *
 * @author Laercio Matheus
 */
public class Porta {
    
    public String lado;

    /*GETs E SETs*/
    /**
     * @return the lado
     */
    public String getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(String lado) {
        this.lado = lado;
    }
    
    //METODO CONSTRUTOR
    public Porta(String _lado) {
        this.lado = _lado;
    }
    
    //METODO TOSTRING
    @Override
    public String toString() {
        return "\nLado da porta: " + getLado();
    }
}
