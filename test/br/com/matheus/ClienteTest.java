package br.com.matheus;

import br.com.matheus.dao.ClienteDAO;
import br.com.matheus.dao.IClienteDAO;
import br.com.matheus.domain.Cliente;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

public class ClienteTest {
    @Test
    public void cadastrarTest() throws SQLException {
        IClienteDAO dao = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("01");
        cliente.setNome("Matheus");

        Integer qtd = dao.cadastrar(cliente);
        Assert.assertTrue(qtd == 1);

        Cliente clienteBD = dao.consultar(cliente.getCodigo());
        Assert.assertNotNull(clienteBD);
        Assert.assertNotNull(clienteBD.getId());
        Assert.assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        Assert.assertEquals(cliente.getNome(), clienteBD.getNome());

        Integer qtdDel = dao.excluir(clienteBD);
        Assert.assertNotNull(qtdDel);

        Integer qtdUptd = dao.atualizar(clienteBD);
        Assert.assertNotNull(qtdUptd);

        List<Cliente> buscarTodosClientes = dao.buscarTodos();
        Assert.assertNotNull(buscarTodosClientes);
    }
}
