
package br.cefetmg.altomare.model.dto;

public class CardapioDTO {
   private String foto;
   private String descricao;
   private String id;
   private String nome;
   private String preco;
   private ProdutoDTO item;
   
   public CardapioDTO(){}
   
   public CardapioDTO(String foto, String descricao, String id, String nome, String preco){
       this.foto = foto;
       this.descricao = descricao;
       this.id = id;
       this.nome = nome;
       this.preco = preco;
   }
   
   public void setItem(ProdutoDTO item){
       this.item = item;
   }
   
   public ProdutoDTO getItem(){
       return item;
   }
   
   public String getId(){
       return id;
   } 
   
   public void setId(String id){
       this.id = id;
   }
   
   public String getDescricao(){
       return descricao;
   }
   
   public void setDescricao(String descricao){
       this.descricao = descricao;
   }
   
   public String getFoto(){
       return foto;
   }
   
   public void setFoto(String foto){
       this.foto = foto;
   }
   
   public String getNome(){
       return nome;
   }
   
   public String getPreco(){
       return preco;
   }
   
   public void setNome(String nome){
       this.nome = nome;
   }
   
    public void setPreco(String preco){
        this.preco = preco;
    }
}
