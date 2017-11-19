package service;

import java.sql.Connection;
import java.util.List;

import bean.Resume;
import dao.ResumeDao;
import tools.DbUtil;

public class ResumeService {
	Connection connection;
	ResumeDao resumeDao;

	
	public ResumeService(){
		connection = DbUtil.getInstance().getConnection();
		resumeDao = new ResumeDao();
		resumeDao.setConnection(connection);
	}

	public List<Resume> queryAll(){
		return resumeDao.queryAll();
		
	}
	
	
	public void add(Resume resume){
		resumeDao.save(resume);
		
	}
	
	public void remove(String id){
		resumeDao.remove(id);
	
	}
	
	public Resume get(String id){
		return resumeDao.get(id);
	
	}
	
	public void update(Resume resume){
		
		//DataBase.updateStudent(student);
	}
	
	public List<Resume> queryAllByName(String rname){
		return resumeDao.queryAllByName(rname);
		
	}
}
