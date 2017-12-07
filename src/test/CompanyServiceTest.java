package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import bean.Company;
import bean.Post;
import bean.User;

import service.CompanyService;
import service.UserService;

/**
 * @author di
 *
 */
public class CompanyServiceTest {
	CompanyService companyService;
	
	@Before
	public void init(){
		companyService=new CompanyService();
	}

	@Before
	public void setUp() throws Exception {
	}

	/**
	 * 
	 */
	@Test
	public void testCompanyService() {
		fail("Not yet implemented");
	}
	//锟斤拷锟斤拷锟斤拷锟叫癸拷司
	@Test
	public void testQueryAll() {
		List<Company> list= companyService.queryAll();
		for(Company c:list){
			System.out.println(c.toString());
		}
	}

	//锟斤拷庸锟剿�
	@Test
	public void testAdd() {
		Company company = new Company();
		company.setUUID("1234");
		company.setCname("taobao");
		company.setManager("mayun");
		company.setPosition("shanghai");
		company.setPhone("0472-8888888");
		company.setTime("123");
		company.setCountpeople(10000);
		companyService.add(company);
	}
	//通锟斤拷ID删锟斤拷锟斤拷司
	@Test
	public void testRemove() {
		companyService.remove("1234");
	}
	//通锟斤拷锟斤拷司锟斤拷删锟斤拷锟斤拷司
	@Test
	public void testRemoveByCompanyName() {
		companyService.removeByCompanyName("bailangtao");
	}
	//通锟斤拷ID锟斤拷询锟斤拷息
	@Test
	public void testGet() {
		Company c= companyService.get("1234");
		System.out.println("cname:  "+c.getCname());
	}
	//锟斤拷锟铰癸拷司
	@Test
	public void testUpdate() {
		Company c =companyService.get("1234");
		c.setCname("lskdjflaskdjf");
		companyService.update(c);
	}
	//通锟斤拷锟斤拷锟狡诧拷锟揭癸拷司
	@Test
	public void testGetByName() {
		List<Company> list= companyService.getByName("dafsd");
		for(Company c:list){
			System.out.println(c.toString());
		}
	}

}
