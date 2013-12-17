package br.com.gabriel.teste;

import br.com.gabriel.dao.ContatoDao;
import br.com.gabriel.modelo.Contato;

public class TestaRemoveDao {

	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();
		Contato contato= new Contato();
		
		contato.setId((long) 4);
		dao.remove(contato);
		System.out.println("Removido com sucesso!");
		

	}

}
