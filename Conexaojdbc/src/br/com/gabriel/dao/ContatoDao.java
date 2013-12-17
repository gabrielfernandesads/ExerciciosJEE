package br.com.gabriel.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.gabriel.connectionfactory.FabricaDeConexoes;
import br.com.gabriel.modelo.Contatos;

public class ContatoDao {
	Connection conexao;

	public ContatoDao() {
		this.conexao = new FabricaDeConexoes().getConnection();
	}

	public void adiciona(Contatos contato) {

		String sql = "insert into contatos"
				+ "(nome,email,endereco,dataNascimento)" + "values(?,?,?,?)";

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

	public List<Contatos> getLista() {
		try {
			List<Contatos> listadecontatos = new ArrayList<Contatos>();
			PreparedStatement stmt = this.conexao
					.prepareStatement("select * from contatos");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				// Criando o objeto contato
				Contatos contato = new Contatos();
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));

				// montando a data através do Calendar
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				contato.setDataNascimento(data);

				// adicionando objeto a lista
				listadecontatos.add(contato);
			}
			rs.close();
			stmt.close();
			return listadecontatos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
