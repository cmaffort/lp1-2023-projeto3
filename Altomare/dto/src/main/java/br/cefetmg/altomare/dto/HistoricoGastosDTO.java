package br.cefetmg.altomare.dto;
import java.util.*;

public class HistoricoGastosDTO {
    private ArrayList<String> historicoProdutosAtividades; //classe Produto futuramente
    private ArrayList<Double> historicoValores;
    private ArrayList<Date> datasAssociadas;
    private int tam;
    
    HistoricoGastosDTO() {
        historicoProdutosAtividades = new ArrayList<>();
        historicoValores = new ArrayList<>();
        datasAssociadas = new ArrayList<>();
        tam = 0;
    }
    
    void adicionaGasto(String produto, double valor, Date data) {
        historicoProdutosAtividades.add(produto);
        historicoValores.add(valor);
        datasAssociadas.add(data);
        tam++;
    }
    
    void imprimeHistorico() {
        for (int i = 0; i < tam; i++)
            System.out.println(i+1 + "o Produto: " + historicoProdutosAtividades.get(i) + " - Valor: " + historicoValores.get(i));
    }
}
