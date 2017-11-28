package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.Company;
import bean.Post;

public class CompanyDao {
	private String sql;
	private Connection connection;
	private Statement stat;
	private PreparedStatement pstat;
	
	public void save(Company company){
		this.setSql("insert into company values('"+company.getUUID()+"','"+company.getCname()+"','"+company.getManager()+"','"+company.getPosition()+"','"+company.getPhone()+"','"+company.getTime()+"',"+company.getCountpeople()+");");
		try {
			stat = connection.createStatement();
			stat.execute(this.getSql());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		UUID a=UUID.randomUUID();
		
	}
	
	public Company get(String id){
		this.setSql("select * from company where UUID=?");
		Company company = new Company();
		try {
			pstat = connection.prepareStatement(getSql());
			pstat.setString(1, id);
			ResultSet rs = pstat.executeQuery();
			while(rs.next()){
				company.setUUID(rs.getString("UUID"));
				company.setCname(rs.getString("cname"));
				company.setManager(rs.getString("manager"));
				company.setPosition(rs.getString("position"));
				company.setPhone(rs.getString("phone"));
				company.setTime(rs.getString("time"));
				company.setCountpeople(rs.getInt("countpeople"));
				return company;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return null;
	}
	
	public void remove(String id){
		this.setSql("delete from company where UUID=?");
		try {
			pstat = connection.prepareStatement(getSql());
			pstat.setString(1, id);
			pstat.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Company> queryAll(){
		List<Company> list = new ArrayList<Company>();
		this.setSql("select * from company");
		Company company;
		try {
			pstat = connection.prepareStatement(getSql());
			ResultSet rs = pstat.executeQuery();
			while(rs.next()){
				company = new Company();
				company.setUUID(rs.getString("UUID"));
				company.setCname(rs.getString("cname"));
				company.setManager(rs.getString("manager"));
				company.setPosition(rs.getString("position"));
				company.setPhone(rs.getString("phone"));
				company.setTime(rs.getString("time"));
				company.setCountpeople(rs.getInt("countpeople"));
				list.add(company);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return null;
	}

	public List<Company> getByName(String cname){
		List<Company> list = new ArrayList<Company>();
		this.setSql("select * from company where cname=?");
		Company company;
		try {
			pstat = connection.prepareStatement(getSql());
			pstat.setString(1, cname);
			ResultSet rs = pstat.executeQuery();
			if(rs.next()) {
				company= new Company();
				company.setUUID(rs.getString("UUID"));
				company.setCname(rs.getString("cname"));
				company.setManager(rs.getString("manager"));
				company.setPosition(rs.getString("position"));
				company.setPhone(rs.getString("phone"));
				company.setTime(rs.getString("time"));
				company.setCountpeople(rs.getInt("countpeople"));
				list.add(company);
				return list;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return null;
	}
	
	public void removeByCompanyname(String cname){
		this.setSql("delete from company where cname=?");
		try {
			pstat = connection.prepareStatement(getSql());
			pstat.setString(1, cname);
			pstat.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
	
	public void updateCompany(Company company){
		remove(company.getUUID());
		save(company);
	}
	
	
	
	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
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
	
	
}

