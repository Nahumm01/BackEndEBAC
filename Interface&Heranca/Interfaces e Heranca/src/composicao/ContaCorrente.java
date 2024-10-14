package composicao;

public class ContaCorrente {
	private Float saldo;
	private Float chequeEspecial;
	private Banco banco;
	private Integer idConta;

	public ContaCorrente (Float saldo, Float chequeEspecial, Banco banco, Integer idConta) {
		this.saldo = saldo;
		this.chequeEspecial = chequeEspecial;
		this.banco = banco;
		this.idConta = idConta;
	}

	public Float getSaldo() {
		return saldo;
	}

	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}

	public Float getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(Float chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public void deposita(Float valor) {
		this.saldo = saldo + valor;
	}

	public void saque(Float valor) {
		this.saldo = saldo - valor;
	}

	public void extrato(){
		System.out.println(this.saldo);
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Integer getIdConta() {
		return idConta;
	}

	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}

	@Override
	public String toString() {
		return "ContaCorrente{" +
				"saldo=" + saldo +
				", chequeEspecial=" + chequeEspecial +
				", banco=" + banco +
				", idConta=" + idConta +
				'}';
	}
}
