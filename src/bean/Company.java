package bean;

public class Company {
	private String UUID;
	private String cname;
	private String manager;
	private String position;
	private String phone;
	private String time;
	private int countpeople;
	public String getUUID() {
		return UUID;
	}
	public void setUUID(String uUID) {
		UUID = uUID;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getCountpeople() {
		return countpeople;
	}
	public void setCountpeople(int countpeople) {
		this.countpeople = countpeople;
	}
	@Override
	public String toString() {
		return "Company [UUID=" + UUID + ", cname=" + cname + ", manager=" + manager + ", position=" + position
				+ ", phone=" + phone + ", time=" + time + ", countpeople=" + countpeople + "]";
	}
	
	
	
}
