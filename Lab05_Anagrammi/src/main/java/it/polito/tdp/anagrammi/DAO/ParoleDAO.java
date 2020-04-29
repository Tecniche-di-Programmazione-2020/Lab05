package it.polito.tdp.anagrammi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ParoleDAO {

	public boolean esistente(String parola) {
		final String sql = "SELECT * FROM parola WHERE parola.nome=?";
		try {
		Connection conn = ConnectDB.getConnection();
		PreparedStatement st = conn.prepareStatement(sql);
		st.setString(1, parola);
		ResultSet rs = st.executeQuery();

		while (rs.next()) {return true;}
		
		conn.close();
		
		
		
		return false;
	}
 catch (SQLException e) {
	// e.printStackTrace();
	throw new RuntimeException("Errore Db", e);
}
}
}
