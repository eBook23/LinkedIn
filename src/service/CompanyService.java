package service;

import java.sql.Connection;
import java.util.List;

import bean.Company;
import dao.CompanyDao;
import tools.DbUtil;

public class CompanyService {
	CompanyDao companyDao=new CompanyDao();

	


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
	
	public List<Company> getByName(String name){
		return companyDao.getByName(name);
	}
}
