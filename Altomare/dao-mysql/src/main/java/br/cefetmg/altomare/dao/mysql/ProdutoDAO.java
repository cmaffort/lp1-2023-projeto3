
package br.cefetmg.altomare.dao.mysql;
import br.cefetmg.altomare.dto.ProdutoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    final Connection connection;

    public ProdutoDAO(Connection connection) {
        this.connection = connection;
    }

    public void inserirProduto(ProdutoDTO produto) throws SQLException {
        String sql = "INSERT INTO produtos (nome, tipo, preco, estado) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, produto.getNome());
            statement.setString(2, produto.getTipo());
            statement.setDouble(3, produto.getPreco());
            statement.setString(4, produto.getEstado());
            statement.executeUpdate();
        }
    }

    public void atualizarProduto(ProdutoDTO produto) throws SQLException {
        String sql = "UPDATE produtos SET nome = ?, tipo = ?, preco = ?, estado = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, produto.getNome());
            statement.setString(2, produto.getTipo());
            statement.setDouble(3, produto.getPreco());
            statement.setString(4, produto.getEstado());
            statement.setInt(5, produto.getId());
            statement.executeUpdate();
        }
    }

    public void excluirProduto(int produtoId) throws SQLException {
        String sql = "DELETE FROM produtos WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, produtoId);
            statement.executeUpdate();
        }
    }

    public List<ProdutoDTO> listarProdutos() throws SQLException {
        List<ProdutoDTO> produto = new ArrayList<>();
        String sql = "SELECT * FROM produtos";
        try (PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                ProdutoDTO produto = new ProdutoDTO();
                produto.setId(resultSet.getInt("id"));
                produto.setNome(resultSet.getString("nome"));
                produto.setTipo(resultSet.getString("tipo"));
                produto.setPreco(resultSet.getDouble("preco"));
                produto.setEstado(resultSet.getString("estado"));
                produtos.add(produto);
            }
        }
        return produtos;
    }
}
