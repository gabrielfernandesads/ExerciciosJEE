package br.com.gabriel.testes;

import src.br.com.gabriel.connectionfactory.FabricaDeConexoes;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
	
		Connection c = new FabricaDeConexoes().getConexao();
		System.out.println("Conectou!");
		c.close();
		
	}

}
