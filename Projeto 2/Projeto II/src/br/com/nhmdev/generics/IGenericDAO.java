package br.com.nhmdev.generics;

import br.com.nhmdev.domain.Persistente;
import br.com.nhmdev.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

public interface IGenericDAO <T extends Persistente> {

	public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

	public Boolean excluir(Long valor);

	public void alterar(T entity) throws TipoChaveNaoEncontradaException;

	public T consultar(Long valor);

	public Collection<T> buscarTodos();
}