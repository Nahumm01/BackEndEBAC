package composicao;


public class ContaPoupanca {
	Float saldo;
	private Banco banco;

	public Float getSaldo() {
		return saldo;
	}

	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}

	public void deposita(Float valor) {
		this.saldo = saldo + valor;
	}

	public void saque(Float valor) {
		this.saldo = saldo - valor;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}
}
