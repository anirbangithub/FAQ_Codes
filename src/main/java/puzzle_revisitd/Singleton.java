package puzzle_revisitd;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;

enum Singleton {
	INSTANCE;
	// instance vars, constructor

	private  Connection connection;

	// db params

	final String host = "jdbc:mysql://localhost:3306";
	final String user = "root";
	final String passwd = "root";
	final String schema = "qrcode";

	Singleton() {
		try {


			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Setup the connection with the DB
			connection = DriverManager
					.getConnection(host + "/" + schema + "?" + "user=" + user + "&password=" + passwd);
			// setting default schema
			connection.prepareStatement("USE " + schema).executeQuery();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// Static getter
	public static Singleton getInstance() {
		return INSTANCE;
	}

	public Connection getConnection() {
		return connection;
	}
}
