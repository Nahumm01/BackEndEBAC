package br.com.nhmdev.exceptions;

import javax.swing.*;
import java.util.Scanner;

public class AppCliente {
	public static void main(String[] args) {
		String opcao = JOptionPane.showInputDialog(null,"Digite o código do cliente","",JOptionPane.INFORMATION_MESSAGE);
		ClienteService.consultarCliente(opcao);

		/*try {
			ClienteService.consultarCliente(opcao);
		} catch (ClienteNaoEncontradoException e) {
			JOptionPane.showInputDialog(null,e.getMessage(),"",JOptionPane.INFORMATION_MESSAGE);
		}*/
	}
}
