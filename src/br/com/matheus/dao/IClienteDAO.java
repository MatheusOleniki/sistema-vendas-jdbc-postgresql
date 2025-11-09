package br.com.matheus.dao;

import br.com.matheus.domain.Cliente;

import java.sql.SQLException;
import java.util.List;

public interface IClienteDAO {
    Integer cadastrar(Cliente cliente) throws SQLException;

    Cliente consultar(String codigo) throws SQLException;

    Integer excluir(Cliente clienteBD) throws SQLException;

    Integer atualizar(Cliente cliente) throws  SQLException;

    List<Cliente> buscarTodos() throws  SQLException;
}
