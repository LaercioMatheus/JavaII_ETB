package projetopesscrudmasc;

import org.apache.commons.lang.StringUtils;

public class Pessoa {

    public int id;
    public String nome;
    public String cpf;
    public int idade;
    public int telefone;

    //METODOS GETS E SETS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /*METODO CONSTRUTOR
    public Pessoa(int id, String nome, String cpf, int idade, int telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }*/
    //METODOS PARA IMPLEMENTAR A MASCARA
    //FORMAANDO O CPF
    public String formatarCPF() {

        //A MASCARA SEMPRE FORMATA OS DADOS EM CIMA DE UMA STRING
        String cpfCompleto = StringUtils.leftPad(getCpf(), 11, '0');
        return cpfCompleto.substring(0, 3) + "." + cpfCompleto.substring(3, 6) + "." + cpfCompleto.substring(6, 9) + "-" + cpfCompleto.substring(9, 11);
    }

    //FORMATANDO O TELEFONE
    public String FormatarTele() {

        String phone = Integer.toString(getTelefone());
        return "(61)" + phone.substring(0, 5) + "-" + phone.substring(5, 9);
        
        /**
     * Para formatar o ddd basta retirar o "(61)" e substituir por: phone.substring(0,1)
     * É necessário importar o pacote: import org.apache.commons.lang.StringUtils;
     *
     */
    }
    
    
    //METODO TOSTRING
    @Override
    public String toString() {
        return "\n-- INFORMAÇÕES DE PESSOA"
                + "\nId: " + getId()
                + "\nNome: " + getNome()
                + "\nCpf: " + formatarCPF()
                + "\nIdade: " + getIdade()
                + "\nTelefone: " + FormatarTele();
    }

}
