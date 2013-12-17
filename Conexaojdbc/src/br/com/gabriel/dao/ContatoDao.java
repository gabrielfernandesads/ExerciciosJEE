package br.com.gabriel.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.gabriel.connectionfactory.FabricaDeConexoes;
import br.com.gabriel.modelo.Contatos;

public class ContatoDao {
	Connection conexao;

	public ContatoDao() {
		this.conexao = new FabricaDeConexoes().getConnection();
	}

	public void adiciona(Contatos contato) {

		String sql = "insert into contatos"
				+ "(nome,email,endereco,dataNascimento)"     
				+ "values(?,?,?,?)";

		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento()
					.getTimeInMillis()));

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
