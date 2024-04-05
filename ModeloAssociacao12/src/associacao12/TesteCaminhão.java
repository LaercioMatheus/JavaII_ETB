/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package associacao12;

/**
 *
 * @author Laercio Matheus
 */
public class TesteCaminhão {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Caminhao cam = new Caminhao("Scania R540", "Scania",
                new Motor(660, 600, "Diesel/Biodiesel",
                    new Parafuso("m16 x 107mm", "Aço",
                            new Fornecedor("159.358.668/845", "Fábio dos Santos"))),
                new Roda(825, "Dhaer", "Prateada",
                        new Parafuso("25mm", "Aço",
                                new Fornecedor("766.454.356/573", "Ricardo Cardoso"))),
                new Pnel(295, "Pirelli",
                        new Fornecedor("058.697.359/457", "Marcos Rodrigues")));
        
        System.out.println(cam);
    }
    
}
