package controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import bean.Resume;
import service.ResumeService;
import sun.print.resources.serviceui;

public class ResumeController {
	ResumeService resumeService = new ResumeService();
	
	public Resume getResume(HttpServletRequest request) {
		Resume resume = new Resume();
		resume.setUserid(request.getParameter("userid"));
		resume.setRname(request.getParameter("rname"));
		resume.setSex(request.getParameter("sex"));
		resume.setPicture(request.getParameter("picture"));
		resume.setBirthday(request.getParameter("birthday"));
		resume.setNation(request.getParameter("nation"));
		resume.setMajor(request.getParameter("major"));
		resume.setWorkexperience(request.getParameter("workexperience"));
		resume.setEmail(request.getParameter("email"));
		resume.setPhone(request.getParameter("phone"));
		resume.setHappy(request.getParameter("happy"));
		resume.setEducation(request.getParameter("education"));
		resume.setAdvantage(request.getParameter("advantage"));
		resume.setJobintension(request.getParameter("jobintension"));
		resume.setJobaddr(request.getParameter("jobaddr"));
		resume.setHonor(request.getParameter("honor"));
		resume.setUUID(request.getParameter("rno")==null?UUID.randomUUID().toString():request.getParameter("rno"));
		return resume;
	}
	
//	public String listById(HttpServletRequest request) {
//		request.setAttribute("resumes", this.resumeService.queryAllByUserId(request.getParameter("rno")));
//		System.out.println( this.resumeService.queryAllByUserId(request.getParameter("userid")));
//		return "/WEB-INF/content/admin/resume/resume-list.jsp";
//	}
	
	public String list(HttpServletRequest request) {
		request.setAttribute("resumes", this.resumeService.queryAllByUserId(request.getParameter("userid")));
		System.out.println( this.resumeService.queryAllByUserId(request.getParameter("userid")));
		return "/WEB-INF/content/admin/resume/resume-list.jsp";
	}
	public String toadd(HttpServletRequest request) {
		request.setAttribute("userid", request.getParameter("userid"));
		return "/WEB-INF/content/admin/resume/resume-add.jsp";
	}
	public String add(HttpServletRequest request) {
		Resume resume = this.getResume(request);
		resumeService.add(this.getResume(request));
		return "list?userid="+resume.getUserid();
	}
	public String remove(HttpServletRequest request) {
		resumeService.remove(request.getParameter("rno"));
		return "list?userid="+request.getParameter("userid");
	}
	public String getByName(HttpServletRequest request) {
		request.setAttribute("resumes", this.resumeService.getByName(request.getParameter("rname")));
		return "list";
	}
	public String get(HttpServletRequest request) {
		request.setAttribute("resume", this.resumeService.get(request.getParameter("rno")));
		return "/WEB-INF/content/admin/resume/resume-edit.jsp";
	}
	public String update(HttpServletRequest request) {
		Resume resume = this.getResume(request);
		this.resumeService.update(resume);
		return "list?userid="+resume.getUserid();
	}
	
}
