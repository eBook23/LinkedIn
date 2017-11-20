package service;

import java.sql.Connection;
import java.util.List;

import bean.Company_post;

import dao.Company_PostDao;
import tools.DbUtil;

public class Company_PostService {
	Connection connection;
	Company_PostDao cpDao;

	
	public Company_PostService(){
		connection = DbUtil.getInstance().getConnection();
		cpDao = new Company_PostDao();
		cpDao.setConnection(connection);
	}

	public List<Company_post> queryAll(){
		return cpDao.queryAll();
		
	}
	
	
	public void add(Company_post cpost){
		cpDao.save(cpost);
		
	}
	
	public void remove(String id){
		cpDao.remove(id);
	
	}
	public void removeByCompanyId(String cid){
		cpDao.removeByCompanyId(cid);
	}
	
	public Company_post get(String id){
		return cpDao.get(id);
	
	}
	
	public void update(Company_post cpost){
		
		cpDao.updateCompany_post(cpost);
	}
	
	public List<Company_post> queryAllByPostId(String pid){
		return cpDao.queryAllByPostId(pid);
		
	}
}
