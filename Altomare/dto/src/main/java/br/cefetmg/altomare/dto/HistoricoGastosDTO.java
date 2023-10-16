package br.cefetmg.altomare.dto;
import java.util.*;

public class HistoricoGastosDTO {
    private ArrayList<String> historicoProdutos; //classe Produto futuramente
    private ArrayList<Double> historicoValores;
    private int tam;
    
    HistoricoGastosDTO() {
        historicoProdutos = new ArrayList<>();
        historicoValores = new ArrayList<>();
        tam = 0;
    }
    
    void adicionaGasto(String produto, double valor) {
        historicoProdutos.add(produto);
        historicoValores.add(valor);
        tam++;
    }
    
    void imprimeHistorico() {
        for (int i = 0; i < tam; i++)
            System.out.println(i+1 + "o Produto: " + historicoProdutos.get(i) + " - Valor: " + historicoValores.get(i));
    }
}
