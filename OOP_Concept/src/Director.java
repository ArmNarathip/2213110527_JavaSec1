
public class Director {
	private String name;
	private String email;
	private char gender;
	public Director(String name,String email,char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public Director(String name,String email) {
		this.name = name;
		this.email = email;
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	public String getGenderName() {
		if(gender == 'M') {
			return "Male";
		}
		else if(gender == 'm') {
			return "Male";
		}
		else if(gender == 'F') {
			return "Female";
		}
		else if(gender == 'f') {
			return "Female";
		}
		return null;
	}
	public String toString() {
		return getName()+"("+getEmail()+";"+getGenderName()+")";
	}
	
}
