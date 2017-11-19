package service;

import java.sql.Connection;
import java.util.List;

import bean.Company;
import dao.CompanyDao;
import tools.DbUtil;

public class CompanyService {
	Connection connection;
	CompanyDao companyDao;

	
	public CompanyService(){
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
	
	public Company get(String id){
		return companyDao.get(id);
	
	}
	
	public void update(Company company){
		
		//DataBase.updateStudent(student);
	}
	
	public List<Company> queryAllByName(String name){
		return companyDao.queryAllByName(name);
		
	}
}
