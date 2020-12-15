package lib;

import java.io.Serializable;

@SuppressWarnings("serial")
public class User implements Serializable{

	private String name;

	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
	
}
