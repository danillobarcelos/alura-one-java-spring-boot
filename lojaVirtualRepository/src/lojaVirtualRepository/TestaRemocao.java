package lojaVirtualRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestaRemocao {
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory fac = new ConnectionFactory();
		Connection con = fac.recuperarConexao();
		
		PreparedStatement stm = con.prepareStatement("DELETE FROM PRODUTO WHERE ID > ?");
		stm.setInt(1, 2);
		stm.execute();
				
		Integer linhasAlteradas = stm.getUpdateCount();
		
		System.out.println("A quantidade de linhas alteradas foi: " + linhasAlteradas);
	}
}
