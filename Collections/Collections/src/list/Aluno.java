package list;

public class Aluno implements Comparable<Aluno>{
	private String nome;
	private String idade;
	private String curso;
	private Double nota;

	public Aluno(String nome, String idade, String curso, Double nota) {
		this.nome = nome;
		this.idade = idade;
		this.curso = curso;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Aluno " +
				"Nome: " + nome + '\'' +
				", idade: " + idade +
				", curso: " + curso + '\'' +
				", nota: " + nota + '\'' ;
	}


	@Override
	public int compareTo(Aluno aluno) {
		return this.nome.compareTo(aluno.getNome());

	}
}
