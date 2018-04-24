package testJSon;

public class Purpose {
	private String value;
	private String creator;
	private String last_set;
	
	public String getValue() {
		return value;
	}
	public String getCreator() {
		return creator;
	}
	public String getLast_set() {
		return last_set;
	}
	public String toString() {
		return ("	value: "+value+"	creator: "+creator+"	last_set: "+last_set);
	}
}
