package pampas.basedato.util;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

public class ConexionBaseDatos {

	private static String url = "jdbc:mysql://127.0.0.1:3306/"; 
	private static BasicDataSource pool;
	
	public static BasicDataSource getInstance() throws SQLException {
		if (pool == null) {
			pool = new BasicDataSource();
			pool.setUrl(url);
			pool.setUsername("root");
			pool.setInitialSize(3);
			pool.setMinIdle(3);
			pool.setMaxIdle(8);
			pool.setMaxTotal(8);
		}
		return pool;
	}
	
	public static Connection getConnection() throws SQLException {
		return getInstance().getConnection();
	}
}
