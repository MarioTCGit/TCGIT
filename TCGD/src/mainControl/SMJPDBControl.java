package mainControl;

import bh.dbc.conn.FetchConnection;
import bh.dbc.db.DBConnection;

public abstract class SMJPDBControl extends SMJPMainControl {

	/** fetch connection */
	public FetchConnection fc;

	/** DB connection OBJ */
	public DBConnection dbc;

	/**
	 * fetch connection
	 */
	public abstract void fetchConnection();

}
