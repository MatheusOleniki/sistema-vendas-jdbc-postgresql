package br.com.matheus;

import br.com.matheus.dao.ClienteDAO;
import br.com.matheus.dao.IClienteDAO;
import br.com.matheus.dao.IProdutoDAO;
import br.com.matheus.dao.ProdutoDAO;
import br.com.matheus.domain.Cliente;
import br.com.matheus.domain.Produto;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

public class ProdutoTest {
    @Test
    public void cadastrarTest() throws SQLException {
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("01");
        produto.setNome("saboneteira");

        Integer qtd = dao.cadastrar(produto);
        Assert.assertTrue(qtd == 1);

        Produto produtoDB = dao.consultar(produto.getCodigo());
        Assert.assertNotNull(produtoDB);
        Assert.assertNotNull(produtoDB.getId());
        Assert.assertEquals(produto.getCodigo(), produtoDB.getCodigo());
        Assert.assertEquals(produto.getNome(), produtoDB.getNome());

        Integer qtdDel = dao.excluir(produtoDB);
        Assert.assertNotNull(qtdDel);

        Integer qtdUptd = dao.atualizar(produtoDB);
        Assert.assertNotNull(qtdUptd);

        List<Produto> buscarTodosProds = dao.buscarTodos();
        Assert.assertNotNull(buscarTodosProds);
    }

}
