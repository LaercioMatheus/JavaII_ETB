/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturaderepericao03;

/**
 *
 * @author 01
 */
public class EstruturaDeRepericao03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /*        //COMEÇOU; //ENQUANTO>=10; //TIRA 10; 
        for (int cc = 100; cc >= 10 ; cc -= 10) {
            System.out.println("Cambalhota " + cc);
        }
    */  
            //COMEÇOU; //ENQUANTO>=100; //COLOCA 10; 
        for (int cc = 1; cc <= 100 ; cc += 10) {
            System.out.println("Cambalhota " + cc);
        }
    }
    
}
