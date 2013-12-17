package br.com.gabriel.teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import br.com.gabriel.connectionfactory.FabricaDeConexoes;

public class JDBCInsere {

	public static void main(String[] args)throws SQLException {

		// conectando
		Connection con = null;
		try {
			con = new FabricaDeConexoes().getConnection();

			// jogando comando sql dentro da váriavel
			String sql = "insert into contatos"
					+ "(nome,email,endereco,dataNascimento)"
					+ "values(?,?,?,?)";

			// Colocando o sql dentro do PreaparedStatment
			
			PreparedStatement stmt = con.prepareStatement(sql);

			// passando valores p/ stmt
			stmt.setString(1, "bia");
			stmt.setString(2, "bia@hotmail");
			stmt.setString(3, "rua hugo");
			stmt.setDate(4, new java.sql.Date(Calendar.getInstance()
					.getTimeInMillis()));

			// executa a inserção
			stmt.execute();
			stmt.close();
			System.out.println("Inserido com sucesso!");
		} catch (SQLException e) {
        
		} finally {
			//sempre fechar conexao dentro d finally
			con.close();
		}
		

	}

}
