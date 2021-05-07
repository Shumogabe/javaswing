package mvc;

public class registerDTO {
	private String user, pass, phone, email;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
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

	public registerDTO() {
		super();
	}

	public registerDTO(String user, String pass, String phone, String email) {
		super();
		this.user = user;
		this.pass = pass;
		this.phone = phone;
		this.email = email;
	}
	
}
