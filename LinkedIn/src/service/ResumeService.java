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
	
	
	public void removeByResumeName(String rname){
		resumeDao.removeByResumename(rname);
	}
	
	public Resume get(String id){
		return resumeDao.get(id);
	
	}
	
	public void update(Resume resume){
		resumeDao.updateResume(resume);
	}
	
	public List<Resume> queryAllByUserId(String userid){
		return resumeDao.queryAllByUserId(userid);
	}
	
	public List<Resume> getByName(String rname){
		return resumeDao.queryAllByName(rname);
	}
}
