/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloreitafederalabs;

/**
 *
 * @author 35936x
 */
public class Auditor extends Funcionario {

    private Double gratificacao;
    private Auditoria auditoria;

    
    public Double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(Double gratificacao) {
        this.gratificacao = gratificacao;
    }

    public Auditoria getAuditoria() {
        return auditoria;
    }

    public void setAuditoria(Auditoria auditoria) {
        this.auditoria = auditoria;
    }

    //METODO CONSTRUTOR
    public Auditor(Double gratificacao, Auditoria auditoria, int matricula, String nome, Double salario, Endereco endereco) {
        super(matricula, nome, salario, endereco);
        this.gratificacao = gratificacao;
        this.auditoria = auditoria;
    }


    //METODO ABSTRATO
    @Override
    public double calculaSalario() {
        return (salario + (salario * gratificacao) + gratificacao);
    }

    
    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n--- INFORMAÇÕES DO AUDITOR"
                + "\nNome: " + getNome()
                + "\nGratificacao: " + getGratificacao()
                + "\nAuditor: " + getAuditoria()
                + "\nMatricula: " + getMatricula()
                + "\nSalario: " + calculaSalario()
                + "\nSalario: " + getSalario()
                + "\nEndereco: " + getEndereco()
                + "\nValor do calculo do Salario do Auditor: " + calculaSalario();
    }

}
