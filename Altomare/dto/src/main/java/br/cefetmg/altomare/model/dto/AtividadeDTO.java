package br.cefetmg.altomare.model.dto;

public class AtividadeDTO {
    private String nome;
    private String data;
    private String horaInicio;
    private String horaTermino;
    private String local;
    private int limiteOcupacao;
    private String responsavel;
    private String descricao; 
    private boolean visivel;

    public AtividadeDTO(String nome, String data, String horaInicio, String horaTermino, String local, int limiteOcupacao, String responsavel, String descricao, boolean visivel) {
        this.nome = nome;
        this.data = data;
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
        this.local = local;
        this.limiteOcupacao = limiteOcupacao;
        this.responsavel = responsavel;
        this.descricao = descricao;
        this.visivel = visivel;
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

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public boolean isVisivel() {
        return visivel;
    }
    
    public void setVisibilidade(boolean visivel) {
        this.visivel = visivel;
    }
}
