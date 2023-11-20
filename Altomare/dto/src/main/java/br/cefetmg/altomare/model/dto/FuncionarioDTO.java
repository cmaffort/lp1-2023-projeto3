
package br.cefetmg.altomare.model.dto;


public class FuncionarioDTO extends UsuarioDTO{

    private double salario;
    private String setor;
    private String dataAdmissao;
    private double cargaHoraria; //em minutos
    private String turno;
    
     public FuncionarioDTO(String turno, double salario, String setor, String dataAdmissao, double cargaHoraria,String cpf, String rg, String nome, String dataNascimento, String email, String senha, String telefone, String sexo, String estadoCivil, String foto){
        super(cpf, rg, nome, dataNascimento, email, senha, telefone, sexo, estadoCivil, foto);
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
        this.setor = setor;
        this.dataAdmissao = dataAdmissao;
        this.turno = turno;
    }

    public FuncionarioDTO() {
        super("", "", "", "", "", "" , "", "", "", "");
        this.salario = 0.0;
        this.cargaHoraria = 0.0;
        this.setor = "";
        this.dataAdmissao = "";
        this.turno = "";
       
    }
 
    public String getTurno(){
        return turno;
    }
    
    public void setTurno(String turno){
        this.turno = turno;
    }
    

    public double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
 
}
