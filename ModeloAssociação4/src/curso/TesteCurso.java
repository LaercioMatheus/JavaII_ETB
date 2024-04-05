/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso;

/**
 *
 * @author Laercio Matheus
 */
public class TesteCurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Disciplina dis = new Disciplina("LTP II", 150,
                new Aluno("65498x", "Laércio Matheus",
                        new Origem("Francisco", "Cristiane",
                                new Cidade("Ceres",
                                        new Estado("Goiás", "GO")))),
                new Professor("12345x", "Paulo da Silva", "Asa Norte",
                        new Aluno("65498x", "Laércio Matheus",
                                new Origem("Francisco", "Cristiane",
                                        new Cidade("Ceres",
                                                new Estado("Goiás", "GO")))),
                        new Origem("Francisco", "Cristiane",        
                                                new Cidade("Ceres",
                                                        new Estado("Goiás", "GO")))));        

        System.out.println(dis);
    }
    
}
