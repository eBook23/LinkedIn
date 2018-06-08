package controller;

import java.io.UnsupportedEncodingException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import bean.Company;
import bean.User;
import service.CompanyService;

public class CompanyController {
	
	CompanyService companyService = new CompanyService();
	
	public Company getCompany(HttpServletRequest request) throws UnsupportedEncodingException{  

		Company company = new Company();
		company.setCname(new String(request.getParameter("cname").getBytes("iso-8859-1"),"UTF-8"));
		company.setManager(request.getParameter("manager"));
		company.setPosition(request.getParameter("position"));
		company.setPhone(request.getParameter("phone"));
		company.setTime(request.getParameter("time"));
		company.setCountpeople(Integer.parseInt(request.getParameter("countpeople")));
		company.setUUID(request.getParameter("cno")==null?UUID.randomUUID().toString():request.getParameter("cno"));
		return company;
	}
	
	public String listByName(HttpServletRequest request) {
		request.setAttribute("companys",this.companyService.getByName(request.getParameter("cname")));
		return "/WEB-INF/content/admin/company/company-list.jsp";
	}
	
	public String list(HttpServletRequest request) {
		request.setAttribute("companys",this.companyService.queryAll());
		return "/WEB-INF/content/admin/company/company-list.jsp";
	}
	public String toadd(HttpServletRequest request) {
		return "/WEB-INF/content/admin/company/company-add.jsp";
	}
	public String add(HttpServletRequest request) throws UnsupportedEncodingException{
		companyService.add(getCompany(request));
		return "list";
	}	
	public String remove(HttpServletRequest request) {
		companyService.remove(request.getParameter("cno"));
		return "list";
	}
	public String getByName(HttpServletRequest request) {
	
		return "listByName?cname="+request.getParameter("cname");
	}	
	
	public String get(HttpServletRequest request) {
		request.setAttribute("company", companyService.get(request.getParameter("cno")));
		return "/WEB-INF/content/admin/company/company-edit.jsp";
	}	

	public String update(HttpServletRequest request) throws UnsupportedEncodingException{
		Company company = this.getCompany(request);
		companyService.update(company); 
		return "list";
	}
	
}
