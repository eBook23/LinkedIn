package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.Company_post;


public class Company_PostDao extends CommonDao{
	
	public void save(Company_post cpost){
		this.setSql("insert into company_post values('"+cpost.getCompany_id()+"','"+cpost.getPost_id()+"',"+cpost.getPrice()+",'"+cpost.getIntro()+"');");
		try {
			stat = connection.createStatement();
			stat.execute(this.getSql());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		UUID a=UUID.randomUUID();
		
	}
	
	public Company_post get(String cid){
		this.setSql("select company_id,post_id,price,intro from company_post where company_id=?");
		Company_post cp = new Company_post();
		try {
			pstat = connection.prepareStatement(getSql());
			pstat.setString(1, cid);
			ResultSet rs = pstat.executeQuery();
			while(rs.next()){
				cp.setCompany_id(rs.getString("company_id"));
				cp.setPost_id(rs.getString("post_id"));
				cp.setPrice(rs.getInt("price"));
				cp.setIntro(rs.getString("intro"));
				
				return cp;
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return null;
	}
	
	public void remove(String pid){
		this.setSql("delete from company_post where post_id=?");
		try {
			pstat = connection.prepareStatement(getSql());
			pstat.setString(1, pid);
			pstat.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	
	public List<Company_post> queryAll(){
		List<Company_post> list = new ArrayList<Company_post>();
		this.setSql("select company_id,post_id,price,intro from company_post");
		Company_post cp;
		try {
			pstat = connection.prepareStatement(getSql());
			ResultSet rs = pstat.executeQuery();
			while(rs.next()){
				cp = new Company_post();
				cp.setCompany_id(rs.getString("company_id"));
				cp.setPost_id(rs.getString("post_id"));
				cp.setPrice(rs.getInt("price"));
				cp.setIntro(rs.getString("intro"));
				

				list.add(cp);
				
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
		return null;
	}
	
	public List<Company_post> queryAllByPostId(String pid){
		List<Company_post> list = new ArrayList<Company_post>();
		this.setSql("select company_id,post_id,price,intro from company_post where post_id=?");
		Company_post cp;
		try {
			pstat = connection.prepareStatement(getSql());
			pstat.setString(1, pid);
			ResultSet rs = pstat.executeQuery();
			while(rs.next()){
				cp = new Company_post();
				cp.setCompany_id(rs.getString("company_id"));
				cp.setPost_id(rs.getString("post_id"));
				cp.setPrice(rs.getInt("price"));
				cp.setIntro(rs.getString("intro"));
				

				list.add(cp);
				
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return null;
	}
	
	public void removeByCompanyId(String cid){
		this.setSql("delete from company_post where company_id=?");
		try {
			pstat = connection.prepareStatement(getSql());
			pstat.setString(1, cid);
			pstat.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
	
	public void updateCompany_post(Company_post cpost){
		this.setSql("delete from company_post where company_id=?");
		try {
			pstat = connection.prepareStatement(getSql());
			pstat.setString(1, cpost.getCompany_id());
			pstat.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.setSql("insert into company_post values('"+cpost.getCompany_id()+"','"+cpost.getPost_id()+"',"+cpost.getPrice()+",'"+cpost.getIntro()+"');");
		try {
			stat = connection.createStatement();
			stat.execute(this.getSql());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
}

