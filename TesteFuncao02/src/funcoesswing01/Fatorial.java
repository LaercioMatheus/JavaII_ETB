/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcoesswing01;

import funcaoswing02.*;

/**
 *
 * @author 01
 */
public class Fatorial {
    
    //ATRIBULTOS
    private int num = 0;
    private int fat = 1;
    private String formula = "";
    
    // MÉTODO SETVALOR
    public void setValor(int n) {
        num = n;
        int f = 1;
        String s = "";
        for (int c = n; c > 1; c--) {
            f *= c;
            s += c + " x ";
        }
        s += "1 = ";
        fat = f;
        formula = s;
    }
    
    //MÉTODO GETFATORIAL
    public int getFatorial() {
        return fat;
    }
    
    //MÉTODO GETFORMULA
    public String getFormula() {
        return formula;
    }
}
