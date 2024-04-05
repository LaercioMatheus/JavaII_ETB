/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associacao12;

/**
 *
 * @author Laercio Matheus
 */
public class Caminhao {

    public String modelo;
    public String fabricante;
    public Motor motor;
    public Roda roda;
    public Pnel pnel;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Roda getRoda() {
        return roda;
    }

    public void setRoda(Roda roda) {
        this.roda = roda;
    }

    public Pnel getPnel() {
        return pnel;
    }

    public void setPnel(Pnel pnel) {
        this.pnel = pnel;
    }

    //METODO CONSTRUTOR
    public Caminhao(String _modelo, String _fabricante, Motor _motor, Roda _roda, Pnel _pnel) {
        this.modelo = _modelo;
        this.fabricante = _fabricante;
        this.motor = _motor;
        this.roda = _roda;
        this.pnel = _pnel;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n---- INFORMAÇÕES DO CAMINHÃO ----"
                + "\nModelo: " + getModelo()
                + "\nFabricante: " + getFabricante()
                + "\nMotor: " + getMotor()
                + "\nRoda: " + getRoda()
                + "\nPnel: " + getPnel();
    }

}
