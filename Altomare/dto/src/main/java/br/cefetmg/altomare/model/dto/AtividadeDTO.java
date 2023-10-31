package br.cefetmg.altomare.model.dto;
import br.cefetmg.altomare.model.dto.FuncionarioDTO;

public class AtividadeDTO {
    
    
    private String nome;
    private String data;
    private String horaInicio;
    private String horaTermino;
    private String local;
    private int limiteOcupacao;
    private FuncionarioDTO responsavel;
    private String descricao;   

    public AtividadeDTO(String nome, String data, String horaInicio, String horaTermino, String local, int limiteOcupacao, String descricao) {
        this.nome = nome;
        this.data = data;
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
        this.local = local;
        this.limiteOcupacao = limiteOcupacao;
        this.responsavel = responsavel;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraTermino() {
        return horaTermino;
    }

    public void setHoraTermino(String horaTermino) {
        this.horaTermino = horaTermino;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getLimiteOcupacao() {
        return limiteOcupacao;
    }

    public void setLimiteOcupacao(int limiteOcupacao) {
        this.limiteOcupacao = limiteOcupacao;
    }

    public FuncionarioDTO getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(FuncionarioDTO responsavel) {
        this.responsavel = responsavel;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
