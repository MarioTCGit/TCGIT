package action.test;

import java.sql.SQLException;

import common.Constants;
import common.DBConnection;

public class TestConn implements Constants {

	private DBConnection dbc = new DBConnection();

	public String testConn() {
		try {
			StringBuffer sql = new StringBuffer("select * from auser");
			dbc.rs = dbc.executeQuery(sql.toString());
			while (dbc.rs.next()) {
				System.out.print(dbc.rs.getString(1));
				System.out.print("-----");
				System.out.print(dbc.rs.getString(2));
				System.out.print("-----");
				System.out.print(dbc.rs.getString(3));
				System.out.print("-----");
				System.out.print(dbc.rs.getString(4));
				System.out.print("-----");
				System.out.println(dbc.rs.getString(5));
			}
		} catch (SQLException e) {
			dbc.rollbackTransection();
			e.printStackTrace();
		} catch (Exception e) {
			dbc.rollbackTransection();
			e.printStackTrace();
		} finally {
			dbc.closeTransection();
		}
		return "test";
	}
}
