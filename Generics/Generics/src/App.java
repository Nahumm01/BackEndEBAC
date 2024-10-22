import cadastro.dao.ClienteMapDAO;
import cadastro.dao.IClienteDAO;
import cadastro.domain.Cliente;


import javax.swing.*;

public class App {
	private static IClienteDAO iClienteDAO;

	public static void main(String[] args) {

		iClienteDAO = new ClienteMapDAO();

		String opcao = JOptionPane.showInputDialog(null,"Digite 1 para Cadastro, 2 para Consulta, 3 para Excluir, 4 para Alteração ou 5 para Sair. ","Cadastro",JOptionPane.INFORMATION_MESSAGE);

		while(!isOpcaoValida(opcao)){
			if ("".equals(opcao)){
				sair();
			}
			opcao = JOptionPane.showInputDialog(null,"Digite 1 para Cadastro, 2 para Consulta, 3 para Excluir, 4 para Alteração ou 5 para Sair. ","Cadastro",JOptionPane.INFORMATION_MESSAGE);
		}

		while(isOpcaoValida(opcao)){
			if (isOpcaoSair(opcao)){
				sair();
			} else if (isOpcaoCadastro(opcao)) {
				String dados = JOptionPane.showInputDialog(null,"Digite os dados do cliente separados por vírgula, conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado","Cadastro",JOptionPane.INFORMATION_MESSAGE);
				cadastrar(dados);
			} else if (isOpcaoConsulta(opcao)) {
				String dados = JOptionPane.showInputDialog(null,"Digite o CPF: ","Consulta",JOptionPane.INFORMATION_MESSAGE);
				consultar(dados);
			}
			opcao = JOptionPane.showInputDialog(null,"Digite 1 para Cadastro, 2 para Consulta, 3 para Excluir, 4 para Alteração ou 5 para Sair. ","Cadastro",JOptionPane.INFORMATION_MESSAGE);
		}
	}

	private static void consultar(String dados) {
		//Validar se foi passado somente o cpf
		Cliente cliente = iClienteDAO.buscarCliente(Long.parseLong(dados));
		if (cliente != null){
			JOptionPane.showMessageDialog(null, "Cliente encontrado: " + cliente.toString(), "Sucesso!",JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Cliente não encontrado: ", "Falha na busca!",JOptionPane.INFORMATION_MESSAGE);
		}
	}

	private static void cadastrar(String dados) {
		//Tentar validar se todos os campos estão preenchidos.
		//Se não tiver, passr null no construtor onde o valor é nulo
		//Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],null,dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6])
		String[] dadosSeparados = dados.split(",");
		Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3], dadosSeparados[4], dadosSeparados[5], dadosSeparados[6]);
		Boolean isCadastrado = iClienteDAO.inserirCliente(cliente);
		if (isCadastrado){
			JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado", "Erro",JOptionPane.INFORMATION_MESSAGE);
		}
	}

	private static void sair() {
		JOptionPane.showMessageDialog(null,"Até Logo! ","Sair",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

	private static boolean isOpcaoValida(String opcao) {
		return "1".equals(opcao) || "2".equals(opcao)
				|| "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao);
	}

	private static boolean isOpcaoCadastro(String opcao) {
		return opcao.equals("1");
	}

	private static boolean isOpcaoConsulta(String opcao) {
		return opcao.equals("2");
	}

	private static boolean isOpcaoExcluir(String opcao) {
		return opcao.equals("3");
	}

	private static boolean isOpcaoAlteracao(String opcao) {
		return opcao.equals("4");
	}

	private static boolean isOpcaoSair(String opcao) {
		return opcao.equals("5");
	}
}
