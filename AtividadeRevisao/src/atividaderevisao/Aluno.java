/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividaderevisao;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.lang.StringUtils;

/**
 *
 * @author 35936x
 */
public class Aluno extends Pessoa {

    private int id;
    private String matricula;
    private String turma;
    private Date dataCadastro;
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private int telefone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Aluno() {

    }

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
         * Para formatar o ddd basta retirar o "(61)" e substituir por:
         * phone.substring(0,1) É necessário importar o pacote: import
         * org.apache.commons.lang.StringUtils;
         *
         */
    }

    //METODO CONSTRUTOR
    public Aluno(int id, String matricula, String turma, Date dataCadastro, int telefone, String nome, String cpf, int idade) {
        super(nome, cpf, idade);
        this.id = id;
        this.matricula = matricula;
        this.turma = turma;
        this.dataCadastro = dataCadastro;
        this.telefone = telefone;
    }

}
