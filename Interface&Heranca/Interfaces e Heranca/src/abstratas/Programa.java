package abstratas;

public class Programa {
	public static void main(String[] args) {
		Assalariado assalariado = new Assalariado();
		assalariado.setNome("Bonoro");
		assalariado.setSobrenome("Biroliro");
		assalariado.setCpf("123.312.123-21");
		assalariado.setSalario(1000d);

		imprimir(assalariado);

		Comissionado comissionado = new Comissionado();
		comissionado.setNome("Bonoro");
		comissionado.setSobrenome("Biroliro");
		comissionado.setCpf("123.312.123-21");
		comissionado.setTotalVenda(2000d);
		comissionado.setTotalComissao(0.10d);

		imprimir(comissionado);

		Horista horista = new Horista();
		horista.setNome("Bonoro");
		horista.setSobrenome("Biroliro");
		horista.setCpf("123.312.123-21");
		horista.setHorasTrabalhadas(44*4d);
		horista.setPrecoHora(21.00d);

		imprimir(horista);

	}

	public static void imprimir(Empregado empregado) {
		System.out.println("O empregado: " + empregado.getNome() + " tem o salário no valor de R$: " + empregado.vencimento());
	}
}
