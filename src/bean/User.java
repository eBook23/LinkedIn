package bean;

public class User {
	private String UUID;
	private String username;
	private String password;
	private String sex;
	private String phone;
	private String email;
	private String time;
	private int power;
	public String getUUID() {
		return UUID;
	}
	public void setUUID(String uUID) {
		UUID = uUID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTime() {
		return time;
	}
	@Override
	public String toString() {
		return "User [UUID=" + UUID + ", username=" + username + ", password="
				+ password + ", sex=" + sex + ", phone=" + phone + ", email="
				+ email + ", time=" + time + ", power=" + power + "]";
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
}
