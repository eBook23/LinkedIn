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
		this.setSql("insert into resume values('"+resume.getUUID()+"','"+resume.getUserid()+"','"+resume.getRname()+"','"+resume.getSex()+"','"+resume.getPicture()+"','"+resume.getBirthday()+"','"+resume.getNation()+"','"+resume.getMajor()+"','"+resume.getWorkexperience()+"','"+resume.getEmail()+"','"+resume.getPhone()+"','"+resume.getHappy()+"','"+resume.getEducation()+"','"+resume.getAdvantage()+"','"+resume.getJobintension()+"','"+resume.getJobaddr()+"','"+resume.getHonor()+"');");
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
		this.setSql("select * from resume where UUID=?");
		Resume resume = new Resume();
		try {
			pstat = connection.prepareStatement(getSql());
			pstat.setString(1, id);
			ResultSet rs = pstat.executeQuery();
			while(rs.next()){
				resume.setUUID(rs.getString("UUID"));
				resume.setUserid(rs.getString("userid"));
				resume.setRname(rs.getString("rname"));
				resume.setSex(rs.getString("sex"));
				resume.setPicture(rs.getString("picture"));
				resume.setBirthday(rs.getString("birthday"));
				resume.setNation(rs.getString("nation"));
				resume.setMajor(rs.getString("major"));
				resume.setWorkexperience(rs.getString("workexperience"));
				resume.setEmail(rs.getString("email"));
				resume.setPhone(rs.getString("phone"));
				resume.setHappy(rs.getString("happy"));
				resume.setEducation(rs.getString("education"));
				resume.setAdvantage(rs.getString("advantage"));
				resume.setJobintension(rs.getString("jobintension"));
				resume.setJobaddr(rs.getString("jobaddr"));
				resume.setHonor(rs.getString("honor"));
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
		this.setSql("select * from resume");
		Resume resume;
		try {
			pstat = connection.prepareStatement(getSql());
			ResultSet rs = pstat.executeQuery();
			while(rs.next()){
				resume = new Resume();
				resume.setUUID(rs.getString("UUID"));
				resume.setUserid(rs.getString("userid"));
				resume.setRname(rs.getString("rname"));
				resume.setSex(rs.getString("sex"));
				resume.setPicture(rs.getString("picture"));
				resume.setBirthday(rs.getString("birthday"));
				resume.setNation(rs.getString("nation"));
				resume.setMajor(rs.getString("major"));
				resume.setWorkexperience(rs.getString("workexperience"));
				resume.setEmail(rs.getString("email"));
				resume.setPhone(rs.getString("phone"));
				resume.setHappy(rs.getString("happy"));
				resume.setEducation(rs.getString("education"));
				resume.setAdvantage(rs.getString("advantage"));
				resume.setJobintension(rs.getString("jobintension"));
				resume.setJobaddr(rs.getString("jobaddr"));
				resume.setHonor(rs.getString("honor"));
				list.add(resume);
				
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return null;
	}
	
	public List<Resume> queryAllByUserId(String userid){
		List<Resume> list = new ArrayList<Resume>();
		this.setSql("select * from resume where userid=?");
		Resume resume;
		try {
			pstat = connection.prepareStatement(getSql());
			pstat.setString(1, userid);
			ResultSet rs = pstat.executeQuery();
			while(rs.next()){
				resume = new Resume();
				resume.setUUID(rs.getString("UUID"));
				resume.setUserid(rs.getString("userid"));
				resume.setRname(rs.getString("rname"));
				resume.setSex(rs.getString("sex"));
				resume.setPicture(rs.getString("picture"));
				resume.setBirthday(rs.getString("birthday"));
				resume.setNation(rs.getString("nation"));
				resume.setMajor(rs.getString("major"));
				resume.setWorkexperience(rs.getString("workexperience"));
				resume.setEmail(rs.getString("email"));
				resume.setPhone(rs.getString("phone"));
				resume.setHappy(rs.getString("happy"));
				resume.setEducation(rs.getString("education"));
				resume.setAdvantage(rs.getString("advantage"));
				resume.setJobintension(rs.getString("jobintension"));
				resume.setJobaddr(rs.getString("jobaddr"));
				resume.setHonor(rs.getString("honor"));
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
		this.setSql("select * from resume where rname=?");
		Resume resume;
		try {
			pstat = connection.prepareStatement(getSql());
			pstat.setString(1, rname);
			ResultSet rs = pstat.executeQuery();
			while(rs.next()){
				resume = new Resume();
				resume.setUUID(rs.getString("UUID"));
				resume.setUserid(rs.getString("userid"));
				resume.setRname(rs.getString("rname"));
				resume.setSex(rs.getString("sex"));
				resume.setPicture(rs.getString("picture"));
				resume.setBirthday(rs.getString("birthday"));
				resume.setNation(rs.getString("nation"));
				resume.setMajor(rs.getString("major"));
				resume.setWorkexperience(rs.getString("workexperience"));
				resume.setEmail(rs.getString("email"));
				resume.setPhone(rs.getString("phone"));
				resume.setHappy(rs.getString("happy"));
				resume.setEducation(rs.getString("education"));
				resume.setAdvantage(rs.getString("advantage"));
				resume.setJobintension(rs.getString("jobintension"));
				resume.setJobaddr(rs.getString("jobaddr"));
				resume.setHonor(rs.getString("honor"));
				list.add(resume);
				
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return null;
	}
	
	public void removeByResumename(String rname){
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
			this.setSql("insert into resume values('"+resume.getUUID()+"','"+resume.getUserid()+"','"+resume.getRname()+"','"+resume.getSex()+"','"+resume.getPicture()+"','"+resume.getBirthday()+"','"+resume.getNation()+"','"+resume.getMajor()+"','"+resume.getWorkexperience()+"','"+resume.getEmail()+"','"+resume.getPhone()+"','"+resume.getHappy()+"','"+resume.getEducation()+"','"+resume.getAdvantage()+"','"+resume.getJobintension()+"','"+resume.getJobaddr()+"','"+resume.getHonor()+"');");
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
	public void updateResume(Resume resume){
		remove(resume.getUUID());
		save(resume);
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