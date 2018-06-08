package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;


import tools.DbUtil;

public class CommonDao {
	protected Connection connection;
	protected Statement stat;
	protected PreparedStatement pstat;
	protected String sql;
	
	public CommonDao(){
		connection=(Connection) DbUtil.getInstance().getConnection();
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public Statement getStat() {
		return stat;
	}

	public void setStat(Statement stat) {
		this.stat = stat;
	}

	public PreparedStatement getPstat() {
		return pstat;
	}

	public void setPstat(PreparedStatement pstat) {
		this.pstat = pstat;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}
	
	
}
