package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import bean.Company;
import bean.Resume;
import service.CompanyService;
import service.ResumeService;

public class ResumeServiceTest {

	ResumeService resumeService = new ResumeService();
	@Before
	public void init(){
		resumeService=new ResumeService();
	}
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testResumeService() {
		fail("Not yet implemented");
	}

	@Test
	public void testQueryAll() {
		List<Resume> list= resumeService.queryAll();
		for(Resume r:list){
			System.out.println(r);
		}
	}

	@Test
	public void testAdd() {
		Resume resume = new Resume();
		resume.setUUID("2001");
	
		resume.setRname("白浪涛");
		resume.setSex("男");

		resume.setPhone("123456789");
		resume.setHappy("抽烟");

		resume.setAdvantage("12");
		resume.setJobintension("java");
		resume.setJobaddr("hhht");

		resumeService.add(resume);
	}

	@Test
	public void testRemove() {
		resumeService.remove("2001");
	}

	@Test
	public void testRemoveByResumeName() {
		resumeService.removeByResumeName("白浪涛");
	}

	@Test
	public void testGet() {
		Resume r= resumeService.get("2001");
		System.out.println(r);
	}

	@Test
	public void testUpdate() {
		Resume r =resumeService.get("2001");
		r.setRname("bailangtao");
		resumeService.update(r);
	}

	@Test
	public void testQueryAllByName() {
		List<Resume> list= resumeService.getByName("bailangtao");
		for(Resume r:list){
			System.out.println(r);
		}
	}

}
