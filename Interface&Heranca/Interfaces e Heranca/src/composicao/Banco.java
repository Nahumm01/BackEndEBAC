package composicao;

import java.util.HashSet;
import java.util.Set;

public class Banco {
	private Set<ContaCorrente> listaContaCorrente;
	private Set<ContaPoupanca> listaContaPoupanca;

	private Long codigo;
	private String nome;

	public Banco() {
		this.listaContaCorrente = new HashSet<ContaCorrente>();
		this.listaContaPoupanca = new HashSet<ContaPoupanca>();
	}

	public void addContaCorrente(ContaCorrente cc){
		this.listaContaCorrente.add(cc);
	}

	public void addContaPoupanca(ContaPoupanca cp){
		this.listaContaPoupanca.add(cp);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public void printContas(ContaCorrente cc){
		for (ContaCorrente c : this.listaContaCorrente){
			System.out.println(c.getIdConta());
		}
	}

	@Override
	public String toString() {
		return "Banco{" +
				"listaContaPoupanca=" + listaContaPoupanca +
				", listaContaCorrente=" + listaContaCorrente +
				'}';
	}
}
