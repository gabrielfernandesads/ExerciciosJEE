package br.com.gabriel.teste;

import java.sql.SQLException;
import java.util.Calendar;

import br.com.gabriel.dao.ContatoDao;
import br.com.gabriel.modelo.Contatos;

public class TestaConexaoDao {

	public static void main(String[] args) throws SQLException {
		Contatos contato=new Contatos();
		contato.setNome("Maria");
		contato.setEmail("maria@hotmail");
		contato.setEndereco("almeda 1");
		contato.setDataNascimento(Calendar.getInstance());
        
		ContatoDao dao= new ContatoDao();
		dao.adiciona(contato);
		System.out.println("Contato gravado!");
	}

}
