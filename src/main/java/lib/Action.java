package lib;

import java.io.Serializable;

import enums.Actions;

@SuppressWarnings("serial")
public class Action implements Serializable{
	
	private Actions name;

	public Action(Actions name) {
		super();
		this.name = name;
	}

	public Actions getName() {
		return name;
	}

	public void setName(Actions name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Action [name=" + name + "]";
	}
	
	

}
