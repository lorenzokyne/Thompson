package testJSon;

public class Persona{
	private String id;
	private String team_id;
	private String name;
	private boolean deleted;
	private String color;
	private String real_name;
	private String tz;
	private String tz_label;
	private int tz_offset;
	public Profile profile;
	private boolean is_admin;
	private boolean is_owner;
	private boolean is_primary_owner;
	private boolean is_restricted;
	private boolean is_ultra_restricted;
	private boolean is_bot;
	private int updated;
	private boolean is_app_user;
	
	 public String getId() {
		 return id;
	 }
	 
	 public String getTeam_id() {
		 return team_id;
	 }
	 
	 public String getName() {
		 return name;
	 }
	 
	 public Boolean getDeleted() {
		 return deleted;
	 }
	 
	 public String getColor() {
		 return color;
	 }
	 
	 public String getReal_name() {
		 return real_name;
	 }
	 
	 public String getTz() {
		 return tz;
	 }
	 
	 public String getTz_label() {
		 return tz_label;
	 }
	 
	 public int getTz_offset() {
		 return tz_offset;
	 }
	 
	 public Profile getProfile() {
		 return profile;
	 }

	 public Boolean getIs_admin() {
		 return is_admin;
	 }
	 
	 public Boolean getIs_owner() {
		 return is_owner;
	 }
	 
	 public Boolean getIs_primary_owner() {
		 return is_primary_owner;
	 }
	 
	 public Boolean getIs_restricted() {
		 return is_restricted;
	 }
	 
	 public Boolean getIs_ultra_restricted() {
		 return is_ultra_restricted;
	 }
	 
	 public Boolean getIs_bot() {
		 return is_bot;
	 }
	 
	 public int getUpdated() {
		 return updated;
	 }
	 
	 public Boolean getIs_app_user() {
		 return is_app_user;
	 }
	
	public String toString() {
		return "id: "+id+"\nteam_id: "+team_id+"\nname: "+name+"\ndeleted: "+deleted+"\ncolor: "+color+"\nreal_name: "+real_name+"\ntz: "+tz+"\ntz_label: "+tz_label+"\ntz_offset: "+tz_offset+"\nprofile: {\n"+profile.toString()+"\n}"+"\nis_admin: "+is_admin+"\nis_owner: "+is_owner+"\nis_primary_owner: "+is_primary_owner+"\nis_restricted: "+is_restricted+"\nis_ultra_restricted: "+is_ultra_restricted+"\nis_bot: "+is_bot+"\nupdated: "+updated+"\nis_app_user: "+is_app_user;
	}
	
}