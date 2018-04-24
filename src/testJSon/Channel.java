package testJSon;

public class Channel {
	private String id;
	private String name;
	private String created;
	private String creator;
	private boolean is_archived;
	private boolean is_general;
	private String members[];
	private Topic topic;
	private Purpose purpose;
	
	public String getID() {
		return id;
	}
	
	public String getName(){
		return name;
	}
	public String getCreated() {
		return creator;
	}
	public boolean getIS_archived() {
		return is_archived;
	}
	public boolean getIs_general() {
		return is_general;
	}
	public String[] getMembers(){
		return members;
	}
	public Topic getTopic() {
		return topic;
	}
	public Purpose getPurpose() {
		return purpose;
	}
	
	public String toString() {
	return "id: "+id+"\nname: "+name+"\ncreated: "+created+"\ncreator: "+creator+"\nis_archived"+is_archived+"is_general"+is_general+"\nmembers: [\n"+members.toString()+"]"+"{\ntopic: \n"+topic.toString()+"}"+"\npurpose: {\n"+purpose.toString()+"}";
	}
}
	
