package cadastro.dao.generic;

import cadastro.domain.Cliente;
import cadastro.domain.Persistente;
import cadastro.domain.Produto;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class GenericDAO<T extends Persistente>  implements IGenericDAO<T>{
	protected Map<Class,Map<Long,T>> map;


	public abstract Class<T> getTipoClass();

	public GenericDAO(){
		this.map = new HashMap<>();
		Map<Long, T> mapaInterno = this.map.getClass();
		if (map == null){
			mapaInterno = new HashMap<>();
			this.map.put(getTipoClass(), mapaInterno);
		}
	}

	@Override
	public Boolean cadastrarProduto(T entity) {
		Map<Long, T> mapaInterno = this.map.get(getTipoClass());
		if (mapaInterno.containsKey(entity.getCodigo())){
			return false;
		}
		mapaInterno.put(entity.getCodigo(),entity);
		return true;
	};

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
