package br.com.gabriel.teste;

import java.util.List;

import br.com.gabriel.dao.ContatoDao;
import br.com.gabriel.modelo.Contato;

public class TestaGetListaDao {

	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();

		List<Contato> contatos = dao.getLista();
		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			System.out.println("DataNascimento: " + contato.getDataNascimento().getTime()
					+ "\n");

		}

	}

}
