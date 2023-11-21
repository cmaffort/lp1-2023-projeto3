package br.cefetmg.altomare.model.dto;

public class PedidoTodoDTO {
    
    private String dataCriacao;
    private boolean finalizado;
    private double total;
    private String estado;
    private long idPedidoTodo;
    
    public PedidoTodoDTO() {
        this.dataCriacao = "";
        this.finalizado = false;
        this.total = 0;
        this.estado = "";
    }
    
    public PedidoTodoDTO(String dataCriacao, boolean finalizado, double total, String estado) {
        this.dataCriacao = dataCriacao;
        this.finalizado = finalizado;
        this.total = total;
        this.estado = estado;
    }
    
    public String getDataCriacao() {
        return this.dataCriacao;
    }
    
    public void setDataCriacao(String newDataCriacao) {
        this.dataCriacao = newDataCriacao;
    }
    
    public boolean getStatus() {
        return this.finalizado;
    }
    
    public void setStatus(boolean newStatus) {
        this.finalizado = newStatus;
    }
    
    public double getTotal() {
        return this.total;
    }
    
    public void setTotal(double newTotal) {
        this.total = newTotal;
    }
    
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String newEstado) {
        this.estado = newEstado;
    }
    
    public long getIdPedidoTodo() {
        return this.idPedidoTodo;
    }
    
    public void setIdPedidoTodo(long newIdPedidoTodo) {
        this.idPedidoTodo = newIdPedidoTodo;
    }
}
