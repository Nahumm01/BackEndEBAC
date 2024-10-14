public class PessoaFisica extends Pessoa {
	private String cpf;
	private String dataNascimento;

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public PessoaFisica(String nome, String cpf, String dataNascimento, String email, String telefone, String endereco) {
		super(nome,endereco,email,telefone);
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return super.toString() + ", CPF: " + cpf + ", Data de Nascimento: " + dataNascimento;
	}
}

