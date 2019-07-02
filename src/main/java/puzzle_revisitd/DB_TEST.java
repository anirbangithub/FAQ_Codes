package puzzle_revisitd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

public class DB_TEST {

	public static void main(String[] args)
	{
		ArrayList<String> dial_list = new ArrayList<>();
		Singleton conn = Singleton.getInstance();
	Connection connection =	conn.getConnection();
	try {
		PreparedStatement ps = connection.prepareStatement("select DIAL_LIST from qrcodes.qr_packet_history where PKT_NAME = 'TEL_SCIENCE_STD_8TH'");
		ResultSet rs = ps.executeQuery();
		if(!rs.isBeforeFirst())
			while(rs.next()) {
				dial_list.add(rs.getString("DIAL_LIST"));
			}
		for(String d: dial_list)
			System.out.println(d);
			
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
