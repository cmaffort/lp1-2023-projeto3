/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.altomare.dto;

/**
 *
 * @author Aluno
 */
public class FuncionarioDTO extends UsuarioDTO{

    private double salario;
    private String setor;
    private String dataAdmissao;
    private double cargaHoraria; //em minutos
    private String turno;
    private String id;//primeiros 3 e os dois ultimos numeros do cpf
    
     public FuncionarioDTO(String turno, double salario, String setor, String dataAdmissao, double cargaHoraria,String cpf, long rg, String nome, String dataNascimento, String email, String senha, long telefone, String sexo, String estadoCivil, String passaporte, String endereco){
        super(cpf, rg, nome, dataNascimento, email, senha, telefone, sexo, estadoCivil, passaporte, endereco);
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
        this.setor = setor;
        this.dataAdmissao = dataAdmissao;
        this.turno = turno;
        id = montaId(cpf);
        
    }
     
    private String montaId(String cpf){
	char[] numIndice = new char[5];
	String str = "";
	
	cpf.getChars(0, 3, numIndice, 0);
        cpf.getChars(9, 11, numIndice, 3);
    
        for(int i=0; i<5; i++){
           str += numIndice[i];
         }
        
        return str;
    }

    public String getTurno(){
        return turno;
    }
    
    public void setTurno(String turno){
        this.turno = turno;
    }
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
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
