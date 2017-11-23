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
	//�������й�˾
	@Test
	public void testQueryAll() {
		List<Company> list= companyService.queryAll();
		for(Company c:list){
			System.out.println(c);
		}
	}

	//��ӹ�˾
	@Test
	public void testAdd() {
		Company company = new Company();
		company.setUUID("1234");
		company.setCname("shanghai");
		company.setPosition("china zhongxin ");
		companyService.add(company);
	}
	//ͨ��IDɾ����˾
	@Test
	public void testRemove() {
		companyService.remove("1234");
	}
	//ͨ����˾��ɾ����˾
	@Test
	public void testRemoveByCompanyName() {
		companyService.removeByCompanyName("bailangtao");
	}
	//ͨ��ID��ѯ��Ϣ
	@Test
	public void testGet() {
		Company c= companyService.get("1234");
		System.out.println("cname:  "+c.getCname());
	}
	//���¹�˾
	@Test
	public void testUpdate() {
		Company c =companyService.get("1234");
		c.setCname("shengzheng");
		companyService.update(c);
	}
	//ͨ�����Ʋ��ҹ�˾
	@Test
	public void testQueryAllByName() {
		List<Company> list= companyService.queryAllByName("shanghai");
				for(Company c:list){
					System.out.println(c);
				}

	}

}
