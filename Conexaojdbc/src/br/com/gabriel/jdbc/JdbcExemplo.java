package br.com.gabriel.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcExemplo {

	public static void main(String[] args){
  
	try {
		Connection conexao = DriverManager.getConnection("jdbc:mysql://127.0.0.1/test","root","cancer");
		System.out.println("Conectado!");
        conexao.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}	
    }
	}

