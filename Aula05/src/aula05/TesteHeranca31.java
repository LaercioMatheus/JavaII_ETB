/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05;

/**
 *
 * @author Laercio Matheus
 */
public class TesteHeranca31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MaquinaLavar maquina = new MaquinaLavar (1592516, 100, "Samsung", "Inverter WW4000", " front load", "Preta");
        
        Televisao tv = new Televisao (3416136, 20, "Philco", "Smart TV QLED", 65, "Smart TV");
        
        Domestico domest = new Domestico (1048688, 50, "Electrolux", "Experience", 5, 76.4, "Bivolt");
        
        Industrial indust = new Industrial (8067195, 210, "Venâncio", "Bravo à Gás", 6, 1.250, 84.6);
        
        System.out.println("Máquina \n" + maquina);        
        System.out.println("\nTelevisão" + tv);        
        System.out.println("\nFogão DOMÉSTICO \n" + domest);        
        System.out.println("\nFogão INDUSTRIAL \n " + indust);
    }
    
}