package br.com.gabriel.connectionfactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexoes {

	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/test",
					"root", "cancer");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
}
