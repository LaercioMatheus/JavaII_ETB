package exemploassociacao;

/**
 *
 * @author Laercio Matheus
 */
public class Veiculo {
    public String placa;
    public String cor;
    //CLASSES SENDO ASSOCIADA POR MEIO DO ATRIBULTO
    public Porta porta;
    public Motor motor;
    public Roda roda;

    /*GETs E SETs*/
    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }
    

    /**
     * @return the porta
     */
    public Porta getPorta() {
        return porta;
    }

    /**
     * @param porta the porta to set
     */
    public void setPorta(Porta porta) {
        this.porta = porta;
    }

    /**
     * @return the motor
     */
    public Motor getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    /**
     * @return the roda
     */
    public Roda getRoda() {
        return roda;
    }

    /**
     * @param roda the roda to set
     */
    public void setRoda(Roda roda) {
        this.roda = roda;
    }
    
    //METODO CONSTRUTOR
    public Veiculo (String _placa, String _cor, Porta _porta, Motor _motor, Roda _roda) {
        this.placa = _placa;
        this.cor = _cor;
        this.porta = _porta;
        this.motor = _motor;
        this.roda = _roda;
    }
    
    //METODO TOSTRING
    @Override
    public String toString() {
        return "\nPlaca: " + getPlaca() +
                "\nCor: " + getCor() + 
                "\nPorta do Veículo: " + getPorta() + 
                "\nMotor: " + getMotor() + 
                "\nRoda: " + getRoda();
    }
}
