package bean;

public class Resume {
	private String UUID;
	private String userid;
	private String rname;
	private String sex;
	private String picture;
	private String birthday;
	private String nation;
	private String major;
	private String workexperience;
	private String email;
	private String phone;
	private String happy;
	private String education;
	private String advantage;
	private String jobintension;
	private String jobaddr;
	private String honor;
	public String getUUID() {
		return UUID;
	}
	public void setUUID(String uUID) {
		UUID = uUID;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getWorkexperience() {
		return workexperience;
	}
	public void setWorkexperience(String workexperience) {
		this.workexperience = workexperience;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getHappy() {
		return happy;
	}
	public void setHappy(String happy) {
		this.happy = happy;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getAdvantage() {
		return advantage;
	}
	public void setAdvantage(String advantage) {
		this.advantage = advantage;
	}
	public String getJobintension() {
		return jobintension;
	}
	public void setJobintension(String jobintension) {
		this.jobintension = jobintension;
	}
	public String getJobaddr() {
		return jobaddr;
	}
	public void setJobaddr(String jobaddr) {
		this.jobaddr = jobaddr;
	}
	public String getHonor() {
		return honor;
	}
	public void setHonor(String honor) {
		this.honor = honor;
	}
	@Override
	public String toString() {
		return "Resume [UUID=" + UUID + ", userid=" + userid + ", rname=" + rname + ", sex=" + sex + ", picture="
				+ picture + ", birthday=" + birthday + ", nation=" + nation + ", major=" + major + ", workexperience="
				+ workexperience + ", email=" + email + ", phone=" + phone + ", happy=" + happy + ", education="
				+ education + ", advantage=" + advantage + ", jobintension=" + jobintension + ", jobaddr=" + jobaddr
				+ ", honor=" + honor + "]";
	}
	
}
