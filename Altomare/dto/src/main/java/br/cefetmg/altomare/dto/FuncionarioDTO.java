
package br.cefetmg.altomare.dto;


public class FuncionarioDTO extends UsuarioDTO{

    private double salario;
    private String setor;
    private String dataAdmissao;
    private double cargaHoraria; //em minutos
    private String turno;
    
    
     public FuncionarioDTO(double salario, String setor, String dataAdmissao, double cargaHoraria, String turno, String cpf, long rg, String nome, String dataNascimento, String email, String senha, long telefone, String sexo, String estadoCivil){
      super(cpf, rg, nome, dataNascimento, email, senha, telefone, sexo,  estadoCivil);
      this.salario = salario;
      this.setor = setor;
      this.dataAdmissao = dataAdmissao;
      this.cargaHoraria = cargaHoraria;
      this.turno = turno;
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
