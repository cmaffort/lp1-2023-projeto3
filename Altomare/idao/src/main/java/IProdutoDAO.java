import br.cefetmg.altomare.dto.ProdutoDTO;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public interface IProdutoDAO {
    
    public void inserirProduto(Produto produto);
    public void atualizarProduto(Produto produto); 
    public void excluirProduto(int produtoId);
    public List<Produto> listarProdutos();
    
}
