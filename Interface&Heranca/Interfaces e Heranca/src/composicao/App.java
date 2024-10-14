package composicao;

public class App {
	public static void main(String[] args) {
		Banco banco = new Banco();
		banco.setNome("Bradesco");
		banco.setCodigo(243L);

		ContaCorrente cc = criarContaCorrente(12.000F,24.000F,banco,56150);


	}

	private static ContaCorrente criarContaCorrente(Float saldo, Float chequeEspecial, Banco banco, Integer idConta) {
		return new ContaCorrente(saldo, chequeEspecial, banco, idConta);
	}
}
