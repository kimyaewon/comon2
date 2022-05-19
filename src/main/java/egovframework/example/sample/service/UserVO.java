package egovframework.example.sample.service;

public class UserVO{
	
	private String id;
	private String  username;
	private String paswsword;
	private String email;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPaswsword() {
		return paswsword;
	}
	public void setPaswsword(String paswsword) {
		this.paswsword = paswsword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", username=" + username + ", paswsword=" + paswsword + ", email=" + email + "]";
	}
	
}
	
	
