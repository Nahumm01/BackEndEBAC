package br.com.nhmdev;

import java.util.List;
import java.util.Objects;

public class Pessoa {
	private String id;
	private String nome;
	private String nacionalidade;
	private Integer idade;

	public Pessoa(String id, String nome, String nacionalidade, Integer idade) {
		this.id = id;
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
	}

	public Pessoa() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public List<Pessoa> populaPessoas(){
		Pessoa pe1 = new Pessoa("p1","Cabrón","Venezuela",19);
		Pessoa pe2 = new Pessoa("p2","Ticharón","Cuba",22);
		Pessoa pe3 = new Pessoa("p3","Maria","Bolívia",26);
		Pessoa pe4 = new Pessoa("p4","Antonieta","Chile",21);
		Pessoa pe5 = new Pessoa("p5","Ramón","Paraguai",25);
		return List.of(pe1,pe2,pe3,pe4,pe5);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Pessoa pessoa = (Pessoa) o;
		return Objects.equals(id, pessoa.id) && Objects.equals(nome, pessoa.nome);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome);
	}

	@Override
	public String toString() {
		return "Pessoa{" +
				"id='" + id + '\'' +
				", nome='" + nome + '\'' +
				", nacionalidade='" + nacionalidade + '\'' +
				", idade=" + idade +
				'}';
	}
}
