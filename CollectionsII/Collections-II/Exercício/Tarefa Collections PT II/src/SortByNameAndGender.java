import java.util.*;
/**
 * @author nahum
 */
public class SortByNameAndGender {
	public static void main(String[] args) {
		sortByName();
		sortByGender();
	}
	/**
	 * Classe que recebe inputs do usuário pelo console, e os retorna ordenados.
	 */
	private static void sortByName(){
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os nomes que deseja inserir, separados por vírgula(,): ");

		String input = sc.next();
		String[] names = input.split(",");

		List<String> namesList = new ArrayList<>(Arrays.asList(names));
		Collections.sort(namesList);

		System.out.println(namesList);
	}
	/**
	 * Classe que faz o gerenciamento de inputs, a criação de List<> e chama outros métodos para implementação.
	 */
	private static void sortByGender(){
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu nome e seu gênero separado por hífen(-): ");
		System.out.println("Após, insira a vírgula para o próximo nome! ");

		String input = sc.nextLine();
		String[] pares = input.split(",");

		List<String> grupoMasculino = new ArrayList<>();
		List<String> grupoFeminino = new ArrayList<>();

		for (String par : pares) {
			processamentoDePares(par, grupoFeminino, grupoMasculino);
		}

		mostrarGrupos(grupoMasculino, grupoFeminino);

		sc.close();
	}
	/**
	 * Classe que processa os pares recebidos por regex, atribuindo ao grupo correto através do .equals.
	 *
	 * @param par Parâmetro para iteração no For.
	 * @param grupoMasculino Interface List criada anteriormente, setada como parâmetro para uso.
	 * @param grupoFeminino Interface List criada anteriormente, setada como parâmetro para uso.
	 */
	private static void processamentoDePares(String par,List<String> grupoMasculino, List<String> grupoFeminino) {
		String[] partes = par.split("-");

		if (partes.length != 2) {
			System.out.println("Formato inválido para o par: " + par);
			return;
		}

		String nome = partes[0].trim();
		String sexo = partes[1].trim().toUpperCase();

		if (sexo.equals("F")) {
			grupoFeminino.add(nome);
		} else if (sexo.equals("M")) {
			grupoMasculino.add(nome);
		} else {
			System.out.println("Gênero inválido para o par: " + par);
		}
	}
	/**
	 * Classe que classifica e exibe a ordenação feita em console, com dois parâmetros setados exibindo os dois grupos criados anteriormente.
	 *
	 * @param grupoMasculino Parâmetro para exibição do grupo masculino.
	 * @param grupoFeminino Parâmetro para exibição do grupo feminino.
	 */
	private static void mostrarGrupos(List<String> grupoMasculino, List<String> grupoFeminino) {
		Collections.sort(grupoMasculino);
		Collections.sort(grupoFeminino);

		System.out.println("Grupo masculino: " + grupoMasculino);
		System.out.println("Grupo feminino: " + grupoFeminino);
	}
}

