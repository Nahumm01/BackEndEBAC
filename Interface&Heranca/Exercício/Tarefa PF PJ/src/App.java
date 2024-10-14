public class App {
	public static void main(String[] args) {
		Pessoa pf = new PessoaFisica("Thiago","111.111.111-11","10-04-2000","nhm@devto.com","(99)99999-9999","Road Ud San Diego");
		Pessoa pj = new PessoaJuridica("Nhm Dev","12.686.104/0001-80","Nahum Desenvolvimento LTDA","Nhm Dev","nhm@devto.com","(99)9999-9999","Road Ud San Diego");


		System.out.println(pf);
		System.out.println(pj);


	}
}
