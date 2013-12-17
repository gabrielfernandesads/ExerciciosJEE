package br.com.gabriel.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.gabriel.connectionfactory.FabricaDeConexoes;

public class TestaConexao {

	public static void main(String[] args) {

		Connection c = new FabricaDeConexoes().getConexao();
		System.out.println("Conectou!");
		try {
			c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
