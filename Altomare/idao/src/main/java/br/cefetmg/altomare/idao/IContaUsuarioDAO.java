package br.cefetmg.altomare.idao;

import java.util.*;
import br.cefetmg.altomare.dto.ContaUsuario;

public class IContaUsuarioDAO {
    
    boolean inserir(ContaUsuario contaUsuario);

    boolean atualizar(ContaUsuario contaUsuario);

    boolean delete(ContaUsuario contaUsuario);

    ArrayList<Despesa> getDespesas(ContaUsuario contaUsuario);
}
