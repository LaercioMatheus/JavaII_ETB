package projetomascara;

import org.apache.commons.lang.StringUtils;

public class Pessoa {

    public String cpf;

    //METODOS GETS E SETS
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //METODO CONSTRUTOR
    public Pessoa(String cpf) {
        this.cpf = cpf;
    }

    //METODOS PARA IMPLEMENTAR A MASCARA
    public String formatarCPF() {

        //A MASCARA SEMPRE FORMATA OS DADOS EM CIMA DE UMA STRING
        String cpfCompleto = StringUtils.leftPad(getCpf(), 11, '0');
        return cpfCompleto.substring(0, 3) + "." + cpfCompleto.substring(3, 6) + "." + cpfCompleto.substring(6, 9) + "-" + cpfCompleto.substring(9, 11);
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "Classe Pessoa usando a 'MÁSCARA' para o cpf"
                + "\nCpf sem a MÁSCARA: " + getCpf()
                + "\nCpf com a MÁSCARA: " + formatarCPF();
    }

}
