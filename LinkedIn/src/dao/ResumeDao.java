package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.Resume;


public class ResumeDao {
	private String sql;
	private Connection connection;
	private Statement stat;
	private PreparedStatement pstat;
	
	public void save(Resume resume){
		this.setSql("insert into user values('"+resume.getUUID()+"','"+resume.getUser_id()+"','"+resume.getRname()+"','"+resume.getSex()+"',"+resume.getAge()+",'"+resume.getPhone()+"','"+resume.getHappy()+"','"+resume.getWorkyear()+"','"+resume.getAdvantage()+"','"+resume.getJobintension()+"','"+resume.getJobaddr()+"','"+resume.getIntro()+"');");
		try {
			stat = connection.createStatement();
			stat.execute(this.getSql());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		UUID a=UUID.randomUUID();
		
	}
	
	public Resume get(String id){
		this.setSql("select UUID,user_id,rname,sex,age,phone,happy,workyear,advantage,jobintension,jobaddr,intro from resume where UUID=?");
		Resume resume = new Resume();
		try {
			pstat = connection.prepareStatement(getSql());
			pstat.setString(1, id);
			ResultSet rs = pstat.executeQuery();
			while(rs.next()){
				resume.setUUID(rs.getString("UUID"));
				resume.setUser_id(rs.getString("user_id"));
				resume.setRname(rs.getString("rname"));
				resume.setSex(rs.getString("sex"));
				resume.setAge(rs.getInt("age"));
				resume.setPhone(rs.getString("phone"));
				resume.setHappy(rs.getString("happy"));
				resume.setWorkyear(rs.getString("workyear"));
				resume.setAdvantage(rs.getString("advantage"));
				resume.setJobintension(rs.getString("jobintension"));
				resume.setJobaddr(rs.getString("jobaddr"));
				resume.setIntro(rs.getString("intro"));
				
		
				return resume;
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return null;
	}
	
	public void remove(String id){
		this.setSql("delete from resume where UUID=?");
		try {
			pstat = connection.prepareStatement(getSql());
			pstat.setString(1, id);
			pstat.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	
	public List<Resume> queryAll(){
		List<Resume> list = new ArrayList<Resume>();
		this.setSql("select UUID,user_id,rname,sex,age,phone,happy,workyear,advantage,jobintension,jobaddr,intro from resume");
		Resume resume;
		try {
			pstat = connection.prepareStatement(getSql());
			ResultSet rs = pstat.executeQuery();
			while(rs.next()){
				resume = new Resume();
				resume.setUUID(rs.getString("UUID"));
				resume.setUser_id(rs.getString("user_id"));
				resume.setRname(rs.getString("rname"));
				resume.setSex(rs.getString("sex"));
				resume.setAge(rs.getInt("age"));
				resume.setPhone(rs.getString("phone"));
				resume.setHappy(rs.getString("happy"));
				resume.setWorkyear(rs.getString("workyear"));
				resume.setAdvantage(rs.getString("advantage"));
				resume.setJobintension(rs.getString("jobintension"));
				resume.setJobaddr(rs.getString("jobaddr"));
				resume.setIntro(rs.getString("intro"));
				

				list.add(resume);
				
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return null;
	}

	
	
	public List<Resume> queryAllByName(String rname){
		List<Resume> list = new ArrayList<Resume>();
		this.setSql("select UUID,user_id,rname,sex,age,phone,happy,workyear,advantage,jobintension,jobaddr,intro from resume where rname=?");
		Resume resume;
		try {
			pstat = connection.prepareStatement(getSql());
			pstat.setString(1, rname);
			ResultSet rs = pstat.executeQuery();
			while(rs.next()){
				resume = new Resume();
				resume.setUUID(rs.getString("UUID"));
				resume.setUser_id(rs.getString("user_id"));
				resume.setRname(rs.getString("rname"));
				resume.setSex(rs.getString("sex"));
				resume.setAge(rs.getInt("age"));
				resume.setPhone(rs.getString("phone"));
				resume.setHappy(rs.getString("happy"));
				resume.setWorkyear(rs.getString("workyear"));
				resume.setAdvantage(rs.getString("advantage"));
				resume.setJobintension(rs.getString("jobintension"));
				resume.setJobaddr(rs.getString("jobaddr"));
				resume.setIntro(rs.getString("intro"));
				

				list.add(resume);
				
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return null;
	}
	
	public void removeByUsername(String rname){
		this.setSql("delete from resume where rname=?");
		try {
			pstat = connection.prepareStatement(getSql());
			pstat.setString(1, rname);
			pstat.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
	
	public void save(List<Resume> list){
		
		for(Resume resume:list){
			this.setSql("insert into user values('"+resume.getUUID()+"','"+resume.getUser_id()+"','"+resume.getRname()+"','"+resume.getSex()+"',"+resume.getAge()+",'"+resume.getPhone()+"','"+resume.getHappy()+"','"+resume.getWorkyear()+"','"+resume.getAdvantage()+"','"+resume.getJobintension()+"','"+resume.getJobaddr()+"','"+resume.getIntro()+"');");
			try {
				this.pstat = this.connection.prepareStatement(this.getSql());
				this.pstat.addBatch();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		try {
			this.pstat.executeBatch();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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