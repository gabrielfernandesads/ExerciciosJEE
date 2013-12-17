package br.com.gabriel.connectionfactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexoes {

	public Connection getConexao() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost",
					"root", "cancer");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
}
