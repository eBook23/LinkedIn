package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import bean.Company;
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
	//查找所有公司
	@Test
	public void testQueryAll() {
		List<Company> list= companyService.queryAll();
		for(Company c:list){
			System.out.println(c);
		}
	}

	//添加公司
	@Test
	public void testAdd() {
		Company company = new Company();
		company.setUUID("1234");
		company.setCname("shanghai");
		company.setPosition("china zhongxin ");
		companyService.add(company);
	}
	//通过ID删除公司
	@Test
	public void testRemove() {
		companyService.remove("1234");
	}
	//通过公司名删除公司
	@Test
	public void testRemoveByCompanyName() {
		companyService.removeByCompanyName("shanghai");
	}
	//通过ID查询信息
	@Test
	public void testGet() {
		Company c= companyService.get("1234");
		System.out.println("cname:  "+c.getCname());
	}
	//更新公司
	@Test
	public void testUpdate() {
		Company c =companyService.get("1234");
		c.setCname("shengzheng");
		companyService.update(c);
	}
	//通过名称查找公司
	@Test
	public void testQueryAllByName() {
		List<Company> list= companyService.queryAllByName("shanghai");
				for(Company c:list){
					System.out.println(c);
				}

	}

}
