/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.cefetmg.altomare.model.dto;

import java.util.ArrayList;
import java.util.List;

public class EstoqueDTO {
    private List<ProdutoDTO> produtos;

    public EstoqueDTO() {
        produtos = new ArrayList<>();
    }

    public List<ProdutoDTO> getProdutos() {
        return produtos;
    }

    /*public void adicionarProduto(ProdutoDTO produto) {
        for (ProdutoDTO p : produtos) {
            if (p.getId().equals(produto.getId())) {
                p.adicionarQuantidade(produto.getQuantidade());
                return;
            }
        }
        produtos.add(produto);
    }
*/
    public void removerProduto(ProdutoDTO produto) {
        produtos.remove(produto);
    }
}
