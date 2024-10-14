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
		this.setNome(nome);
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.setEmail(email);
		this.setTelefone(telefone);
		this.setEndereco(endereco);
	}

	@Override
	public String toString() {
		return super.toString() + ", CPF: " + cpf + ", Data de Nascimento: " + dataNascimento;
	}
}

