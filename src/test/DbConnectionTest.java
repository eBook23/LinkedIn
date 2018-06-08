package test;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;


import tools.DbUtil;

public class DbConnectionTest {

	@Test
	public void test() {
		Connection connection=(Connection) DbUtil.getInstance().getConnection();
	}

}
