import br.cefetmg.altomare.dto.ProdutoDTO;
import java.util.List;
public interface IProdutoDAO {
    
    public void inserirProduto(Produto produto);
    public void atualizarProduto(Produto produto); 
    public void excluirProduto(int produtoId);
    public List<Produto> listarProdutos();
    
}
