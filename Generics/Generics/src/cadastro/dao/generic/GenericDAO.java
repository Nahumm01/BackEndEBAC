package cadastro.dao.generic;

import cadastro.domain.Persistente;
import cadastro.domain.Produto;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class GenericDAO<T extends Persistente>  implements IGenericDAO<T>{
	private Map<Class,Map<Long,T>> map;

	public GenericDAO(){
		this.map = new HashMap<>();
	}

	@Override
	public Boolean cadastrarProduto(T entity) {
		this.map.get()
		return null;
	}

	@Override
	public void excluirProduto(Long valor) {

	}

	@Override
	public void alterarProduto(T entity) {

	}

	@Override
	public Produto consultarProduto(Long valor) {
		return null;
	}

	@Override
	public Collection<T> listarTodosProdutos() {
		return List.of();
	}
}
