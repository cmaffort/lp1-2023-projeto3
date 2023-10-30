package br.cefetmg.altomare.service;

import br.cefetmg.altomare.dao.mysql.ContaUsuarioDAO;
import br.cefetmg.altomare.dto.ContaUsuarioDTO;
import br.cefetmg.altomare.dto.DespesaDTO;
import java.util.*;

public class GetDespesasToView {
    private ArrayList<DespesaDTO> despesas;
    
    GetDespesasToView(ArrayList<DespesaDTO> despesas) {
        this.despesas = despesas;
    }
    
    public ArrayList<DespesaDTO> getDespesas() {
        return despesas;
    }
    
    public void ordenaDespesasPorData() {
        for (int i = 0; i < despesas.size(); i++) {
            for (int j = i+1; j < despesas.size(); j++) {
                if (despesas.get(i).getDataOcorrencia().before(despesas.get(j).getDataOcorrencia())) {
                    despesas.add(i, despesas.get(j));
                    despesas.remove(i+1);
                }
            }
        }
    }
}
