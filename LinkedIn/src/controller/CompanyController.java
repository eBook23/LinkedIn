package controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import bean.Company;
import bean.User;
import service.CompanyService;

public class CompanyController {
	CompanyService companyService = new CompanyService();
	
	public Company getCompany(HttpServletRequest request) {
		Company company = new Company();
		company.setCname(request.getParameter("cname"));
		company.setManager(request.getParameter("manager"));
		company.setPosition(request.getParameter("position"));
		company.setPhone(request.getParameter("phone"));
		company.setTime(request.getParameter("time"));
		company.setCountpeople(Integer.parseInt(request.getParameter("countpeople")));
		company.setUUID(request.getParameter("cno")==null?UUID.randomUUID().toString():request.getParameter("cno"));
		return company;
	}
	
	public String list(HttpServletRequest request) {
		request.setAttribute("companys",this.companyService.queryAll());
		return "/WEB-INF/content/company/company-list.jsp";
	}
	public String toadd(HttpServletRequest request) {
		return "/WEB-INF/content/company/company-add.jsp";
	}
	public String add(HttpServletRequest request) {
		companyService.add(getCompany(request));
		return "list";
	}	
	public String remove(HttpServletRequest request) {
		companyService.remove(request.getParameter("cno"));
		return "list";
	}
	public String getByName(HttpServletRequest request) {
		request.setAttribute("companys",this.companyService.getByName(request.getParameter("cname")));
		return "list";
	}	
	
	public String get(HttpServletRequest request) {
		request.setAttribute("company", companyService.get(request.getParameter("cno")));
		return "/WEB-INF/content/company/company-edit.jsp";
	}	

	public String update(HttpServletRequest request) {
		Company company = this.getCompany(request);
		companyService.update(company); 
		return "list";
	}
	
}
