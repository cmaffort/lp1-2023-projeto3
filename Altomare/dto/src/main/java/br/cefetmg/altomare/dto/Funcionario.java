/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.altomare.dto;

/**
 *
 * @author Aluno
 */
public class Funcionario extends Usuario{

    private Double salario;
    private String setor;
    private String dataAdmissao;
    private Double cargaHoraria; //em minutos
    
     Funcionario(Double salario, String setor, String dataAdmissao, Double cargaHoraria){
        super(Long cpf, Long rg, String nome, String dataNascimento, String email, String senha, Long telefone, String sexo, String estadoCivil, String passaporte, String endereço);
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
        this.setor = setor;
        this.dataAdmissao = dataAdmissao;
    }

    public Double getSalario() {
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

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

 
}
