package service;

import java.sql.Connection;
import java.util.List;

import dao.CPostDao;
import tools.DbUtil;

public class CPostService {
	Connection connection;
	CPostDao CpDao;

	
	public CPostService(){
		connection = DbUtil.getInstance().getConnection();
		companyDao = new CompanyDao();
		companyDao.setConnection(connection);
	}

	public List<Company> queryAll(){
		return companyDao.queryAll();
		
	}
	
	
	public void add(Company company){
		companyDao.save(company);
		
	}
	
	public void remove(String id){
		companyDao.remove(id);
	
	}
	public void removeByCompanyName(String cname){
		companyDao.removeByCompanyname(cname);
	}
	
	public Company get(String id){
		return companyDao.get(id);
	
	}
	
	public void update(Company company){
		
		companyDao.updateCompany(company);
	}
	
	public List<Company> queryAllByName(String name){
		return companyDao.queryAllByName(name);
		
	}
}
