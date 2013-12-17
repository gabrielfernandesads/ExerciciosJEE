package br.com.gabriel.teste;

import java.util.Calendar;

import br.com.gabriel.dao.ContatoDao;
import br.com.gabriel.modelo.Contato;

public class TestaAlteraDao {

	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();
		Contato contato= new Contato();
		contato.setNome("Bia2");
		contato.setEmail("@");
		contato.setEndereco("Ventura");
		contato.setDataNascimento(Calendar.getInstance());
		contato.setId((long)3);
		dao.altera(contato);
		System.out.println("Alterado com sucesso!");

	}

}
