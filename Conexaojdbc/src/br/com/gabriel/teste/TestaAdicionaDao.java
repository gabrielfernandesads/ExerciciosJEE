package br.com.gabriel.teste;

import java.sql.SQLException;
import java.util.Calendar;

import br.com.gabriel.dao.ContatoDao;
import br.com.gabriel.modelo.Contato;

public class TestaAdicionaDao {

	public static void main(String[] args) throws SQLException {
		Contato contato=new Contato();
		contato.setNome("Marcos");
		contato.setEmail("marcos@hotmail");
		contato.setEndereco("almeda 1");
		contato.setDataNascimento(Calendar.getInstance());
        
		ContatoDao dao= new ContatoDao();
		dao.adiciona(contato);
		System.out.println("Contato gravado!");
	}

}
