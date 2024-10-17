import dao.ClienteMapDAO;
import dao.IClienteDAO;

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
	}

	private static Object cadastrar(String dados) {
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

	private static void sair() {
		JOptionPane.showMessageDialog(null,"Até Logo! ","Sair",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

	private static boolean isOpcaoValida(String opcao) {
		if("1".equals(opcao) ||) {}
	}

}
