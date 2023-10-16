package br.cefetmg.altomare.dto;

public class ContaMonetariaDTO {
    private double valor;
   
    ContaMonetariaDTO() {
        this.valor = 0;
    }
   
    void debitarValor(double quantia) {
        try {
            this.valor+= quantia;
        }
        /*catch (exceção) {
            //processamento
        }*/
    }
   
    double getTotal() {
        return this.valor;
    }
}
